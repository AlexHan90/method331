package day10;

import java.util.Scanner;

public class Test04 {
		public void test(int num) {
			
			if(num % 2 == 0) {
				print(num, "짝수");
				//System.out.println("짝수");
			}else {
				print(num, "홀수");
				//System.out.println("홀수");
			}
		

		}
		public void input() {
			Scanner input = new Scanner(System.in);
			int num;
			System.out.println("수 입력 : ");
			num = input.nextInt();
			test(num);
		}
		public void print(int n, String s) {
			System.out.println(n+ "=" + s);
			
			
			
			
		}
		
		
}

















