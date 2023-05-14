import java.util.Scanner;
public class Kocka {
		public static void main(String[] args) {
		double a, perimetar, plostina;
		Scanner tastatura = new Scanner(System.in);

		System.out.println("Programata presmetuva plostina i perimetar na kocka");

		System.out.println("Vnesete strana A: ");
		/// Takes user input for A value
		a = tastatura.nextDouble();
		
		perimetar = 4*a;
		
		plostina = a*a;
		
		System.out.println("Perimetarot na pravoagolnikot iznesuva " + perimetar + ", a plostinata: " + plostina);
		
}
}
