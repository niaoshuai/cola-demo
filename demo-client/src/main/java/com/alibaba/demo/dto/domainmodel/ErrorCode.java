package com.alibaba.demo.dto.domainmodel;

import com.alibaba.cola.dto.ErrorCodeI;

/**
 * @author niaoshuai
 */
public enum ErrorCode implements ErrorCodeI {
    // .
    B_CUSTOMER_companyNameConflict("B_CUSTOMER_companyNameConflict", "客户公司名冲突");

    private final String errCode;
    private final String errDesc;

    ErrorCode(String errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    @Override
    public String getErrCode() {
        return errCode;
    }

    @Override
    public String getErrDesc() {
        return errDesc;
    }
}
