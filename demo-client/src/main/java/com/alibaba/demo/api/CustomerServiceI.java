package com.alibaba.demo.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.demo.dto.CustomerAddCmd;
import com.alibaba.demo.dto.CustomerListByNameQry;
import com.alibaba.demo.dto.domainmodel.Customer;

/**
 * @author niaoshuai
 */
public interface CustomerServiceI {

    /**
     * .
     *
     * @param customerAddCmd
     * @return
     */
    Response addCustomer(CustomerAddCmd customerAddCmd);

    /**
     * .
     *
     * @param customerListByNameQry
     * @return
     */
    MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry);
}
