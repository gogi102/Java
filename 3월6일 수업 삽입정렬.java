package insertion;

import java.util.Arrays;

public class insertionarray {

	public static void main(String[] args) {
		int[] arr = new int[] {8,23,14,26,27};//리스트 생성
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]) {//리스트의 j(1)번째 값과 j-1(0)번째 값을 비교후 1번째 값이 더 작을 경우 서로 위치를 교환
					int temp = arr[j];//temp라는 임의의 변수에 j값을 저장후
					arr[j] = arr[j-1];//j를 j-1로 바꿈
					arr[j-1] = temp;//원래있던 j-1을 j를 저장해둔 temp로 바꿈 
				}
			}
		}
	
		System.out.println(Arrays.toString(arr));//리스트의 값 출력
	}

}
