package Assignment1;

public class Question7 {

	public static void main(String[] args) {
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 } ;
		int x=4;
		int r=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=x)
			{
				r++;
			}
		}
		System.out.println("Rank of "+x+" is "+r);	
	}
	

}
