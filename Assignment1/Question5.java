package Assignment1;

public class Question5 {

	public static void main(String[] args) {
		
		int arr[]= {8,7,6,5,4,3,2,1};
		
		int r=binarySearch(arr,0,arr.length-1, 4);
		System.out.println(r);
		
	}

	private static int binarySearch(int[] arr,int left,int right, int k) {
		
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==k)
			{
				return mid;
			}
			if(arr[mid]>k)
			{
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
		
	}

}
