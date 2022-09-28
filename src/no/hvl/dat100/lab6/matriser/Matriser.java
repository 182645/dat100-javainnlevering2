package no.hvl.dat100.lab6.matriser;

import static java.lang.Integer.*;

public class Matriser {
	
	public static void main (String [] args) {
		int tall = 2;
		int[][] terreng = { 
				{ 0, 3, 6, 8, 10, 13},
				{ 7, 2, 9, 78, 2, 34},
				{ 2, 0, 4, 5, 12, 17}};
		
		
		
		
		skrivUt(terreng);
		System.out.println("\n");
		skrivUt(speile(terreng));
		System.out.println("\n");
		skrivUt(skaler(tall,terreng));
		
	
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		//int [] rad git elementet i rad og ikke plassering
		for(int [] rad : matrise) {
			for (int element : rad) {	
				System.out.print(element + "\t");
			}
			System.out.print("\n");
		}
	}

	// b)
	public static String tilString(int[][] matrise) {


		   int i = 0;
		   int b = matrise.length - 1;
		   
		   String str = "null";
		   String hjelp = "";
		   String start = " ";
		   String slutt = "\n";
		   
		   while(i< matrise.length - 1) {
			   str = Integer.toString(matrise[i][j]);
			   hjelp = hjelp + str + ",";
			   i++;
		   }
		   
		   hjelp = start + hjelp + matrise[b] + slutt;
		   return hjelp;
	}

		
	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int [][] nyTabell = new int [matrise.length][matrise[0].length];
		int b = 0;
		int c = 0;
		int d = 0;
		
		while (b < matrise.length) {
			while (c < matrise[0].length) {
				nyTabell[b][c] = matrise[b][c] * tall;
				c++;
			}
			c = 0;
			b++;
			
		}
		return nyTabell;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
			int rad1, kol1, rad2, kol2;
		

			boolean lik = true;
			
			int[][] terreng1 = {
					{1,2,3},
					{4,5,6}
			};
			
			int[][]terreng2 = {
					{1,2,3},
					{4,5,6}
			};
			
			rad1 = terreng1.length;
			kol1 = terreng1[0].length;
			
			rad2 = terreng2.length;
			kol2 = terreng2[0].length;
			
			   if(rad1 != rad2 || kol1 != kol2){    
		            System.out.println("Matrisene er ikke like");    
		        }    
		        else {    
		            for(int i = 0; i < rad1; i++){    
		                for(int j = 0; j < kol1; j++){    
		                  if(terreng1[i][j] != terreng2[i][j]){   
		                	  
		                      lik = false;    
		                      break;    
		                  }    
		                }    
		            }    
		            if(lik)
		            	System.out.println("Matrisene er lik");
		            else
		            	System.out.println("Matrisene er ikke lik");
		        }

	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		//Putter lengde av matrise kolone i rad og matrise rad i kolone
		int [][] nyTabell = new int [matrise[0].length][matrise.length];
		int a = 0;
		int b = 0;
		
		//Setter begrensning for rad
		while (a < matrise.length) {
			//Setter begrensning for koloner
			while (b < matrise[0].length) {
				nyTabell[b][a] = matrise[a][b];
				b++;
			}
		a++;
		b = 0;
		}
	return (nyTabell);
		
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

//		IL
		
//		G
	
		
		
	}
}
