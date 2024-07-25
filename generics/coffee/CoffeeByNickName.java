package generics.coffee;

public class CoffeeByNickName {

    public String nickname;

    public CoffeeByNickName(String nickname) {
        this.nickname = nickname;
    }

    public void ready(){
        System.out.println("커피 준비 완료: "+nickname);
    }
}
