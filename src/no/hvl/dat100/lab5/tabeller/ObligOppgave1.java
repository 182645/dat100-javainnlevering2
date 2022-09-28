package no.hvl.dat100.lab5.tabeller;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;


public class ObligOppgave1 {

	public static void main(String[] args) {
		
		int[] tabell = {1, 3, 8, 6, 4, 5};
		int tall = 12;
		
		
		skrivUt((tabell));
		tilStreng((tabell));
		summer((tabell));
		
		
		
		System.out.print("skrivUt: "); skrivUt(tabell);
		System.out.println("\n");
		System.out.println("tilString: " + tilStreng(tabell));
		System.out.println();
		System.out.println("summer med While: " + summerW(tabell));
		System.out.println();
		System.out.println("summer med for: " + summer(tabell));
		System.out.println();
		System.out.println("summer med utvidet for: " + summerUFor(tabell));
		System.out.println();
		System.out.println("Tall finnes i tabell: " + finnesTall(tabell, tall));
		System.out.println();
		System.out.println("Posisjon til tall: " + posisjonTall(tabell, tall));
		
	}
	//a
	public static void skrivUt (int[] tabell) {

		
		for (int i = 0; i<tabell.length; i++ ) {
		System.out.println(tabell[i]);
		
	}
	}
//b
	   public static String tilStreng (int[] tabell) {
		   
		   int i = 0;
		   int b = tabell.length - 1;
		   
		   String str = "null";
		   String hjelp = "";
		   String start = "[";
		   String slutt = "]";
		   
		   while(i< tabell.length - 1) {
			   str =Integer.toString(tabell[i]);
			   hjelp = hjelp + str + ",";
			   i++;
		   }
		   
		   hjelp = start + hjelp + tabell[b] + slutt;
		   return hjelp;
		   
}
	//c - for
      public static int summer (int[] tabell) {
    	 
    	int n = 0;
      	
  
  		for (int i=0; i < tabell.length; i++) {
  			n += tabell[i];
       
  			
  		}
  		return n;
  	    }

      //c- utvidet for 
      public static int summerUFor(int[] tabell) {
    	  int n = 0;
    	  int b = 0;
    	  
    	  for(int i: tabell) {
    		  n += tabell[b];
    		  b++;
    		  
    	  }
    	  return n;
      }
      
      //c- while 
  	public static int summerW(int[] tabell) {

		int i = 0;
		int n = 0;
		
		while(i < tabell.length) {
			n += tabell[i];
			i++;
		}
		return n;
		
  	}
  	
 // d)
  	
 	public static boolean finnesTall(int[] tabell, int tall) {

 		boolean b = false;
 		int i = 0;
 		
 		while (!b && i < tabell.length) {
 				if (tabell[i] == tall) {
 				b = true;
 				}
 				else {
 					i++;
 				}
 	
 	      }	
 		return b;
 		
         }
 	
 	// e)
 	public static int posisjonTall(int[] tabell, int tall) {
 		
 		int n = 0;
 		
 			do {
 				if (tabell[n] == tall) {
 					break;
 				}
 				else {
 					n++;
 				}
 			}while(n < tabell.length);
 		
 			if (n == tabell.length) {
 				n = -1;
 			}
 		
 		return n;
 	}

 	// f)
 	public static int[] reverser(int[] tabell) {
 		
 		int i = 0;
 		int b = 0;
 		int c = 0;
 		
 		while (i <= ((tabell.length - 1)/2)) {
 		
 		 		b = tabell[i];
 		 		
 		 		tabell[i] = tabell[tabell.length-1-i];
 		 		tabell[tabell.length-1-i]= b;
 		 		i++;
 		}
 	    return tabell;
 	}

 	// g)
 	public static boolean erSortert(int[] tabell) {
 		boolean sortert = false;
 		
 		for (int i =1; i < tabell.length; i++)
 			if ((tabell) [i-1] < tabell[i]) {
 				sortert = true;
 				i++;
 			}
 			else {
 				sortert = false;
 				break;
 			}
 			return sortert;
 	       }

 	// h)
 	public static int[] settSammen(int[] tabell1, int[] tabell2) {
 			int nyLengde = tabell1.length + tabell2.length;
 			int[] nyTabell = new int[nyLengde];
 			
 			for(int i=0; i <tabell1.length; i++) {
 				nyTabell[i] = tabell1[i];
 			}
 			
 			for(int j=0; j<tabell2.length; j++) {
 				nyTabell[tabell1.length + j] = tabell2[j];
 			}
 			return nyTabell;	
 			}
}
  	
     
  			
  		
  		
 


 
 

