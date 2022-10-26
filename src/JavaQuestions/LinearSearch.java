package JavaQuestions;

import java.util.Scanner;

public class LinearSearch {

    public int search(int[] arr, int num){

        for(int i=0; i<arr.length; i++){

            if(arr[i]==num){
                return i+1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearSearch searchProcess = new LinearSearch();
        int[] arr = {1,2,3,4};
        int tar = sc.nextInt();
        int res = searchProcess.search(arr, tar);
        if(res!=0){
            System.out.println("Number is at index :"+res);
        }
        else{
            System.out.println("Not Found!!");
        }


    }

}
