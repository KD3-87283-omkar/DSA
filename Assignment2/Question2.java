package Assignment2;

public class Question2 {

	
	public static void sortEmployee(Employee arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			Employee e=arr[i];
			int j=0;
			 for( j=i-1;j>=0&&arr[j].getSalary()>e.getSalary(); j--)
			 {
				arr[j+1]=arr[j]; 
			 }
			 arr[j+1]=e;
		}
	}
	public static void main(String[] args) {
		
		Employee e[]= new Employee[4];
			e[0]=new Employee(1,"mayur",80.11);
			e[1]=new Employee(1,"Harshad",33.11);
			e[2]=new Employee(1,"Warsi",28.11);
			e[3]=new Employee(4,"omkar",30.11);
			
			sortEmployee(e);
			for(int i=0;i<e.length;i++)
			{
				System.out.println(e[i]);
			}
			
			
			
	
		
		

	}

}
