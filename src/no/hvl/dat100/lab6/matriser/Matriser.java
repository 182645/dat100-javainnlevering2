package no.hvl.dat100.lab6.matriser;

import static java.lang.Integer.*;

public class Matriser {
	
	public static void main (String [] args) {
		int tall = 2;
		int[][] terreng = { 
				{ 0, 3, 6, 8, 10, 13},
				{ 7, 2, 9, 78, 2, 34},
				{ 2, 0, 4, 5, 12, 17}};
		
		int[][] terreng2 = { 
				{ 0, 3, 6, 8, 10, 13},
				{ 7, 2, 9, 78, 2, 34},
				{ 2, 0, 4, 5, 12, 17}};
		
		
		skrivUt(terreng);
		System.out.println("\n");
		System.out.println("til string:" + "\n" + tilStreng(terreng));
		System.out.println("\n");
		skrivUt(skaler(tall,terreng));
		System.out.println("\n");
		System.out.println(erLik(terreng, terreng2));
		System.out.println("\n");
		skrivUt(speile(terreng));
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {

		// int [] rad git elementet i rad og ikke plassering
		for (int[] rad : matrise) {
			for (int element : rad) {
				System.out.print(element + "\t");
			}
			System.out.print("\n");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		int i = 0;
		int j = 0;
		int b = matrise.length - 1;

		String str = "null";
		String hjelp = "";

		while (i <= b) {
			while (j < matrise[0].length - 1) {
			str = Integer.toString(matrise[i][j]);
			hjelp = hjelp + str + ", ";
			j++;
		}
			hjelp += matrise[i][j] + "\n";
			j = 0;
			i++;
		}
	//	hjelp = start + hjelp + matrise[b][matrise [b].length - 1] + slutt;
		return hjelp;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int b = 0;
		int c = 0;
		
		if (matrise.length == 0) {
			System.out.println("Ikke innhold i tabellen");
			return matrise;
}
		else {
		int [][] nyTabell = new int [matrise.length][matrise[0].length];
		
			//teller opp rader
			while (b < matrise.length) {
				//Teller opp koloner
				while (c < matrise[0].length) {
					nyTabell[b][c] = matrise[b][c] * tall;
					c++;
				}
				c = 0;
				b++;
			
			}
		return nyTabell;
		}
		
		
	}

	// d)

	public static boolean erLik(int[][] mat1, int[][] mat2) {
		int rad1, kol1, rad2, kol2;

		boolean a = true;

		// beregner rader og kolonner i terreng1
		rad1 = mat1.length;
		kol1 = mat1[0].length;

		// beregner rader og kolonner i terreng2
		rad2 = mat2.length;
		kol2 = mat2[0].length;

		// løkke som beregner om matrisene er equal
		if (rad1 != rad2 || kol1 != kol2) {
			return a;

		} else {
			for (int i = 0; i < rad1; i++) {
				for (int j = 0; j < kol1; j++) {
					if (mat1[i][j] != mat2[i][j]) {
						a = false;

					}
				}
			}
		}

		return a;

	}    
		            
	// e)
	public static int[][] speile(int[][] matrise) {

		// Putter lengde av matrise kolone i rad og matrise rad i kolone
		int[][] nyTabell = new int[matrise[0].length][matrise.length];
		int a = 0;
		int b = 0;

		// Setter begrensning for rad
		while (a < matrise.length) {
			// Setter begrensning for koloner
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
//	public static int[][] multipliser(int[][] a, int[][] b) {

}
// } 
