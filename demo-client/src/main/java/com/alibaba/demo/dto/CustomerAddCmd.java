package com.alibaba.demo.dto;

import com.alibaba.cola.dto.Command;
import com.alibaba.demo.dto.domainmodel.Customer;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author niaoshuai
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerAddCmd extends Command {

    private Customer customer;

}
