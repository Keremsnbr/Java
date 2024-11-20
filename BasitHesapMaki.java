package For;
import java.util.Scanner;

public class kitleindeks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***************************************");
		String islemler ="1. Toplama İşlemi \n"+
						 "2. Çıkarma İşlemi \n"+
						 "3. Çarpma İşlemi \n"+
						 "4. Bölme İşlemi";
		System.out.println(islemler);
		System.out.println("**************************************");
		System.out.println("İşlemi Seçiniz:");
		String islem = scanner.nextLine();
		int a;
		int b;
		
		switch(islem) {
		  case "1":
			  System.out.println("Birinci Sayı: ");
			  a = scanner.nextInt();
			  System.out.println("İkinci Sayı: ");
			  b = scanner.nextInt();
			  System.out.println("Toplam : " + (a+b));
		  case "2":
			  System.out.println("Birinci Sayı: ");
			  a = scanner.nextInt();
			  System.out.println("İkinci Sayı: ");
			  b = scanner.nextInt();
			  System.out.println("Toplam Fark : " + (a-b));
		  case "3":
			  System.out.println("Birinci Sayı: ");
			  a = scanner.nextInt();
			  System.out.println("İkinci Sayı: ");
			  b = scanner.nextInt();
			  System.out.println("Çarpımı : " + (a * b));
		  case "4":
			  System.out.println("Birinci Sayı: ");
			  a = scanner.nextInt();
			  System.out.println("İkinci Sayı: ");
			  b = scanner.nextInt();
			  System.out.println("Bölüm : " + ((double)a / b));
			  
			  
			  
			  
			  
		}
		
	}
}
