package Assignment2;

public class Employee {
int empid;
String name;
double salary;

public Employee(int id,String n,double s)
{
   empid=id;
   name=n;
   salary=s;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
}


}
