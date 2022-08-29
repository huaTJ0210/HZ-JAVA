package basic;

public class HZGeneric {
    // 类型声明部分放在方法返回值之前
    public static <E> void printArray(E[] array){
        for(E element:array){
            System.out.printf("%s",element);
        }
    }

    public static void main(String[] args) {
        // --- 整数类型 ---
        Integer[] numbers = {1,2,3,4,5,6};
        HZGeneric.printArray(numbers);
        // ---- 字符串类型 --
        String[] fruits = {"apple","banana","orange"};
        HZGeneric.printArray(fruits);
    }
}
