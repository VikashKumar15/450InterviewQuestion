package JavaQuestions;

public class Question4 {
	public static void sort012(int a[], int n) {
		int i_0 = 0;
		int i_1 = 0;
		int i_2 = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				i_0 += 1;
			}
			if (a[i] == 1) {
				i_1 += 1;
			}
			if (a[i] == 2) {
				i_2 += 1;
			}
		}
		int m = 0;
		while (m < i_0) {
			a[m] = 0;
			m += 1;
		}
		while (m < i_0 + i_1) {
			a[m] = 1;
			m += 1;
		}
		while (m < i_0 + i_1 + i_2) {
			a[m] = 2;
			m += 1;
		}
	}
}
