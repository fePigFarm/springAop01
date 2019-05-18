package faith.spring.aop;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-17
 * @Description: 基础Book类
 * @version: 1.0
 */
public class Book {

    public void add(String name, int num) {
        System.out.println("Book的add方法" + name + num);
    }

    public void add() {
        System.out.println("Book的add方法");
    }
}
