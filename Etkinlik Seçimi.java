package For;
import java.util.Random;
import java.util.Scanner;


public class SwitchDeneme2 {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			int rastgeleSayi = (int) (Math.random() * 10) + 1;
			// int ondalıklı kısmı atar , + 1 Sayıyı 1 ile 10 aralığına taşır ,
			// Math random ise 0 ile 9.999 arasında bir değer üretir
			
			System.out.println("1 ile 10 arasında rastgele sayı: " + rastgeleSayi);
			
			switch(rastgeleSayi) {
			
				case 1:
					System.out.println("Kamp Yapmak");
					break;
				case 2:
					System.out.println("Sinemaya Gitmek");
					break;
				case 3:
					System.out.println("Piknik Yapmak");
					break;
				case 4:
					System.out.println("Konsere Gitmek");
					break;
				case 5:
					System.out.println("Akşam Yemeği");
					break;
				case 6:
					System.out.println("Kutu Oyunu");
					break;
				case 7:
					System.out.println("Buluşmayalım");
					break;
				case 8:
					System.out.println("Ders Çalışmak");
					break;
				case 9:
					System.out.println("Bursa Turu");
					break;
				case 10:
					System.out.println("Kano Turu");
					break;
					
		}			
		}

	
}
