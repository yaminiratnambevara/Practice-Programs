package database1;

public class ArraysPrgm {
	 public static void main(String args[])
	    {
	       final int arr1[] = {1, 2, 3, 4, 5, 6};
	       int arr2[] = {10, 20, 30, 40, 50};
	       arr2 = arr1;      
	      // arr1 = arr2;  
	       for (int i = 0; i < arr2.length; i++)
	          System.out.println(arr2[i]);          
	    }    
}
