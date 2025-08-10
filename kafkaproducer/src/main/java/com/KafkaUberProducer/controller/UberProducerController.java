package com.KafkaUberProducer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KafkaUberProducer.entity.RideDTO;
import com.KafkaUberProducer.service.RideProducerService;



@RestController
@RequestMapping("/rides")
public class UberProducerController {
	
	private final RideProducerService producerService;

     public UberProducerController(RideProducerService producerService) {
        this.producerService = producerService;
    }

     
     @PostMapping
     public ResponseEntity<String> create(@RequestBody RideDTO ride) throws Exception {
         ride.setOperation("CREATE");
         producerService.sendMessage(ride);
         return ResponseEntity.ok("Ride create request sent to Kafka");
     }

     @PutMapping("/{id}")
     public ResponseEntity<String> update(@PathVariable int id, @RequestBody RideDTO dto) throws Exception {
         dto.setId(id);
         dto.setOperation("UPDATE");
         producerService.sendMessage(dto);
         return ResponseEntity.ok("Ride update request sent to Kafka");
     }

     @DeleteMapping("/{id}")
     public ResponseEntity<String> delete(@PathVariable int id) throws Exception {
        RideDTO ride = new RideDTO();
         ride.setId(id);
         ride.setOperation("DELETE");
         producerService.sendMessage(ride);
         return ResponseEntity.ok("Ride delete request sent to Kafka");
     }
     
}
