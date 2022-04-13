import java.util.Scanner;

class Kattis {
	
	public static void main(String[] args) {
		  
		Scanner scan = new Scanner(System.in);	
		int l = scan.nextInt();
		int r = scan.nextInt();
		
		System.out.println(l == 0 && r == 0? "Not a moose": l == r? "Even " +(l + r): l < r? "Odd " + (r * 2): "Odd " + (l * 2));
	}
}
