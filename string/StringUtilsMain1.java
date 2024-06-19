package lang.string;

public class StringUtilsMain1 {

    public static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값: "+numString);

        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: "+boolString);

        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값: "+objString);

        String numString2 = num + ""; // 위 값과 동일하게 나옴
        System.out.println("빈문자열 + num: "+numString2);

        // toCharArray
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: "+strCharArray);

        for (char c : strCharArray){
            System.out.print(c);
        }
    }
}
