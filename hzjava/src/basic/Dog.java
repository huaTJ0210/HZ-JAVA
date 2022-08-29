package basic;

public class Dog {
    // 0、构造方法:与类名同名的方法，可以接收初始化参数
    public Dog(){

    }
    public Dog(int size){
        this.size = size;
    }

    // 1、成员变量：属性
   private String breed;// 品种
   private int size;
   private String color;
   private int age;
   // 属性在外部访问使用get/set函数进行访问
   public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // 2、静态成员变量
    static  String Uid; // 唯一标识符

    //3、方法
    void eat(){
        // 局部变量：
        String name = "zhang";
        // breed = "柴犬";
        System.out.println("eat:"+name);
    }
    void run(){
        System.out.println("run!!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.setAge(5);
        System.out.println(dog.getAge());
    }

}
