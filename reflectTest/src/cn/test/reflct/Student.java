package cn.test.reflct;
//学生类
public class Student implements Person{
    private String name;
    private int id;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Student(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public Student(String address) {
        this.address = address;
    }
    public Student(String name, int id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public Student() {
    }

    private void getStudent(){
        System.out.println("反射获取私有方法");
    }

    @Override
    public void getPerson() {
        System.out.println("反射实现方法");
    }

    private void prvaeMethod(String name){
        System.out.println("私有方法"+name);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
