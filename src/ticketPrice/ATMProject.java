package ticketPrice;

import java.util.Scanner;

public class ATMProject {

	public static void main(String[] args) {

		int mebleg = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("SM banka xos gelmisiniz!");
		while (true) {
			System.out.println();
			System.out.println(
					"1. Hesabdaki meblegi goster \n" + "2. Hesabdan pul cek \n" + "3. Hesaba pul qoy \n" + "4. Cix");
			System.out.println("Emeliyyatin novunu daxil edin:");
			int emeliyyet = sc.nextInt();

			if (emeliyyet == 1) {
				System.out.println("Sizin hesabinizdaki meblegin miqdari: " + mebleg + " AZN");
			} else if (emeliyyet == 2) {

				System.out.println("Cekmek istediyiniz meblegi daxil edin:");
				int cekilenMebleg = sc.nextInt();
				if (cekilenMebleg > mebleg) {
					System.out.println("Balansinizda kifayet qeder vesait qalmayib");
				} else {
					mebleg -= cekilenMebleg;
					System.out.println("Emeliyyat ugurla basa catdi");
				}

			} else if (emeliyyet == 3) {
				System.out.println("Qoymaq istediyiniz meblegi daxil edin:");
				int qoyulanMebleg = sc.nextInt();
				mebleg = +qoyulanMebleg;
				System.out.println("Emeliyyat ugurla basa catdi");
			} else if (emeliyyet == 4) {
				System.out.println("Sitemden cixdiniz");
				break;

			} else {
				System.out.println("Yalnis emeliyyat novu!");
			}
		}

	}

}
