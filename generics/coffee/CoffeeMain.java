package generics.coffee;

import generics.user.User;
import generics.user.VIPUser;

public class CoffeeMain {
    public static void main(String[] args) {

        CoffeeByNumber c1 = new CoffeeByNumber(10);
        c1.ready();

        CoffeeByNickName c2 = new CoffeeByNickName("t3xture");
        c2.ready();

        System.out.println("----------------------------");

        CoffeeByName c3 = new CoffeeByName(11);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("Karon");
        c4.ready();

        System.out.println("----------------------------");

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호: "+c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름: "+c4Name);

//        c4Name = (String) c3.name;
        System.out.println("----------------------------");

        Coffee<Integer> c5 = new Coffee<>(12);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호: "+c5Name);

        Coffee<String> c6 = new Coffee<>("meteor");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름: "+c6Name);

        System.out.println("----------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("Lakia"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("Munchkin"));
        c8.ready();

        System.out.println("----------------------------");

        orderCoffee("hsk");

        orderCoffee("solo", "아메리카노");
    }
    public static <T> void  orderCoffee(T name){
        System.out.println("커피 준비 완료: "+name);
    }

    public static <T,V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + " 준비 완료: "+name);
    }
}
