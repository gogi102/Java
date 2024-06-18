package sungil0211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BaseBall {

    public static int playGame() throws IOException{

        int x,y,z; // x,y,z 선언
        Random r = new Random(); // 랜덤객체 선언

        x = Math.abs(r.nextInt()%9)+1; 
        // x를 0~8까지 +1을 해준값을 - 값이 나오지 않게 절대값으로 할당시켜줌
        do { y = Math.abs(r.nextInt()%9)+1; } while (x == y); 
        //y에 값을 할당 시켜주고 x와 y의 값이 같으면 같지 않을 때 까지 할당
        do { z = Math.abs(r.nextInt()%9)+1; } while (x == z || y == z); 
        // z에 값을 할당 시켜주고 x와 z, y와 z의 값이 같으면 같지 않을 때 까지 할당
        return playGame(x,y,z); 
        // 밑에 있는 playGame(x,y,z)를 실행시킨 값을 반환
    }

    public static int playGame(int x, int y, int z) throws IOException{ 
    	// playGame메서도 생성 throws IOException는 예외처리를 위해서 선언

        int count, strike, ball;
        // 시도 횟수를 적어줄 count, 스트라이크, 볼 변수 선언
        int[] usr = new int[3]; 
        // usr이라는 3칸 짜리 배열선언
        int[] com = {x,y,z}; 
        // com 배열에 x,y,z를 할당

        System.out.println("숫자 야구 게임 시작");

        count = 0; // 카운트를 0으로 초기값 지정

        do {
            count ++; // 무조건 카운트에 1을 한번 더해주고 밑에 while 조건에 따라 결정

            do { // 무조건 1번은 실행 후 밑에 while 조건에 따라 결정한다

                System.out.println("\n카운트: "+count);

                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                /* 사용자에게 입력 받기 위해 BufferedReader 호출
                (사용자가 요청할 때마다 데이터를 읽어 오는 것이 아닌 일정한 크기의 데이터를 한번에 읽어와 Buffer에 보관한 후,
                 사용자의 요청이 있을 때 버퍼에서 데이터를 읽어오는 방식
                 속도가 향상되고 시간 부하가 적다는 장점을 가진다.
                 라인 단위로 입력값의 경계를 인식하기 때문에 공백의 경우에도 String으로 인식한다.
                 입력받은 데이터 타입이 String타입이므로 다른 데이터 타입으로 사용할 경우 형변환이 필요하다.)*/
                String user;

                System.out.println("1번째 숫자: ");
                user = in.readLine();
                usr[0] = new Integer(user).intValue();

                System.out.println("2번째 숫자: ");
                user = in.readLine();
                usr[1] = new Integer(user).intValue();

                System.out.println("3번째 숫자: ");
                user = in.readLine();
                usr[2] = new Integer(user).intValue();
                // 유저에게 문자열로 숫자를 받은 후 받은 그 문자열을 정수로 형변환해서 usr 배열에 넣어줌

                if(usr[0] == 0 || usr[1] == 0 || usr[2] == 0){
                    System.out.println("0은 입력 하지 마세요. 다시 입력해 주세요"); 
                    // 0인가?를 판단
                }
                else if(usr[0] > 9 || usr[1] > 9 || usr[2] > 9){
                    System.out.println("1부터 9까지 숫자 중 하나를 입력해 주세요. 다시 입력해 주세요"); 
                    // 9를 넘지 않았는가?를 판단
                }
                else if(usr[0] == usr[1] || usr[1] == usr[2] || usr[0] == usr[2]){
                    System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해 주세요"); 
                    // 중복인가?를 판단
                }
            }while (usr[0] == 0 || usr[1] == 0 || usr[2] == 0
                    || usr[0] > 9 || usr[1] > 9 || usr[2] > 9
                    || usr[0] == usr[1] || usr[1] == usr[2] || usr[0] == usr[2]);
            // usr에 9보다 크거나 값이 중복 되거나 0이 되지 않을 때 까지 계속 다시 입력 받음

            strike = ball = 0;

            if (com[0] == usr[0]) strike++; if (com[1] == usr[1]) strike++; if (com[2] == usr[2]) strike++;
            // 유저가 입력한 값과 컴퓨터가 랜덤으로 산출한 값이 완전히 동일 할 경우 스트라이크에 1을 더해줌

            if (com[0] == usr[1]) ball++; if (com[0] == usr[2]) ball++;
            if (com[1] == usr[0]) ball++; if (com[1] == usr[2]) ball++;
            if (com[2] == usr[0]) ball++; if (com[2] == usr[1]) ball++;
            // 유저가 입력한 값 중에 컴퓨터가 산출한 값과 자리는 다르지만 같은 값이 있을 경우 볼에 1 더하기

            System.out.println("strike: "+strike+" ball: "+ball);
        }while (strike < 3 && count <= 10);
        // 스트라이크가 3이 되거나 카운트가 10이 되기 전까지 계속 카운트에 1을 더해주며 반복문 돌림
        return count;
    }

    public static void main(String[] args) throws IOException {
        
        int result;

        if (args.length == 3){
            int x = Integer.valueOf(args[0]).intValue(); // 객체에 있는 값을 정수로 변환시킴
            int y = Integer.valueOf(args[1]).intValue();
            int z = Integer.valueOf(args[2]).intValue();

            result = playGame(x,y,z);
        }else {
            result = playGame();
        }

        System.out.println();

        if (result <= 2){
            System.out.println("참 잘 했어요");
        }else if (result <= 5){
            System.out.println("잘 했어요");
        }else if (result <= 9){
            System.out.println("보통");
        }else {
            System.out.println("개 못하네 ㄹㅇ");
        }
    }
}
