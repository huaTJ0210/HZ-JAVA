package basic;

public class HZException  extends Exception{

}

// 自定义异常可以继承自Exception
// 在需要抛出异常的方法中 可以使用 throw new CustomerException('初始化')
// try...catch


class TestException{

    public static void main(String[] args) {
        try{
            int[]  a = new int[2];
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}