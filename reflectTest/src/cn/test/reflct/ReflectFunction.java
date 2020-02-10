package cn.test.reflct;

import java.lang.reflect.Method;

/**
 * 反射方法简单练习
 */
public class ReflectFunction {

    /**
     * @MethodName: demo1
     * @Description: 获取反射对象方法
     * @Param: []
     * @Return: void
     * @Author: 79440
     * @Date: 19:59
    **/
    public static void demo1(){
        //获取反射对象（反射入口）：Class ，1 Class.forName(全类名)   2 类名.class  3 对象.getClass()
        try {
            Class<?> studentClass = Class.forName("cn.test.reflct.Student");
            Class<Student> studentClass1 = Student.class;
            Student student = new Student();
            Class<? extends Student> studentClass2 = student.getClass();
            System.out.println(studentClass);
            System.out.println("------------");
            System.out.println(studentClass1);
            System.out.println("------------");
            System.out.println(studentClass2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * @MethodName: demo2
     * @Description: 获取方法
     * @Param: []
     * @Return: void
     * @Author: 79440
     * @Date: 20:13
    **/
    public static void demo2(){

        try {
            Class<?> stuClazz = Class.forName("cn.test.reflct.Student");
            //获取当前类的所有方法
            Method[] stumethods = stuClazz.getMethods();
            for (Method stumethod: stumethods) {
                System.out.println(stumethod);
            }
            System.out.println("=============");
            //获取所有方法
            Method[] declaredMethods = stuClazz.getDeclaredMethods();

            for (Method declaredMethod: declaredMethods
                 ) {
                System.out.println(declaredMethod);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    /**
     * @MethodName: demo3
     * @Description: 获取所有接口
     * @Param: []
     * @Return: void
     * @Author: 79440
     * @Date: 21:52
    **/
    public static void demo3(){
        try {
            Class<?> aClass = Class.forName("cn.test.reflct.Student");
            Class<?>[] interfaces = aClass.getInterfaces();
            for (Class inter: interfaces
                 ) {
                System.out.println(inter);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * @MethodName: demo4
     * @Description: 获取继承类
     * @Param: []
     * @Return: void
     * @Author: 79440
     * @Date: 22:01
    **/
    public static void demo4(){
        try {
            Class<?> aClass = Class.forName("cn.test.reflct.Student");
            Class<?> superclass = aClass.getSuperclass();
            System.out.println(superclass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * @MethodName: demo5
     * @Description: 获取对象
     * @Param: []
     * @Return: void
     * @Author: 79440
     * @Date: 22:01
     **/
    public static void demo5(){
        try {
            Class<?> aClass = Class.forName("cn.test.reflct.Student");
            Student student = (Student)aClass.newInstance();
            student.getPerson();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // demo1();
        // demo2();
        // demo3();
        // demo4();
        demo5();
    }

}
