package lang.string;

public class StringSpitJoinMain {
    public static void main(String[] args) {

        String str = "Apple,Banana,Orange";

        String[] strs = str.split(",");

        for (String s : strs){
            System.out.println(s);
        }

        // join()

        String joinedStr = String.join("-","A","B","C");
        System.out.println("연결된 문자열: "+joinedStr);

        // 문자열 배열 연결
        String result = String.join("-",strs);
        System.out.println("result = "+result);
    }
}
