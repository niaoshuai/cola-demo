package com.alibaba.demo.domain.gateway;

import com.alibaba.demo.domain.customer.Customer;

/**
 * @author niaoshuai
 */
public interface CustomerGateway {

    /**
     * .
     *
     * @param customerId
     * @return
     */
    Customer getByById(String customerId);
}
