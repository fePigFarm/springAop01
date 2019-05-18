package faith.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-18
 * @Description: faith.spring.aop
 * @version: 1.0
 */
public class TestAop {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = ac.getBean("book", Book.class);

        try {
            book.add();
            book.add("杨", 18);
        } catch (Exception e) {

        }
    }
}
