package module2;
class pre{
	public void printn(int a, char b) {
		System.out.println("interger: "+a +" chara: "+b);
	}
	public void printn(char b, int a) {
		System.out.println("char: "+b +" int: "+a);
	}
}
public class b8 {
	public static void main(String[] args) {
		pre p = new pre();
		p.printn(2, 'e');;
		p.printn('a', 1);
	}
}
