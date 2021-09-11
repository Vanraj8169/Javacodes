// To find whether array is sorted 
public class Arraysorted
{
	public static void main(String[] args) {
	int [] arr = { -6,-5,-4,-3,-2,-1};
	int l = arr.length;
	boolean isSorted= false;
	
	for(int i=0;i<l-1;i++){
	    if(arr[i]<arr[i+1]){
	        isSorted=true;
	    }
	    else{
	        isSorted=false;
	    }
	}
	if(isSorted=true){
	    System.out.println("The Array is sorted.");
	}
	else {
	     System.out.println("The Array is not sorted.");
	}
	}
}
