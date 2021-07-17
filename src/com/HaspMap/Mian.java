package com.HaspMap;

import java.util.*;



public class Mian {
    public static void main(String[] args) {
        //show2();






        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String next = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : next.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        for (Character key : map.keySet()) {
            Integer values = map.get(key);
            System.out.println(key + "=" + values);


//        Map<String,Integer> map1=new HashMap<>();
//        map1.put("啊三", 12);
//        map1.put("李四",11);
//        map1.put("张三", 13);
//
//        Set<Map.Entry<String, Integer>> set = map1.entrySet();
//
//        Iterator<Map.Entry<String, Integer>> it = set.iterator();
//        while (it.hasNext()){
//            Map.Entry<String, Integer> entry = it.next();
//            entry.getKey();
//            entry.getValue();
//            System.out.println(entry.getKey()+"="+entry.getValue());
//        }
//        System.out.println("======");
//        for (Map.Entry<String, Integer> entry:set){
//            Integer value = entry.getValue();
//            String key = entry.getKey();
//            System.out.println(key+"="+value);}


        }

//        private static void show2() {
//            HashMap<pesion, String> map1 = new HashMap<>();
//            map1.put(new pesion("女王", 18), "北京");
//            map1.put(new pesion("亲手为王", 19), "上海");
//            map1.put(new pesion("大王", 19), "重庆");
//            map1.put(new pesion("女王", 18), "成都");
//
//            Set<Map.Entry<pesion, String>> set = map1.entrySet();
//            for (Map.Entry<pesion, String> entry : set) {
//                pesion key = entry.getKey();
//                String value = entry.getValue();
//                System.out.println(key + "=" + value);
//
//            }
//
//        }
//
//        private static void show1 () {
//
//            HashMap<String, pesion> map = new HashMap<>();
//            map.put("北京", new pesion("王老五", 19));
//            map.put("上海", new pesion("李四", 18));
//            map.put("重庆", new pesion("张三", 17));
//            map.put("北京", new pesion("赵六", 20));
//
//            Set<String> set = map.keySet();
//            for (String key : set) {
//                pesion values = map.get(key);
//                System.out.println(key + "=" + values);
//
//            }
//
//        }

//
//    private static void deng4() {
//        Map<String,Integer> map1=new HashMap<>();
//        map1.put("啊三", 12);
//        map1.put("李四",11);
//        map1.put("张三", 13);
//
//        boolean v1 = map1.containsKey("啊三");
//        System.out.println(v1);
//
//
//    }
//
//    private static void deng3() {
//        Map<String,Integer> map1=new HashMap<>();
//        map1.put("啊三", 12);
//        map1.put("李四",11);
//        map1.put("张三", 13);
//
//        Integer v1 = map1.get("张三");
//        System.out.println("v1:"+v1);
//
//
//    }
//
//    private static void deng1() {
//
//        Map<String,Integer> map1=new HashMap<>();
//        map1.put("啊三", 12);
//        map1.put("李四",11);
//        map1.put("张三", 13);
//        System.out.println(map1);
//
//        Integer v1 = map1.remove("张三");
//        System.out.println("v1:"+v1);
//        System.out.println(map1);
//
//
//    }
//
//    private static void deng() {
//        Map<String,String> map=new HashMap<>();
//        String v1 = map.put("李四", "张三");
//        String v2 = map.put("李四", "张三2");
//        System.out.println("v1:"+v1);
//        System.out.println("v2:"+v2);
//        System.out.println(map);
//    }
    }

}
