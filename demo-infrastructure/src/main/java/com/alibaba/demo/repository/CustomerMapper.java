package com.alibaba.demo.repository;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author niaoshuai
 */
@Mapper
public interface CustomerMapper {

    /**
     * .
     *
     * @param customerId
     * @return
     */
    CustomerDO getById(String customerId);
}
