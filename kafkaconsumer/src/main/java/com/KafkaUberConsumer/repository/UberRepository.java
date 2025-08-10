package com.KafkaUberConsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.KafkaUberConsumer.entity.Ride;

@Repository
public interface UberRepository extends JpaRepository<Ride, Integer>
{

}
