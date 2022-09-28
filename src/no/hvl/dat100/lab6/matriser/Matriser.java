package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
	public static void main (String [] args) {
		int[][] terreng = { 
				{ 0, 3, 6, 7, 8, 10 },
				{ 7, 2, 9, 4, 3, 17 },
				{ 2, 0, 4, 5, 9, 13 }};
		
		
		
		
		skrivUt(terreng);
		System.out.println("\n");
		System.out.println(terreng.length);
		System.out.println();
		skrivUt(skaler(2,terreng));
		
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		
		for(int [] rad : matrise) {
			for (int element : rad) {	
				System.out.print(element + " ");
			}
			System.out.print("\n");
		}
	}

	// b)
	public static String tilString(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int [][] nyTabell = new int [matrise.length][matrise[0].length];
		int b = 0;
		int c = 0;
		
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

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
