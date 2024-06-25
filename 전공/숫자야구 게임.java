package sungil0211;
import java.util.*;
import java.io.*;
public class BaseBall1 {
	
	public static int playGame() throws IOException{
		int x,y,z;
		Random r = new Random();
		x = Math.abs(r.nextInt()%9)+1;
		do{y = Math.abs(r.nextInt()%9)+1;}while(x==y);
		do{z = Math.abs(r.nextInt()%9)+1;}while(x==z||z==y);
		return playGame(x,y,z);
	}
	public static int playGame(int x, int y, int z) throws IOException{
		int count, strike, ball;
		int[] com = {x,y,z};
		int[] usr = new int[3];
		count = 0;
		System.out.println("숫자야구 게임 시작");
		do {
			count++;
			do {
				System.out.println("카운트: "+count);
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String user;
				
				System.out.print("1번째: ");
				user = in.readLine();
				usr[0] = new Integer(user).intValue();

				System.out.print("2번째: ");
				user = in.readLine();
				usr[1] = new Integer(user).intValue();
				
				System.out.print("3번째: ");
				user = in.readLine();
				usr[2] = new Integer(user).intValue();
				
				if(usr[0] == 0 || usr[1] == 0 || usr[2] == 0) {
					System.out.println("0은 안됨");
				}else if(usr[0] > 9 || usr[1] > 9 || usr[2] > 9) {
					System.out.println("1부터 9까지만");
				}else if(usr[0] == usr[1] || usr[1] == usr[2] || usr[0] == usr[2]) {
					System.out.println("중복값은 안됨");
				}
			}while(usr[0] == 0 || usr[1] == 0 || usr[2] == 0 
             || usr[0] > 9 || usr[1] > 9 || usr[2] > 9 
             || usr[0] == usr[1] || usr[1] == usr[2] || usr[0] == usr[2]);
			
			strike = ball = 0;
			
			if(com[0] == usr[0])strike++; 
			if(com[1] == usr[1])strike++;
			if(com[2] == usr[2])strike++;
			
			if(com[0] == usr[1])ball++; if(com[0] == usr[2])ball++;
			if(com[1] == usr[0])ball++; if(com[1] == usr[2])ball++;
			if(com[2] == usr[0])ball++; if(com[2] == usr[1])ball++;
			
			System.out.println("스트라이크: "+strike+" 볼: "+ball);
		}while(strike < 3 && count < 11);
		return count;
	}
	
	public static void main(String[] args) throws IOException{
		
		int result;
		if (args.length == 3) {
			int x = Integer.valueOf(args[0]).intValue();
			int y = Integer.valueOf(args[1]).intValue();
			int z = Integer.valueOf(args[2]).intValue();
			result = playGame(x,y,z);
		}else {
			result = playGame();
		}
		System.out.println();
		if (result <= 2) {
			System.out.println("참 잘했어요!");
		}else if (result <= 5) {
			System.out.println("잘했어요!");
		}else if (result <= 9) {
			System.out.println("보통");
		}else {
			System.out.println("분발해라");
		}
	}

}
