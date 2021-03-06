package com.javaapi.test.spring.spring.feature.config.propertyplaceholder.contextplaceholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 注意
 * 1
 <context:property-placeholder location="classpath:com/javaapi/test/spring/zotherFeature/propertyplaceholder/config.properties"  file-encoding="UTF-8" ignore-resource-not-found="true" ignore-unresolvable="true" />
  当做spring xml配置文件里的占位符用,也可以在注入到java  类中的成员变量里
   2
 <util:properties id="selfPro" location="classpath:com/javaapi/test/spring/zotherFeature/propertyplaceholder/config.properties" ></util:properties>
 只能在java文件里当做占位符用
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("applicationContext.xml")
public class Client {
	@Autowired
	@Qualifier("taskJobXml")
	TaskJobXml jobXml;

	/**
	 * value 使用 $是读外部配置
	 * value 使用 #是读bean属性
	 * refer https://www.cnblogs.com/larryzeal/p/5910149.html
	 */
    @Autowired
    @Value("${nihao}")
    private String name;

	/**
	 * value 使用 $是读外部配置
	 * value 使用 #是读bean属性
	 * refer https://www.cnblogs.com/larryzeal/p/5910149.html
	 */
	@Autowired
	@Value("#{propertiesPojo.name}")
	private String propertiesPojoName;

	@Test
	public void test() {
		System.out.println(jobXml.getTaskName());
        System.out.println(name);
        System.out.println(propertiesPojoName);
    }
}