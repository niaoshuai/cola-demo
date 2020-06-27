package com.alibaba.demo.domain.customer;

import com.alibaba.cola.domain.Entity;
import com.alibaba.demo.dto.domainmodel.CompanyType;
import com.alibaba.demo.dto.domainmodel.SourceType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Domain Entity can choose to extends the domain model which is used for DTO
 *
 * @author niaoshuai
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Customer extends com.alibaba.demo.dto.domainmodel.Customer {

    private String customerId;
    private String memberId;
    private String globalId;
    private long registeredCapital;
    private String companyName;
    private SourceType sourceType;
    private CompanyType companyType;

    public Customer() {
    }

    public boolean isBigCompany() {
        //注册资金大于1000万的是大企业
        return registeredCapital > 10000000;
    }

    public boolean isSme() {
        //注册资金大于10万小于100万的为中小企业
        return registeredCapital > 10000 && registeredCapital < 1000000;
    }

//    public void checkConfilict(){
//        //Per different biz, the check policy could be different, if so, use ExtensionPoint
//        if(CONFLICT_COMPANY_NAME.equals(this.companyName)){
//            throw new BizException(this.companyName+" has already existed, you can not add it");
//        }
//
//    }
}
