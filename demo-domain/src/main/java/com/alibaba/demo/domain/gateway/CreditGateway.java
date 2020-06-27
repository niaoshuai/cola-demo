package com.alibaba.demo.domain.gateway;

import com.alibaba.demo.domain.customer.Credit;

/**
 * Assume that the credit info is in antoher distributed Service
 *
 * @author niaoshuai
 */
public interface CreditGateway {
    /**
     * .
     *
     * @param customerId
     * @return
     */
    Credit getCredit(String customerId);
}
