// To find the maximum element in array
public class Maximumelement
{
	public static void main(String[] args) {
	int [] arr = { 1,2,3,4,5,6};
	int max=0;
	
	for(int e: arr){
	    if(e>max){
	        max=e;
	    }
	    
	}
	
	System.out.println("The Maximum Element in an array is: "+max);
	}
}
S