package gt.core.controller;

import gt.core.dto.Customer;
import gt.core.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService service;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){

        return service.addCustomer(customer);
    }
    @GetMapping
    public List<Customer> getCustomers(){
        return service.getCustomers();
    }

    @GetMapping
    public Customer getCustomer(int id){
        return service.getCustomer(id);
    }

}
