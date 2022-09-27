package no.hvl.dat100.lab5.tabeller;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Tabeller {

	public static void main(String[] args) {
		int [] tab1 = {2,4,5,6,8,12};
		int tall = 12;
		
		System.out.print("skrivUt: "); skrivUt(tab1);
		System.out.println("\n");
		System.out.println("tilString: " + tilString(tab1));
		System.out.println();
		System.out.println("summer med While: " + summerW(tab1));
		System.out.println();
		System.out.println("summer med for: " + summerFor(tab1));
		System.out.println();
		System.out.println("summer med utvidet for: " + summerUFor(tab1));
		System.out.println();
		System.out.println("Tall finnes i tabell: " + finnesTall(tab1, tall));
		System.out.println();
		System.out.println("Posisjon til tall: " + posisjonTall(tab1, tall));
		System.out.println();
		System.out.println("Er tabellen sortert? " + erSortert(tab1));
		System.out.println();
		reverser(tab1);
		System.out.print("Reversert tabell: "); skrivUt(tab1);
		System.out.println("\n");
		System.out.println("Er tabellen sortert? " + erSortert(tab1));
		
	}
	
	// a)
	public static void skrivUt(int[] tabell) {

		int i = 0;
		
		while(i < tabell.length) {
			System.out.print(tabell[i] + " ");
			i++;
		}

	}

	// b)
	public static String tilString(int[] tabell) {

		int i = 0;
		int b = tabell.length - 1;
		
		String str = "null";
		String hjelp = "";
		String start = "[";
		String slutt = "]";
		
		while(i < (tabell.length - 1)) {
		str = Integer.toString(tabell[i]);
		hjelp = hjelp + str + ",";
		i++;
		}
		
		hjelp = start + hjelp + tabell[b]+ slutt;
		return hjelp;
		
	}

	// c) - while
	public static int summerW(int[] tabell) {

		int i = 0;
		int n = 0;
		
		while(i < tabell.length) {
			n += tabell[i];
			i++;
		}
		return n;
	}
	
	// c) - for
	public static int summerFor(int[] tabell) {
		int n = 0;
			
		for(int i = 0; i < tabell.length; i++) {
			n += tabell[i];
		}
		return n;
		}
	
	// c) - utvidet for
	public static int summerUFor(int[] tabell) {
		int n = 0;
		int b = 0;
		
		for(int i : tabell) {
			n += tabell[b];
			b++;
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
			tabell[tabell.length-1-i] = b;
			i++;
		}
		
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean b = false;
		
		for (int i = 1; i < tabell.length; i++)
			if ((tabell[i-1]) < tabell[i]) {
				b = true;
				i++;
			}
			else {
				b = false;
				break;
			}
		
		return b;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
