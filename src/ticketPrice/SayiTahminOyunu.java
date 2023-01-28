package ticketPrice;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		int can = 5, texmin, i = 0;
		boolean hata = false;
		int[] texminler = new int[5];
		System.out.println("Oyuna xos gelmisiniz! \n" + "5 caniniz var. 0-100 arasi ededi tapin.");

		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		int sayi = random.nextInt(100);
//		System.out.println(sayi);

		while (can > 0) {
			System.out.println("Texmininiz: ");
			texmin = sc.nextInt();

			if ((texmin < 0) || (texmin > 100)) {
				if (hata) {
					System.out.println(
							"Zehmet olmasa 0-100 arasi eded texmin edin! cox xeta etdiyiniz ucun caniniz azaldi, qalan can sayi: "
									+ --can);
				} else {
					System.out.println(
							"Zehmet olmasa 0-100 arasi eded texmin edin! Daha bir xeta etseniz caniniz azalacaq");
					hata = true;
				}
				continue;

			}

			texminler[i++] = texmin;
			if (texmin == sayi) {
				System.out.println("Tebrikler, dogru texmin etdiniz!");
				break;
			} else {
				can -= 1;
				if (can > 0) {
					System.out.println("Yalnis texmin, bir daha cehd edin. Qalan caniniz: " + can);
				} else {
					System.out.println("Yalnis texmin, sizin caniniz qalmadi! Yine bekleriz :)");
				}

			}

		}
		System.out.println("Oyun erzindeki texminleriniz: ");
		for (int value : texminler) {
			if (value != 0)
				System.out.print(value + ",");
		}
		System.out.println("\nDogru cavab: " + sayi);
	}

}
