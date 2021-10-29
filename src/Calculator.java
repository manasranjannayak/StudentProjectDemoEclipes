
public class Calculator {
	int add(int fn,int sn) {
		int s=fn+sn;
		System.out.println("result "+s);
		return s;
	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(20,30);
		

	}

}
