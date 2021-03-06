package com.javaapi.test.test.type.object.perfermance;

import net.sf.cglib.beans.BeanCopier;

import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.beans.BeanUtils;

import com.javaapi.test.test.type.object.FromBean;
import com.javaapi.test.test.type.object.ToBean;

public class TestMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        FromBean fb = new FromBean();
        fb.setAddress("北京市朝阳区大屯路");
        fb.setAge(20);
        fb.setMoney(30000.111);
        fb.setIdno("110330219879208733");
        fb.setName("测试");

        IMethodCallBack beanutilCB = new IMethodCallBack() {

            @Override
            public String getMethodName() {
                return "BeanUtil.copyProperties";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {

                ToBean toBean = new ToBean();
                BeanUtils.copyProperties(toBean, frombean);
                return toBean;
            }
        };

        IMethodCallBack propertyCB = new IMethodCallBack() {

            @Override
            public String getMethodName() {
                return "PropertyUtils.copyProperties";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
                ToBean toBean = new ToBean();
                PropertyUtils.copyProperties(toBean, frombean);
                return toBean;
            }
        };

        IMethodCallBack springCB = new IMethodCallBack() {

            @Override
            public String getMethodName() {
                return "org.springframework.beans.BeanUtils.copyProperties";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
                ToBean toBean = new ToBean();
                org.springframework.beans.BeanUtils.copyProperties(frombean,
                        toBean);
                return toBean;
            }
        };

        IMethodCallBack cglibCB = new IMethodCallBack() {
            BeanCopier bc = BeanCopier.create(FromBean.class, ToBean.class,
                    false);

            @Override
            public String getMethodName() {
                return "BeanCopier.create";
            }

            @Override
            public ToBean callMethod(FromBean frombean) throws Exception {
//            	 BeanCopier bc = BeanCopier.create(FromBean.class, ToBean.class,
//                         false);
                ToBean toBean = new ToBean();
                bc.copy(frombean, toBean, null);
                return toBean;
            }
        };

        // 数量较少的时候，测试性能
//        BenchmarkTest bt = new BenchmarkTest(10);
//        bt.benchmark(beanutilCB, fb);
//        bt.benchmark(propertyCB, fb);
//        bt.benchmark(springCB, fb);
//        bt.benchmark(cglibCB, fb);

        // 测试一万次性能测试
        BenchmarkTest bt10000 = new BenchmarkTest(100000);
        bt10000.benchmark(beanutilCB, fb);
        bt10000.benchmark(propertyCB, fb);
        bt10000.benchmark(springCB, fb);
        bt10000.benchmark(cglibCB, fb);

        // 担心因为顺序问题影响测试结果
//        BenchmarkTest bt1000R = new BenchmarkTest(10000);
//        bt1000R.benchmark(cglibCB, fb);
//        bt1000R.benchmark(springCB, fb);
//        bt1000R.benchmark(propertyCB, fb);
//        bt1000R.benchmark(beanutilCB, fb);

    }

}