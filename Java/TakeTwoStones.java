import java.util.Scanner;

class Main {
	
  public static void main(String[] args) {
	  
    Scanner scan = new Scanner(System.in);
    String winner;
    int stones = scan.nextInt();
    
    winner = ((stones % 2 == 0) ? "Bob" : "Alice");
    System.out.println(winner);
    
    scan.close();
  }
  
}
