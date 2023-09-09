package com.MessengerManagement.messengerManagement.adapters.driven.repository;

import com.MessengerManagement.messengerManagement.adapters.driven.entity.PackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMessengerRepository extends JpaRepository<PackageEntity, Long> {

}
