
public class ObligOppgave2 {

	public static void main(String[] args) {
	int[][] terreng = {
			
			{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
            { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
            { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 } };

	skrivUt(terreng);
	tilStreng(terreng);
	erLik(terreng);
	}
	
	// a)
	public static void skrivUt(int[][] matrise) {

		
	}


	//b
	public static String tilStreng(int[][] matrise) {
	            
		
		   int i = 0;
		   int b = matrise.length - 1;
		   
		   String str = "null";
		   String hjelp = "";
		   String start = " ";
		   String slutt = "\n";
		   
		   while(i< matrise.length - 1) {
			   str = Integer.toString(matrise[i]);
			   hjelp = hjelp + str + ",";
			   i++;
		   }
		   
		   hjelp = start + hjelp + matrise[b] + slutt;
		   return hjelp;
	}
	
	
//d)

	public static boolean erLik(int[][] mat1, int[][] mat2) {
		boolean a = mat1;
		boolean b = mat2;
		
		boolean bool = true;
	      System.out.println("Boolean Value: "+bool);
	      int val = (bool) ? 1 : 0;
	      // Integer
	      System.out.println("Integer value: "+val);
		
	
	}
	}
	
	
