package com.alibaba.demo.repository;

import lombok.Data;

/**
 * @author niaoshuai
 */
@Data
public class CustomerDO {
    private String customerId;
    private String memberId;
    private String globalId;
    private Long registeredCapital;
    private String companyName;
}
