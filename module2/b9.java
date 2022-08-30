package module2;
class area{
	int area;
	public void rectangle(int br, int l) {
		
		area=br*l;
		System.out.println(area);
		
	}
	public void square(int s) {
		area=s*s;
		System.out.println(area);
	}
}
public class b9 {
	public static void main(String[] args) {
		area a = new area();
		a.rectangle(20, 40);
		a.square(70);
	}
}
