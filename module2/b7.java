package module2;
class printNumber{
	public void printn(int a) {
		System.out.println(a);
	}
	public void printn(float b) {
		System.out.println(b);
	}
	public void printn(double c) {
		System.out.println(c);
	}
	public void printn(char d) {
		System.out.println(d);
	}
}
public class b7 {
public static void main(String[] args) {
	printNumber p=new printNumber();
	p.printn(10);
	p.printn(12.23);
	p.printn(23455.2);
	p.printn('d');
}
}
