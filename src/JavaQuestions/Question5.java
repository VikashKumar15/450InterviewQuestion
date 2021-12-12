package JavaQuestions;

public class Question5 {

	public static void rearrangeFirstWay(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

				j++;
			}
		}
	}

	public static void rearrangeSecWay(int[] arr, int left, int right) {

		while (left <= right) {
			
			if (arr[left] < 0 && arr[right] < 0) {
				left++;
			}

			else if (arr[left] > 0 && arr[right] < 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;

			}

			
			else if (arr[left] > 0 && arr[right] > 0) {
				right--;
			}
			else {
				left++;
				right--;
			}
		}
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {

		int[] arr = { 1, 2, 3, 4, -5, -6 };

		display(arr);
		// rearrangeFirstWay(arr);
		rearrangeSecWay(arr, 0, arr.length-1);
		display(arr);
		
		
	}

}
