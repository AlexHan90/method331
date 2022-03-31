package day10;

public class Sample {
	int add (int a, int b ) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		Sample sample = new Sample();
		int c = sample.add(a, b) ;
		
		System.out.println(c);

	}

}

