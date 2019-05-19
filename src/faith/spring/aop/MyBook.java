package faith.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-17
 * @Description: 前置增强类
 * @version: 1.0
 */
public class MyBook {

    // 前置增强
    public void before() {
        System.out.println("前置增强........");
    }


    //后置增强
    public void after(String name, int num){
        System.out.println("后置增强传入参数：" + name + "数字是：" + num);
    }

    //环绕增强
    public void arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //方法之前执行的代码
        System.out.println("环绕增强 方法之前执行........");

        //执行被增强的方法(放行)
        proceedingJoinPoint.proceed();

        //方法之后执行的代码
        System.out.println("环绕增强 方法之后执行........");
    }
}
