package hz.collection;

import java.util.*;

public class HZList {
    public static void main(String[] args){
        /*
         *  List:按索引顺序访问的长度可变的有序表
         *  （0）List<E>:接口涉及的方法
         *  （1）ArrayList ：内部以数组的方式实现存储
         *  （2）LinkedList：内部以链表的方式实现存储
         *  （3）List的遍历
         *  （4）List和数组的相互转换
         * */
        List<String> arrayList = new ArrayList<>();

        arrayList.add("1");
        arrayList.add("2");

        String one = arrayList.get(0);
        arrayList.set(1,"22");
        arrayList.remove(1);

        // 遍历：foreach
        for(String number:arrayList){
            System.out.println(number);
        }
        // 遍历：转化为数组
        String[] strArray = new String[arrayList.size()];
        arrayList.toArray(strArray);
        // 遍历：使用迭代器
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


       // --- LinkList ---
        List<String> list = new LinkedList<>();
        list.add("apple");
        list.add("pear");

        // ListIterator:列表迭代器，便于用来访问列表中的元素
        ListIterator<String> iterator = list.listIterator();
        iterator.add("banana"); // 在列表头部直接添加
        String a = iterator.next(); // 当前iterator指向apple
        System.out.println(a);

        iterator.set("orange");// 取代当前iterator指向的元素
        System.out.println(list);
        System.out.println(iterator.hasPrevious());
        String last = iterator.previous(); // 获取当前iterator指向的前一个元素
        System.out.println(last);


    }
}
