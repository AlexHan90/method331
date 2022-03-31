package day10;

class Big{
	public int big(int n1, int n2) {         //메서드 이름 big 
		if(n1 > n2) return n1;
		else return n2;
	}
	public void outPut(int n1,int n2,int re) {
		System.out.println(n1+"과"+n2+"중 큰수 : "+re);

	}
}
class OddEven1{
	public int oddEven(int n1) {
		if(n1 % 2 == 0) return 0;
		else return 1;
	}
	public void outPut(int n1,int re) {
		if(re == 0)
			System.out.println(n1+"은 '짝' 수 입니다 : ");
		else
			System.out.println(n1+"은 '홀' 수 입니다 : ");
	}
}
class Multiple{

	public int multipleCheck(int n1) {
		if(n1 % 3 == 0) return 0;
		else return 1;
	}
	public void outPut(int n1,int re) {
		if(re == 0)
			System.out.println(n1+"은 3의 배수 입니다 ");
		else
			System.out.println(n1+"은 3의 배수가 아닙니다");

	}
}
class Prime{
	public int primeCheck(int n1) {
		int cnt=0;
		for(int i=1;i<=n1;i++) {
			if(n1 % i == 0 )cnt++;
		}
		return cnt;
	}
	public void outPut(int n1,int re) {
		if(re == 2)
			System.out.println(n1+"은 소수 입니다 ");
		else
			System.out.println(n1+"은 소수가 아닙니다");
	}

}

class Absolute{
	public int absoluteCheck(int n1) {
		if(n1 < 0) return -n1;
		else return n1;
	}
	public void outPut(int n1,int re) {
		System.out.println(n1+"의 절대 값은 : "+re+" 입니다.");
	}

}
