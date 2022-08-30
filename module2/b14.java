package module2;



abstract class parent{
	public abstract void message();
}
class son extends parent {

	@Override
	public void message() {
		System.out.println("this first subclass");
		
	}
	
		
	}
class daughter extends parent{

	@Override
	public void message() {
		System.out.println("this second subclass");
		
	}
	
}
public class b14 {
	public static void main(String[] args) {
		son s =new son();
		s.message();
		daughter d = new daughter();
		d.message();
	}
	
}

