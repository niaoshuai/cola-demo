package com.alibaba.demo.dto;

import com.alibaba.cola.dto.Query;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author niaoshuai
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerListByNameQry extends Query {
    private String name;
}
