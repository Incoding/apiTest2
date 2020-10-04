package com.javaapi.test.buisness.datatransfer.mapstruct.usage.enums.model;

import com.javaapi.test.buisness.datatransfer.mapstruct.usage.enums.OperateTypeEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by user on 2020/10/2.
 */
@Data
public class FinanceDO {

    private BigDecimal price;

    private Date createTime;
    private Date updateTime;
    private OperateTypeEnum operateType;

}
