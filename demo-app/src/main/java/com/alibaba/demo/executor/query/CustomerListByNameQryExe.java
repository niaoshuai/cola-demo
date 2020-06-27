package com.alibaba.demo.executor.query;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.demo.dto.CustomerListByNameQry;
import com.alibaba.demo.dto.domainmodel.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @author niaoshuai
 */
@Component
public class CustomerListByNameQryExe {

    public MultiResponse<Customer> execute(CustomerListByNameQry cmd) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setCustomerName("Frank");
        customerList.add(customer);
        return MultiResponse.ofWithoutTotal(customerList);
    }
}
