package Assignment1;
public class Question6 {
	public static int firstNorRepeat(int arr[],int k) {
	for(int i=0;i<arr.length;i++)
	{
		int cnt=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				cnt++;
				if(cnt>1)
				{
					break;
				}
			}
		}
		if(cnt==1)
		{
			 return arr[i];
		}
	}
	return -1;
}
	public static void main(String[] args) {
	int arr[]= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
	int i=firstNorRepeat(arr, 4);
	System.out.println(i);
	}
}
