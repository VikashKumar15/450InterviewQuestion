package JavaQuestions;

//Finding min max from any array.


 public class question2 {
	
	
	 static class Pair{
			int min;
			int max;
			
		}
	 
	 static Pair getMinMax(int array[], int n) {
		 Pair minMax = new Pair();
		 
		 if(n==1) {
			 minMax.max = array[0];
			 minMax.min = array[0];
		 }
		 
		 else {
			 if(array[0]>array[1]) {
				 minMax.max = array[0];
				 minMax.min = array[1];
			 }
			 else {
				 minMax.max = array[1];
				 minMax.min = array[0];
			 }
			 
			 if(n>2) {
				 for(int i=2; i<n;i++) {
					 if(array[i]<=minMax.min) {
						 minMax.min=array[i];
					 }
					 else if(array[i]>=minMax.max) {
						 minMax.max = array[i];
					 }
				 }
				 
			 }
		 }
		 
		 return minMax;
	 }

	public static void main(String args[]) {
		
		int array[] = {1,2,3,4,5};
		
		System.out.println("Max element is: "+getMinMax(array, 5).max);
		System.out.println("Min element is: "+getMinMax(array, 5).min);
		
		
	}

}
