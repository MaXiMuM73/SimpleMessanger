package ru.sunoplyaandesin.simplemessenger.dto;

import lombok.Data;
import ru.sunoplyaandesin.simplemessenger.domain.Message;

import java.util.Date;


@Data
public class MessageDTO {

    private long id;

    private Date createdDate;

    private String text;

    private long userId;

    private long roomId;

    public static MessageDTO from(Message message) {
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setId(message.getId());
        messageDTO.setCreatedDate(message.getCreatedDate());
        messageDTO.setText(message.getText());
        messageDTO.setUserId(message.getUser().getId());
        messageDTO.setRoomId(message.getRoom().getId());
        return messageDTO;
    }

    public Message toMessage() {
        return Message.builder()
                .id(this.id)
                .createdDate(this.createdDate)
                .text(this.text)
                .build();
    }
}