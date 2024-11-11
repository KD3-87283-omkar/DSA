package Assignment1;

public class Question1 {

	public static int linearSearch(int arr[],int k)
	{
		int temp=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				temp=i;
			}
		}
		return temp;
		
	}
	public static void main(String[] args) {
		int arr[]= {11,55,20,71,44,20};
		int result=linearSearch(arr,200);
		System.out.println(result);
		
	}

}
