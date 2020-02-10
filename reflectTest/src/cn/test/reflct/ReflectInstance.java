package cn.test.reflct;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectInstance
 * @Description: 反射获取类的对象
 * @Author 79440
 * @Date 2020/2/10
 * @Version V1.0
 **/
public class ReflectInstance {

    /**
     * @MethodName: demo1
     * @Description: 获取对象实例操作
     * @Param: []
     * @Return: void
     * @Author: 79440
     * @Date: 22:44
    **/
    public static void demo1(Class<?> stuClazz){
        try {

            Student student = (Student)stuClazz.newInstance();
            student.setAddress("上海");
            student.setId(123);
            student.setName("79440");
            System.out.println(student.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @MethodName: demo2
     * @Description: 操作对象属性
     * @Param: []
     * @Return: void
     * @Author: 79440
     * @Date: 22:44
     **/
    public static void demo2(Class<?> stuClazz){
        try {

            Student student = (Student)stuClazz.newInstance();

            Field id = stuClazz.getDeclaredField("id");
            id.setAccessible(true);
            id.set(student,1);
            System.out.println(student.getId());

            System.out.println("=========================");
            //获取私有方法
            Method prvaeMethod = stuClazz.getDeclaredMethod("prvaeMethod",String.class);

            prvaeMethod.setAccessible(true);
            prvaeMethod.invoke(student,"79440");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Class<?> stuClazz = Class.forName("cn.test.reflct.Student");
            // demo1(stuClazz);
            demo2(stuClazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
