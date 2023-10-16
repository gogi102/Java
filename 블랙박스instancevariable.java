package blackbox;

public class _02_instancevariables {
    public static void main(String[] args) {
        //인스턴스 화
        Blackbox b1 = new Blackbox();


        //인스턴스 변수
        b1.modelname = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "black";

        System.out.println(b1.modelname);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);


        Blackbox b2 = new Blackbox();


        b2.modelname = "하양이";
        b2.resolution = "UHD";
        b2.price = 300000;
        b2.color = "white";

    }
}
