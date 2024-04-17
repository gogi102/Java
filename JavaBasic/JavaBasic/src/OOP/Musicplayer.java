package OOP;

public class Musicplayer {
       boolean ison;
       int volume;

        void on(){
            ison = true;
            System.out.println("음악 플레이어 on");
        }

        void off(){
            ison = false;
            System.out.println("음악 플레이어 Off");
        }

        void volumeup(){
            volume++;
            System.out.println("현재 볼륨 :"+volume);
        }

        void volumedown(){
            volume--;
            System.out.println("현재 볼륨 :"+volume);
        }

        void showstatus(){
            if (ison){
                System.out.println("음악 플레이어 ON, 볼륨 :"+volume++);
            }
            else {
                System.out.println("음악 플레이어 OFF");
            }
        }


    }



