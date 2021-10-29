public class Employee{
	
	int id,salary;String name;
	Employee(int i,String name,int s){
		this.id=i;
		this.name=name;
		salary=s;
	}
	Employee(){
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(40,"manas",40000);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
	}
}