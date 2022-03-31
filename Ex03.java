package day10;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		/*
		int num = 10;
		if(true) {
			num += 100;
			System.out.println();
		}
		System.out.println(num);
		
		
		 if(true) {
					int num = 10;
					num += 100;
			
		}
		System.out.println(num);
		*/
		//기능을 만들떄 메인에서 먼저만들고나서 이동시켜라(test파일)
		Test03 t03 = new Test03();					//강한결합 = 다양한 기능들이 들어가있는거,
		// t03.input();										// 메소드는 약한결합으로 만들어야한다
		Scanner input = new Scanner(System.in);
		int num1, num2, sum = 0;

		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		System.out.print("수 입력 : ");
		num2 = input.nextInt();
		

		int a = t03.sumFunc(num1, num2);  //parameter, agurment
		System.out.println("두 수 합 : " + a);
		int [] b = t03.input();
		System.out.println("배열 0 : " + b[0]);
		System.out.println("배열 1 : "+ b[1]);
		
		
		
		

	}

}
