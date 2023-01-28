package ticketPrice;

import java.util.Scanner;

public class MiniProjects {

	public static void main(String[] args) {
//		FACTORIAL
		/*
		 * } Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("factorial syaisi girniz: "); double i = sc.nextInt();
		 * double result = 1;
		 * 
		 * while (i > 0) {
		 * 
		 * result = result * i; i--; }
		 * 
		 * System.out.println("result= " + result);
		 */

//		SADE EDED
		/*
		 * Scanner sc = new Scanner(System.in); int eded = 0; boolean asal = true; do {
		 * System.out.println("Please add an integer bigger than 2!");
		 * System.out.println("Ededi daxill edin: "); eded = sc.nextInt(); } while (eded
		 * <= 2);
		 * 
		 * for (int i = 2; i < eded; i++) { if (eded % i == 0) { asal = false; break; }
		 * } if (asal) { System.out.println(eded + " sade ededdir"); } else {
		 * System.out.println(eded + " sade eded deyil"); }
		 */

//		ARMSTRONQ SAYISI
		/*
		 * int temp, teklik, onluq, yuzluk, sum; for (int i = 100; i < 999; i++) { temp
		 * = i; teklik = temp % 10; temp /= 10; onluq = temp % 10; temp /= 10; yuzluk =
		 * temp % 10;
		 * 
		 * sum = (teklik * teklik * teklik) + (onluq * onluq * onluq) + (yuzluk * yuzluk
		 * * yuzluk); if (sum == i) { System.out.println(i + " Armstronq sayisidir!"); }
		 * }
		 */

//		FIBONACCHI
		/*
		 * int n1 = 1, n2 = 2, sum; System.out.println(n1 + " fibonacchi sayisidr!");
		 * System.out.println(n2 + " fibonacchi sayisidr!");
		 * 
		 * for (int i = 1; i <= 1000; i++) { sum = n1 + n2; if (sum > 1000) break;
		 * System.out.println(sum + " fibonacchi sayisidr!"); n1 = n2; n2 = sum;
		 * 
		 * }
		 */

//		EBOB ve EKOB
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Ilk tam ededi daxil edin: "); int first = sc.nextInt();
		 * System.out.println("Ikinci tam ededi daxil edin: "); int second =
		 * sc.nextInt(); int ebob = 1; int ekob;
		 * 
		 * int min = (first < second) ? first : second;
		 * 
		 * for (int i = min; i > 0; i--) { if ((first % i == 0) && (second % i == 0)) {
		 * ebob = i; break; } }
		 * 
		 * ekob = (first * second) / ebob; System.out.println(first + " ve " + second +
		 * " ededlerinin ebobu " + ebob + " ededidir"); System.out.println(first +
		 * " ve " + second + " ededlerinin ekobu " + ekob + " ededidir");
		 * 
		 * // if (first < second) { // for (int i = first; i > 0; i--) { // if (first %
		 * i == 0 && second % i == 0) { // System.out.println(first + " ve " + second +
		 * " ededlerinin ebobu " + i + " ededidir"); // break; // } // // } // } else if
		 * (second < first) { // for (int i = second; i > 0; i--) { // if (first % i ==
		 * 0 && second % i == 0) { // System.out.println(first + " ve " + second +
		 * " ededlerinin ebobu " + i + " ededidir"); // break; // } // // } // } else {
		 * // System.out.println("Verilen ededler  bir birine beraberdi!"); // }
		 */

//		countDigit(121);

//		Polindrom
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Ededi daxil edin:");
		 * int digit = sc.nextInt(); int polindrom = getPolindrom(digit); if (digit ==
		 * polindrom) { System.out.println(digit + " is polindrom"); }else {
		 * System.out.println(digit+" is not polindrom"); }
		 */

//		Polindrom String
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Sozu daxil edin: ");
		 * String word = sc.next(); String tmp = ""; for (int i = word.length() - 1; i
		 * >= 0; i--) { tmp += word.charAt(i); }
		 * 
		 * if (tmp.equalsIgnoreCase(word)) System.out.println(word + " is polindromic");
		 * else System.out.println(word + " is not polindromic");
		 */
	}

	public static int countDigit(int n) {

		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}

		return count;
	}

	public static int getPolindrom(int n) {
		int r = 0;
		while (n != 0) {
			r = (r * 10) + (n % 10);
			n = n / 10;
		}

		return r;
	}
}
