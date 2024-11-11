package Assignment1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,13,68,5,4,24,21,21};
		System.out.println("Enter the element to find and occurence");
		
		Scanner sc=new Scanner(System.in);
	int key=sc.nextInt();
	int o=sc.nextInt();
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==key) {
			count++;
			if(count==o) {
				System.out.println("ELement found at index "+i);
			break;
			}
		}
	}
	System.out.println("not found");
	}
	

}
