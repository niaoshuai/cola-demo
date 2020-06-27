package com.alibaba.demo.executor;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.BizException;
import com.alibaba.demo.dto.CustomerAddCmd;
import com.alibaba.demo.dto.domainmodel.ErrorCode;
import org.springframework.stereotype.Component;

import static com.alibaba.demo.config.DiamondConfig.CONFLICT_COMPANY_NAME;

/**
 * @author niaoshuai
 */
@Component
public class CustomerAddCmdExe {

    public Response execute(CustomerAddCmd cmd) {
        //The flow of usecase is defined here.
        //The core ablility should be implemented in Domain. or sink to Domian gradually
        if (cmd.getCustomer().getCompanyName().equals(CONFLICT_COMPANY_NAME)) {
            throw new BizException(ErrorCode.B_CUSTOMER_companyNameConflict, "公司名冲突");
        }
        return Response.buildSuccess();
    }

}
