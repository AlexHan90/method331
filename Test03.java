package day10;

import java.util.Scanner;

public class Test03 {
		// int num1 = 100, int num2 = 200;
	public int sumFunc(int num1, int num2) {
		int sum = 0;
		
		
		sum = num1 + num2;
		return sum;    //return 으로 돌려주고자 하는 자료형은 변수의 자료형과 같아야한다.
		
	}
			public int []input() {
		
		  Scanner input = new Scanner(System.in); 
		  int num1, num2, sum = 0;
		  
		  System.out.print("수 입력 : "); num1 = input.nextInt();
		  System.out.print("수 입력 : "); num2 = input.nextInt();
		 
			
		  
		  int[] arr = new int[2];
					arr[0] = num1; arr[1] = num2;
			
			return arr;
			
		
			
			
			
			
			
			
			
		
		//지역변수(local variable); => 그 범위안에서만 사용가능, 벗어나면 소멸함.
		// return => 값을 하나만 돌려준다.
	}

		
		
		
	}

