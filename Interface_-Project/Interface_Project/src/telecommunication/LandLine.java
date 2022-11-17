package telecommunication;

public class LandLine implements Telephone {
    
	
	private String phoneNo;
    private	boolean isRinging;
    public LandLine(String no) {
    	phoneNo=no;
    }
    public void powerOn() {
    	System.out.println("LANDLINE IS ALWAYS ON UNTIL WIRE IS CUT OFF");
    }
    
    
    public void dialNo(String Number) {
    	System.out.println("The phone is ringing"+Number);
    }
    public void ans() {
    	if(isRinging==true) {
    		System.out.println("Please ans the call from number");
    		isRinging=false;
    	}
    	else
    		System.out.println("Phone not ringing");
    }
    
    public boolean callPhone(String Number) {
    	if(Number==phoneNo) {
    		isRinging=true;
    		System.out.println("Phone ringing");
    	}
    	else {
    		System.out.println("Either wrong no. or phone is off");
    		isRinging=false;
    	}
    	return isRinging;
    	
    }
    public boolean isRinging() {
    	return isRinging;
    }
	
	
    
    
}
