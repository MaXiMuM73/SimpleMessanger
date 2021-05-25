package ru.sunoplyaandesin.simplemessenger.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sunoplyaandesin.simplemessenger.domain.RoomRole;

@Repository
public interface RoomRoleRepository extends CrudRepository<RoomRole, Long> {
}