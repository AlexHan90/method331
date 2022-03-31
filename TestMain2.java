package day10;

import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		OddEven1 oe = new OddEven1();
		int num1;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		int result = oe.oddEven(num1);
		oe.outPut(num1,result);
	}
	

}
