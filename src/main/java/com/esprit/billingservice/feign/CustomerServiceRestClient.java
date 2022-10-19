package com.esprit.billingservice.feign;

import com.esprit.billingservice.entities.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "EMPLOYEE-SERVICE")
public interface CustomerServiceRestClient {
    @GetMapping(path="/api/employees/{id}")
    Customer customerById(@PathVariable String id);

    @GetMapping(path="/api/employees")
    List<Customer> customers();
}
