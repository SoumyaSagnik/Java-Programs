package recursion;

public class Numbers5to1 {
	public static void main(String[] args) {
		printNumbers(5);
	}
	
	public static void printNumbers(int n) {
		if(n == 0)
			return;
		System.out.println(n);
		printNumbers(n - 1);
	}
}
