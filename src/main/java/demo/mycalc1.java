package demo;

public class mycalc1 {
	public int sum(int a, int b) {
		return a+b;
	}
	public int diff(int a, int b) {
		return a-b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mycalc1 c=new mycalc1();
		System.out.println("sum is"+c.sum(20, 10));
		System.out.println("sum is"+c.diff(20, 10));
	}

}
