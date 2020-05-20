package cn.incast1.demo03;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Dome01LinkMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        map.put("d","d");
        map.put("b","c");
        System.out.println(map);
       LinkedHashMap<String,String> linked =new LinkedHashMap<>();
       linked.put("a","a");

       linked.put("c","d");
       linked.put("b","d");
       linked.put("a","d");
        System.out.println(linked);
    }
}
