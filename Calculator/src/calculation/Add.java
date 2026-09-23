package calculation;

public class Add {
	public int addition(int a, int b) {
		int res = a+b;
		return res;
	}
	public int subtraction(int a, int b) {
		int res = a-b;
		return res;
	}
	public int multiplication(int a, int b) {
		int res = a*b;
		return res;
	}
	public int division(int a, int b) {
		int res = a/b;
		return res;
	}
	public int mod(int a, int b) {
		int res = a%b;
		return res;
	}
	public static void main(String[] args) {
		Add a = new Add();
		System.out.println("Addition :"+a.addition(12,67));
		System.out.println("Subtraction :"+a.subtraction(45, 90));
		System.out.println("Multiplication :"+a.multiplication(54, 4));
		System.out.println("Division :"+a.division(54, 9));
		System.out.println("Modulus :"+a.mod(54, 8));
	}

}
