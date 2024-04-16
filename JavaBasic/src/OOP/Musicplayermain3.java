package OOP;

public class Musicplayermain3 {
    public static void main(String[] args) {
        Musicplayer player = new Musicplayer();
        //절차 지향 프로그래밍
        //음악 플레이어 켜기
        player.on();
        player.volumeup();
        player.volumeup();
        player.volumedown();
        player.showstatus();
        player.off();
    }
    public static void on(Musicplayerdata mp){
        mp.ison = true;
        System.out.println("음악 플레이어 on");
    }

    public static void off(Musicplayerdata mp){
        mp.ison = false;
        System.out.println("음악 플레이어 Off");
    }

    public static void volumeup(Musicplayerdata mp){
        mp.volume++;
        System.out.println("현재 볼륨 :"+mp.volume);
    }

    public static void volumedown(Musicplayerdata mp){
        mp.volume--;
        System.out.println("현재 볼륨 :"+mp.volume);
    }

    public static void showstatus(Musicplayerdata mp){
        if (mp.ison){
            System.out.println("음악 플레이어 ON, 볼륨 :"+mp.volume++);
        }
        else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
