package com.bohniman.eftapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bohniman.eftapi.model.TransNotification;

public interface NotificationRepository  extends JpaRepository<TransNotification, Long> {

}
