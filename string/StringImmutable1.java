package lang.string;

public class StringImmutable1 {

    public static void main(String[] args) {

        String str = "hello";
        str.concat("java");

        System.out.println("str = "+str);
    }
}
/*
String은 불변객체이다
따라서 생성 이후에 절대로 내부의 문자열 값을 변경할 수 없다.
 */
