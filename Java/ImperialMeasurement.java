import java.util.Scanner;

class Main {
	
	public static int getIndex (String s) {
		int num = 0;
		switch (s) {
			case "inch":
			case "in":{
				num = 1;
				break;
			}
			case "foot":
			case "ft":{
				num = 2;
				break;
			}
			case "yard":
			case "yd":{
				num = 3;
				break;
			}
			case "chain":
			case "ch":{
				num = 4;
				break;
			}
			case "furlong":
			case "fur":{
				num = 5;
				break;
			}
			case "mile":
			case "mi":{
				num = 6;
				break;
			}
			case "league":
			case "lea":{
				num = 7;
				break;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		  
	    Scanner scan = new Scanner(System.in);
	    String input;
	    double val;
	    int from, to;
	    int measures[] = {1, 1000, 12, 3, 22, 10, 8 , 3};
	    
	    input = scan.nextLine();
	    String[] sp = input.split(" ");
	    
	    val = Integer.parseInt(sp[0]);
	    from = getIndex(sp[1]);
	    to = getIndex(sp[3]);
	
	    while(from != to) {
	    	if(from < to) {
	    		from++;
	    		val /= measures[from];
	    	}
	    	else if (from > to) {
	    		val *= measures[from];
	    		from--;
	    	}
	    }
	    System.out.println(val);
	    scan.close();
	}
  
}
