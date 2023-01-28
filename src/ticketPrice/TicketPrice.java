package ticketPrice;

import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {

		int km, age, tip;
		double fiyat;
		double yasindirimi, tipIndirimi;

		Scanner sc = new Scanner(System.in);

		System.out.print("Mesafeni daxil edin: ");
		km = sc.nextInt();

		System.out.print("Yasinizi daxil edin: ");
		age = sc.nextInt();

		System.out.print("Biletin tipini daxil edin (Tek yonlu ise - 1, gedis-donus ise - 2): ");
		tip = sc.nextInt();

		if (km > 0 && age > 0 && (tip == 1 || tip == 2)) {
			fiyat = km * 0.10;
			if (age < 12) {
				yasindirimi = fiyat * 0.5;

			} else if (age >= 12 && age <= 24) {
				yasindirimi = fiyat * 0.1;

			} else if (age > 65) {
				yasindirimi = fiyat * 0.3;

			} else {

				yasindirimi = 0;
			}

			fiyat -= yasindirimi;
			if (tip == 2) {
				tipIndirimi = fiyat * 0.2;
				fiyat = (fiyat - tipIndirimi) * 2;

			}
			System.out.println("Fiyat tutari: " + fiyat);
		} else {
			System.out.println("Yalnis melumat daxil etmsisniz, zehmet olmasa tekrar deneyin.");
		}

	}

}
