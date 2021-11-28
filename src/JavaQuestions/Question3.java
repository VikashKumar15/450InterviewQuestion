package JavaQuestions;

/**
 * @author vikashkumar
 *
 */
public class Question3 { 
	
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        for(int i=1;i<r;i++){
            int key = arr[i];
            int j=i-1;
            
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j-=1;
                
            }
            arr[j+1] = key;
            
            
        }
        for(int m=0;m<l;m++) {
    	   System.out.println(arr[m]);
       }
        return arr[k-1];
    } 
	
	public static void main(String[] args) {
		
		int[] arr = {7, 10, 4, 20, 15};
		int  rr = kthSmallest(arr, 0, 5, 4);
		System.out.println(rr);
	}
}
