package com.controllerfiles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootprograms.CustomerRest;

@RestController
@RequestMapping("/springrest")
public class CustomerRestController {

    @GetMapping("/customers")
    public List<CustomerRest> getCustomers() {
        List<CustomerRest> list = new ArrayList<>();

        list.add(new CustomerRest(101, "Satya", "Sai", "satya@gmail.com", "121-232-3435", 1467240235069L));
        list.add(new CustomerRest(201, "Naga", "Srujan", "naga@gmail.com", "343-545-2345", 1467240235069L));
        list.add(new CustomerRest(301, "Kiran", "Kumar", "kiran@gmail.com", "876-237-2897", 1467240235069L));

        return list;
    }
}