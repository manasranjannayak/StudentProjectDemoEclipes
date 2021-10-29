
public class Person {
	void WashHands() {
		System.out.println("Wash Hands");
	}
	void ArrangePlate() {
		System.out.println("Arrange plates");
	}
	void Servefood() {
		System.out.println("serve food");
	}
	void Eat() {
		WashHands();
		ArrangePlate();
		Servefood();
		System.out.println("Eat nicely............");
		WashHands();
		
	}

	public static void main(String[] args) {
		Person p1=new Person();
		p1.Eat();
		

	}

}
