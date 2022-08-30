package module2;

import java.util.ArrayList;
import java.util.Scanner;

abstract class 	marks{
	abstract float getPercentage();
}
class C extends marks{
	float maths,science,english;;
	float per;
	public C(float m, float s, float e) {
		this.maths=m;
		this.science=s;
		this.english=e;
	}
	public float getPercentage() {
		float total=((maths+science+english)/300)*100;
		return total;
	}
}
class D extends marks{
	float maths,science,english,gujarati;
	public D(float m, float s, float e, float g) {
		this.maths=m;
		this.science=s;
		this.english=e;
		this.gujarati=g;
	}
	public float getPercentage() {
		float total=((maths+science+english+gujarati)/400)*100;
		return total;
	}
}

public class b16 {
	public static void main(String[] args) {
		C a = new C(75, 85, 90);
		System.out.println("Total percentage: "+a.getPercentage());
		D b = new D(70, 75, 85, 80);
		System.out.println("Total percentage: "+b.getPercentage());
		}
}