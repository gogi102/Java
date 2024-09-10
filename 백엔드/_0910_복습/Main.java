package _0910;

public class Main {
    public static void main(String[] args) {
        UniversalRemote universalRemote = new UniversalRemote();
        SamsungTV samsungTV = new SamsungTV();
        LGTV lgtv = new LGTV();
        
        // Samsung TV 연결
        universalRemote.setPairing(samsungTV);
        samsungTV.power();
        samsungTV.changeChannel(12);
        samsungTV.checkChannel();
        samsungTV.streaming();
        System.out.println();

        //TV 종료
        samsungTV.power();
        samsungTV.changeChannel(1);
        universalRemote.offPairing();
        
        // LG TV 연결
        System.out.println();
        universalRemote.setPairing(lgtv);
        lgtv.power();
        lgtv.changeChannel(10);
        lgtv.checkChannel();
        lgtv.streaming();
        System.out.println();

        //TV 종료
        lgtv.power();
        lgtv.changeChannel(1);
        universalRemote.offPairing();
        
        // 전부 다 연결해제 되었을 때
        System.out.println();
        samsungTV.changeChannel(10);
        lgtv.changeChannel(10);
    }
}
