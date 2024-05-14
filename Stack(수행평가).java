package java_study;

import java.util.Scanner;
import java.util.Stack;

public class Sort_study {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = 1;
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	boolean b = true;
	Stack<Integer> st = new Stack();
	StringBuffer sb = new StringBuffer();
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] >= num) {
			while(arr[i] >= num) {
				st.push(num++);
				sb.append('+');}
			st.pop();
			sb.append('-');}
		else { 
			int a = st.pop();
			if(a != arr[i]){
				System.out.println("No");	
				b = false;
				break;
				
			}
			else {
				sb.append('-');
			}
		}
		}
	if(b == true) {
		System.out.println(sb);
	}
	}

}
