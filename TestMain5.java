package day10;

import java.util.Scanner;

public class TestMain5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Absolute absolute = new Absolute();
		int num1;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		int result = absolute.absoluteCheck(num1);
		absolute.outPut(num1,result);
	}

}
