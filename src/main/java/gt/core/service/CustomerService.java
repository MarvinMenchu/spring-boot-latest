package gt.core.service;

import gt.core.dto.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customerList = new ArrayList<>();

    public Customer addCustomer(Customer customer){
        customerList.add(customer);
        return customer;
    }

    public List<Customer> getCustomers(){
        return customerList;
    }

    public Customer getCustomer(int id){
        return customerList.stream().filter(customer -> customer.id() == id)
                .findAny().orElseThrow(()->new RuntimeException("Customer not found with id " + id));
    }
}
