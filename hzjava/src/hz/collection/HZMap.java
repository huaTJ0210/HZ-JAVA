package hz.collection;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HZMap {
    public static void main(String[] args){
        // 创建Map
        Map<String,Integer> map = new HashMap<>();
        // 向Map中存储值
        map.put("apple",123);
        map.put("banana",456);
        map.put("pear",789);
        // 获取数据
        Integer apple = map.get("apple");
        System.out.println(apple);
        // 遍历字典
        for (String key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(value);
        }
        //
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key +"="+value);
        }

        Map<DayOfWeek,String> mapWek = new EnumMap<DayOfWeek, String>(DayOfWeek.class);
        mapWek.put(DayOfWeek.MONDAY,"星期一");
        mapWek.put(DayOfWeek.TUESDAY,"星期二");
        System.out.println(mapWek);

        // TreeMap的使用
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("b",2);
        treeMap.put("c",3);
        treeMap.put("a",1);
        System.out.println(treeMap);
    }
}
