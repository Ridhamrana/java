package module2;
class Member{
	String name;
	int age;
	int salary,phone;
	public void printSalary(String name, int age, int salary, int phone) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.phone=phone;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", salary=" + salary + ", phone=" + phone + "]";
	}
}
class employee extends Member{
	String spacialization;
	
}
class manager extends Member{
	String department;
}
public class b11 {
	public static void main(String[] args) {
		employee e= new employee();
		e.printSalary("ridham", 21, 25000, 997474646);
		System.out.println(e);
		
		manager m = new manager();
		m.printSalary("anshu", 29, 50000, 987937);
		System.out.println(m);
		}
}
