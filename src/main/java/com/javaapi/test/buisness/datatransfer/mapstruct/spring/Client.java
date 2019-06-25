package com.javaapi.test.buisness.datatransfer.mapstruct.spring;

import com.javaapi.test.buisness.datatransfer.mapstruct.DataAfter;
import com.javaapi.test.buisness.datatransfer.mapstruct.DataBefore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by user on 2019/5/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext.xml")
public class Client {

    @Autowired
    DataConvertor dataConvertor;


    /**
     * 字段名字不同
     */
    @Test
    public void test() {
        DataBefore df = getDataBefore();
        DataAfter dataAfter = dataConvertor.vo2do(df);
        System.out.println("dataAfter = " + dataAfter);

    }

    public DataBefore getDataBefore() {
        DataBefore dataBefore = new DataBefore();
        dataBefore.setId(1L);
        dataBefore.setName("nihao");
        dataBefore.setAge(30);
        return dataBefore;
    }
}
