import java.util.Scanner;


public class main {
	

	
	public static void igneYaratma(double lenght) {
		
		double x1 = Math.random();
		double y1 = Math.random();
		
	
	//	lenght = Math.sqrt()
		
	}
	
	public static boolean igneCizgiyeDegiyorMu() {
		
		return true;
	}

	public static void main(String[] args) {

		int denemeSayisi=0;
		double lenght=0;
		double height=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("H deðerini giriniz : ");
			height = sc.nextDouble();
			System.out.println();
		} while (height<=0);
		
		
		do {
			System.out.print("L deðerini giriniz(H deðerinden büyük olamaz) : ");
			lenght = sc.nextDouble();
			System.out.println();	
		} while (height<lenght);
		

		do {
			System.out.print("Deneme Sayýsýný giriniz : ");
			denemeSayisi = sc.nextInt();
			System.out.println();
		} while (denemeSayisi<=0);
		
		
		for (int i = 0; i < denemeSayisi; i++) {
			igneYaratma(lenght);
			igneCizgiyeDegiyorMu();
		}
		
	}

}
