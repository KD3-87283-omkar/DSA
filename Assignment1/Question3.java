package Assignment1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[]=new Employee[4];
		
			e[0]=new Employee(1, "omkar");
			e[1]=new Employee(2, "mayur");
			e[2]=new Employee(0, "harshad");
			e[3]=new Employee(8, "warsi");
			
			Employee e1=searchById(e,8);
			System.out.println(e1);
			
			Employee e2=searchByName(e, "warsi");
			System.out.println(e2);
			

	}

	private static Employee searchById(Employee[] e,int id) {
		
		
		for(int i=0;i<e.length;i++) {
			if(e[i].getId()==id)
			{
				return e[i];
			}
		}
		return null;
	}
private static Employee searchByName(Employee[] e,String name) {
		
		
		for(int i=0;i<e.length;i++) {
			if(e[i].getName()==name)
			{
				return e[i];
			}
		}
		return null;
	}
}
