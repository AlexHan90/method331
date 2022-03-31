package day10;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Big b = new Big();
		int num1,num2;
		System.out.print("첫번째 값 입력 : ");
		num1 = input.nextInt();
		System.out.print("두번째 값 입력 : ");
		num2 = input.nextInt();
		int result = b.big(num1,num2);
		b.outPut(num1,num2,result);
		
	}


}
