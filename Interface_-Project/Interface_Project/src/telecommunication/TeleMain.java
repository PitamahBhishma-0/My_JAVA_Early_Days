package telecommunication;

public class TeleMain {

	public static void main(String[] args) {
		/*LandLine LL=new LandLine("123668");
		LL.powerOn();
		LL.callPhone("123668");
		LL.ans();*/
		Mobile_Phone Mp=new Mobile_Phone("12345");
		//Mp.powerOn();
		Mp.callPhone("12389");
		Mp.ans();
		Mp.isRinging();
	}

}
