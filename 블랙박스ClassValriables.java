package blackbox;

public class _03_ClassValriables {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelname = "까망이";
        //b1.canautoreport = true;

        Blackbox b2 = new Blackbox();
        b2.modelname = "하양이";
        //b2.canautoreport = true;

        //특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println("----개발 전----");
        System.out.println(b1.modelname+"자동 신고 기능 : "+b1.canAutoReport);
        System.out.println(b2.modelname+"자동 신고 기능 : "+b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+Blackbox.canAutoReport);

        Blackbox.canAutoReport = true;
        System.out.println("----개발 후----");
        System.out.println(b1.modelname+"자동 신고 기능 : "+b1.canAutoReport);
        System.out.println(b2.modelname+"자동 신고 기능 : "+b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : "+Blackbox.canAutoReport);

        //b1.canAutoReport 보다 Blackbox.canAutoReport 로 사용하는 것을 권장

    }
}
