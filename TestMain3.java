package day10;

import java.util.Scanner;

public class TestMain3 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Multiple mul = new Multiple();
		int num1;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		int result = mul.multipleCheck(num1);
		mul.outPut(num1,result);
	}
	}


