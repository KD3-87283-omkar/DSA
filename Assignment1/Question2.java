package Assignment1;

public class Question2 {
public static int CountLinearSearchComparison(int arr[],int k)
{
	int comparison=0;
	for(int i=0;i<arr.length;i++)
	{
		comparison++;
		if(arr[i]==k)
		{
			return comparison;
		}
	}
	return -1;
}
public static int CountBinarySearchComparison(int arr[],int left,int right,int k)
{
	int comparison=0;
	while(left<=right) {
		int mid=(left+right)/2;
		comparison++;
		if(arr[mid]==k)
		{
			return comparison;
		}if(k<arr[mid])
		{
			right=mid-1;
		}
		else {
			left=mid+1;
		}
	}
	return -1;
}
public static void main(String args[])
{
	int arr[]= {2,5,7,1,4,1,12};
	int r=CountLinearSearchComparison(arr, 12);
	System.out.println(r);
	int arr1[]= {2,5,7,8,10,11,12};
	int r1=CountBinarySearchComparison(arr1,0,arr1.length-1, 8);
	System.out.println(r1);
}

}
