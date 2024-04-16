package OOP;

public class Musicplayermain2 {
    public static void main(String[] args) {
        Musicplayerdata mp = new Musicplayerdata();
        //음악 플레이어 켜기
        mp.ison = true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        mp.volume++;
        System.out.println("현재 볼륨 :"+mp.volume);

        //볼륨 증가
        mp.volume++;
        System.out.println("현재 볼륨 :"+mp.volume);

        //볼륨 감소
        mp.volume--;
        System.out.println("현재 볼륨 :"+mp.volume);

        //음악 플레이어 상태
        if (mp.ison){
            System.out.println("음악 플레이어 ON, 볼륨 :"+mp.volume++);
        }
        else {
            System.out.println("음악 플레이어 OFF");
        }
        //음악 플레이어 끄기
        mp.ison = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
