package For;
import java.util.Scanner;


public class KullanıcıGirişi {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int giris_hakki = 3;
		
		String sys_kullanici_adi = "Mustafa Murat";
		String sys_parola = "12345";
		
		System.out.println("**********************");
		System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
		System.out.println("**********************");
		
		while (true) {
			System.out.println("Kullanıcı Adı : ");
			String kullanici = scanner.nextLine();
			System.out.println("Parola : ");
			String parola = scanner.nextLine();
			
			parola.equals(sys_parola)
			
		}
		
	}
	
	

}
