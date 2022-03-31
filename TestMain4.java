package day10;

import java.util.Scanner;


public class TestMain4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Prime prime = new Prime();
		int num1;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		int result = prime.primeCheck(num1);
		prime.outPut(num1,result);
	}

	}



