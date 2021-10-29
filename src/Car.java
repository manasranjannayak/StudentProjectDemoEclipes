public class Car{
	String clr="Red";
	
	Car(String clr){
		System.out.println(clr);
		System.out.println(this.clr);
	}
	public static void main(String[] args) {
		Car c1=new Car("blue");
	}
}