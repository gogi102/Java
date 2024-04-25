package Hash;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("ABC",10);
        hashMap.put("BBB",20);
        hashMap.put("AAA",30);
        hashMap.put("ABC",15); // 기존 키의 value인 10 대신 15가 들어간다

        System.out.println(hashMap.isEmpty());

        System.out.println(hashMap.get("ABC"));

        System.out.println(hashMap.containsKey("ABC"));

        hashMap.remove("ABC");

        System.out.println(hashMap.containsKey("ABC"));

        System.out.println(hashMap.size());

        hashMap.clear();

        System.out.println(hashMap.isEmpty());
    }
}
