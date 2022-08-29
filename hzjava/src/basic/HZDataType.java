package basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HZDataType {
    public static void main(String[] args) {
        // 1、--------字符串----------
        StringBuilder s = new StringBuilder();
        s.append("hello");
        System.out.println(s);
        s.insert(5,"world");
        System.out.println(s);
        s.delete(1,3);
        System.out.println(s);

        // 2、--------数组----------
        int[] numbers = new int[100];
        numbers[0] = 100;
        System.out.println(numbers);

        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt( myArray );
        for(int j=0; j<myArray.length; j++)
            System.out.print( myArray[j] + " " );

        // 3、--------日期----------
        Date dateNow = new Date();
        // HH 大写表示24小时制
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        String date =  format.format(dateNow);
        System.out.println(date);

        int[] ns = {1,2,3};
        System.out.println(ns[0]);
        changeArray(ns);
        System.out.println(ns[0]);

        // x--->null
        // y -->null
        // y---> 'RUNOOB'
        String x = null;
        giveMeAString(x);
        System.out.println(x);

    }

   static void changeArray(int[] array){
        array[0] = 222;
    }
    static void giveMeAString(String y)
    {
        y = "RUNOOB";
    }
}

class ChangeIt
{
    static void doIt( int[] z )
    {
        // 仅仅修改了引用的指向，而不是内存中的数据
        z = null ;
    }
}
