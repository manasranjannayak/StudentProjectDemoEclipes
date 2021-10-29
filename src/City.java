
public class City {
	int pincode;
	String Name;
	public static void main(String[] args) {
		City c1=new City();
		System.out.println(c1.pincode);
		System.out.println(c1.Name);
	}
	City(){
		
	}
	City(String Name){
		this.Name=Name;
	}
	City(int PC){
		this.pincode=PC;
	}
	City(String Name,int PC){
		this.Name=Name;
		this.pincode=PC;
	}
	City(int PC,String Name){
		this.Name=Name;
		this.pincode=PC;
	}

}
