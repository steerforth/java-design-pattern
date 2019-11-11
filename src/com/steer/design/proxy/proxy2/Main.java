package com.steer.design.proxy.proxy2;

public class Main {
    /**
     * 基于JDK动态代理
     *
     * spring中，有AOP或者@Transactional这种的，会使用动态代理
     * 如果一个类有顶层接口，则默认使用JDK的动态代理来代理
     * 如果直接是一类类，则使用cglib动态代理
     * @param args
     */
    public static void main(String[] args) {
        JdkProxy proxy = new JdkProxy();
        Student student = new Student();
        student.setName("小明");
        Person obj = (Person) proxy.newInstance(student);
        obj.buy("口香糖");

        //下面会报错，也就解释了spring中，@Autowire UserServiceImpl userServiceImpl;  这种注入会报错，实际转换出来的是UserService类型
//        Student stu = (Student) proxy.newInstance(student);
//        stu.buy("口香糖");
    }
}
