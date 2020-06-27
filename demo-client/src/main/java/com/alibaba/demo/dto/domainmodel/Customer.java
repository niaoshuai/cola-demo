package com.alibaba.demo.dto.domainmodel;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author niaoshuai
 */
@Data
public class Customer {
    private String customerId;
    private String memberId;
    private String customerName;
    private String customerType;
    @NotEmpty
    private String companyName;
    @NotEmpty
    private String source;
}
