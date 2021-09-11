// Reverse the elements in array using java 
public class Reversearray
{
	public static void main(String[] args) {
	int [] arr = { 1,2,3,4,5,6};
	int l = arr.length;
	int temp;
	for(int i=0;i<l/2;i++){
	    temp = arr[i];
	    arr[i]= arr[l-i-1];
	    arr[l-i-1]=temp;
	}
	for(int element: arr){
	
	System.out.print(element +" ");
}
	}
}
