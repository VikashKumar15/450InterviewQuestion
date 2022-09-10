package JavaQuestions;

public class Question6 {
	
	public static boolean isFound(int[] arr, int num) {
		
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	public static int doUnion(int[] arr1, int[] arr2) {
		
		
		int[] temp = new int[arr1.length+arr2.length];
		int tempInd = 0;
		int rr = 0;
		
		for(int i=0;i<arr1.length;i++) {
			
			
			if(!isFound(temp, arr1[i])) {
				
				temp[tempInd] = arr1[i];
				tempInd+=1;
				rr+=1;
			}
			
		}
		
		for(int i=0;i<arr2.length;i++) {
			
			if(!isFound(temp, arr2[i])) {
				
				temp[tempInd] = arr2[i];
				tempInd+=1;
				rr+=1;
			}
			
		}
		
	return rr;
		
	}
	
	
	public static void main(String args[]) {
		
		int[] arr1 = {85, 25, 1, 32, 54, 6};
		int[] arr2 = {85,2};
		
		System.out.println(doUnion(arr1,arr2));
		
		
	}

}
