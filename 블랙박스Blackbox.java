package blackbox;

public class Blackbox {
    //클래스 구성요소: 필드, 메소드, 생성자
    String modelname; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상

    //클래스 변수
    static boolean canAutoReport = false;

    //메서드
    void autoReport(){
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다");
        }else {
            System.out.println("자동신고 기능이 지원되지 않습니다");
        }
    }
    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은"+capacity+"GB입니다");

    }
    int getVideoFileCount(int type){
        if (type == 1){ //type1 : 일반영상
            return 9;
        } else if (type == 2) { //type2 : 이벤트영상 예: 충돌 등
            return 2;
        }
        return 11;
    }
}
