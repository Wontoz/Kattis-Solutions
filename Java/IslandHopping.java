import java.io.*;

class IslandHopping {
	
	static int[] parent;
 	public static void main(String[] args) throws NumberFormatException, IOException {
		  
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int cases = Integer.parseInt(br.readLine());
		
		while(cases --> 0){
			int islands = Integer.parseInt(br.readLine());
			
			Vertice[] island = new Vertice[islands];
			
			String line[];
			for(int j = 0; j < islands; j++) {
				line = br.readLine().split(" "); 
				island[j] = new Vertice(Double.parseDouble(line[0]), Double.parseDouble(line[1]));
			}
			
            double distances[][] = new double[islands][islands] ;
            
            for(int j = 0; j < islands; j++) {

                for(int k = 0; k < islands; k++) {
                    if(j != k)                                            
                        distances[j][k] = calcDist(island[j].x, island[k].x, island[j].y, island[k].y);
                }
            }
            calcMST(distances, islands);
		}
	}
 	
 	public static double calcDist(double x1, double x2, double y1, double y2) {
 		
 		double x = x1 - x2;
 		double y = y1 - y2;
 		
 		return Math.hypot(x, y);
 	}
 	
 	public static void calcMST(double[][] distances, int islands) {
 		boolean mstSet[] = new boolean[islands]; 
		double totalLength = 0;
		mstSet[0] = true;
		int numCon = 1; 

		double key[] = new double[islands]; 

		for(int i = 0; i < islands; i++){
			key[i] = distances[0][i]; 
		}

		while(numCon != islands){

			int min_index = -1; 
			double min_value = Integer.MAX_VALUE; 

			for(int i = 0; i<islands; i++){
				if(mstSet[i] == false && key[i] < min_value){
					min_value = key[i]; 
					min_index = i; 
				}
			}

			mstSet[min_index] = true;
			totalLength += min_value; 
			numCon++; 

			for(int i = 0; i<islands; i++){
				key[i] = Math.min(key[i], distances[min_index][i]); 
			}

		}
		System.out.printf("%.5f \n" , totalLength);
 	}

 	public static class Vertice{
 		double x;
 		double y;
 		
 		public Vertice(double x, double y) {
 			this.x = x;
 			this.y = y;
 		}
 	}
}
