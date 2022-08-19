package day21;

public class Prime {
	public static void main(String[] args) {
		int a = 1000;
		int count = 0;
		int ans = 0;
		boolean b = false;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
			if (count == 83) {
				ans = ans + i;
			}

		}
		System.out.println(ans);
	}
}
