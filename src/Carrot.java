public class Carrot extends Vegetable{
	void PrepearHalwa() {
		System.out.println("cooking halwa....");
		
	}
	
	public static void main(String[]args) {
		Vegetable v=new Carrot();
		//Carrot c=new Carrot();
		v.wash();
		v.chop();
		//v.PrepearHalwa();
		
	}
		
}