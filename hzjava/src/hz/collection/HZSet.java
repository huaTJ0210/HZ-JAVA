package hz.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HZSet {
    public static void main(String[] args){
        // 不允许有重复元素的集合,多线程访问不安全；
        Set<String> set = new HashSet<>();
        set.add("apple");//true
        set.add("banana");//true
        set.add("pear");// true

        // 重复添加会失败
        System.out.println(set.add("apple")); // false
        if (set.contains("apple")){
            System.out.println("包含apple");
        }
        // 移除元素
        set.remove("apple");
        // 获取集合的大小
        int size = set.size();

        //
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("pear");
        treeSet.add("orange");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
