package Assignment2;

public class Question1 {
public static void main(String args[])
{
	int arr[]= {5,7,8,1,4,52,9};
	for(int i=1;i<arr.length;i++)
	{
          int temp=arr[i];
          int j;
          for(j=i-1;j>=0&&arr[j]<temp;j--)
          {
        	  arr[j+1]=arr[j];
          }
          arr[j+1]=temp;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
}
}
