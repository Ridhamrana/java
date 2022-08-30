package module2;
class par{
	public void parent() {
		System.out.println("This is a parent class");
	}
}
class chil extends par{
	public void child() {
		System.out.println("This is child class");
	}
}
public class b10 {
	public static void main(String[] args) {
		par p = new par();
		p.parent();
		chil c= new chil();
		c.child();
		c.parent();
	
		}
}
