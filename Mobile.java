package mavenproject;

public class Mobile {
	
	public void sendmsg() {
		System.out.println("message Sent Succesfully");
	}
	
	private void makecall() {
		System.out.println("call connected");
		
	}
	long savecontact() {
		System.out.println("Contact Saved Succesfully");
		Long contactnumb=9789743052L;
		return contactnumb;
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendmsg();
		obj.makecall();
		long savedcontactnumb=obj.savecontact();
		System.out.println(savedcontactnumb);
	}

}
