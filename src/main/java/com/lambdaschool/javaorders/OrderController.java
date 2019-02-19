package com.lambdaschool.javaorders;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.repository.AgentsRepository;
import com.lambdaschool.javaorders.repository.CustomerRepository;
import com.lambdaschool.javaorders.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    AgentsRepository agentRepo;

    @Autowired
    CustomerRepository custRepo;

    @Autowired
    OrdersRepository orderRepo;

    @GetMapping("/customer")
    public List<Customer> allCustomers() {
        return custRepo.findAll();
    }

}
