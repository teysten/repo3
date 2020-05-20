package cn.incast1.demo02;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo02person {

    public static void main(String[] args) {
      show02();
    }

    private static void show02() {
        HashMap<person,String> map =new HashMap<>();
        map.put(new person("张三",18),"日本");
        map.put(new person("李明",28),"中国");
        map.put(new person("张强",16),"哈萨克斯坦");
        map.put(new person("张三",18),"哈萨克斯坦");
        Set<Map.Entry<person, String>> set = map.entrySet();
        for (Map.Entry<person, String> entry : set) {
            person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

    private static void show01() {
        HashMap<String,person> map =new HashMap<>();
        map.put("北京",new person("张三",18));
        map.put("日本",new person("李四",28));
        map.put("上海",new person("王五",20));
        map.put("北京",new person("李三",38));
        Set<String> set = map.keySet();
        for (String key : set) {
            person value =map.get(key);
            System.out.println(key+"-->"+value);
        }


    }
}
