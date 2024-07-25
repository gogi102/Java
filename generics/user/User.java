package generics.user;

public class User {

    public String name;

    public User(String name) {
        this.name = name;
    }

    public void adPoint(){
        System.out.println(name + "님, 포인트 적립되었습니다");
    }
}
