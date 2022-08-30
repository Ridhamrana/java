package module2;
class rect{
	int lenght,breadth;
	public void area() {
		int area= lenght*breadth;
		System.out.println(area);
	}
	public void perimeter() {
		int peri=(2*(lenght+breadth));
		System.out.println(peri);
	}
	public rect(int l, int b) {
		this.breadth=b;
		this.lenght=l;
	}
}
class squa extends rect{
	public squa(int s) {
		super(s,s);
	}
	
}

public class b50 {
	public static void main(String[] args) {
		rect r= new rect(10,20);
		squa s = new squa(10);
		r.area();
		r.perimeter();
		s.area();
		s.perimeter();
		}
}
