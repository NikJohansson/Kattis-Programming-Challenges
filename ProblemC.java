package tink;

import java.util.Scanner;

public class ProblemC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();
		long digits = 1;
		long fives=0;
		long twos=0;
		for (long i = 1; i<n+1; i++) {
			long k = i;
			while (k % 5 == 0) {
				k /= 5;
				fives++;
			}
			while (k % 2 == 0) {
				k /= 2;
				twos++;
			}
			digits *= k;
			digits = digits - 1000 * (digits / 1000);
		}
		for (long i = 0; i<twos-fives; i++) {
			digits*=2;
			digits = digits - 10000 * (digits / 10000);
		}
		int zeros = 0;
		if (digits > 99 && (digits / 100) % 10 == 0) {
			zeros++;
			if ((digits / 10) % 10 == 0) {
				zeros++;
			}
		}
		digits = digits - 1000 * (digits / 1000);
		

		for (int i = 0; i < zeros; i++) {
			System.out.print("0");
		}
		System.out.println(digits);
	}
}