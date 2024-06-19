package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);


    }
}
/*
 쌍따옴표 사용방법, 객체 생성 방법이 이다
 String 클래스이다 int boolean과 같은 기본형이 아니라 참조형이다.
 따라서 str1 변수에 String 인스턴스의 참조값만 들어갈 수 있다
 그러면 String str1 = "hello"; 문장은 뭔가 어색해보인다
 String str1 = "hello";
 String str1 = new String("hello");

 */
