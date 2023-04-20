package letcode;

public class bubble {
	
	    public static void main(String[] args) {
	        int[] arr = {5, 1, 4, 2, 8};
	       int temp=0;
	      

	        for (int i = 1; i <=arr.length ; i++) {
	            for (int j = 0; j <arr.length-1; j++) {
	                if (arr[j] > arr[j+1]) {
	                    
	                     temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }


	        System.out.println("Sorted Array:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


