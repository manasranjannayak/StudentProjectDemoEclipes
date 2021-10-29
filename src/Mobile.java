class Mobile{
	void call() {
		System.out.println("call");
	}
	void SendSMS() {
		System.out.println("Send SMS");
	}
	void PlayMusic() {
		System.out.println("Play Music");
	}
	
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.call();
		m1.SendSMS();
		m1.PlayMusic();
		m1.call();
		
	}
	
}