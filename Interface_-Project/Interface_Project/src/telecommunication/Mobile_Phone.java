package telecommunication;

public class Mobile_Phone implements Telephone {
	private String number;
	private boolean isRinging;
	private boolean PowerOn;
	
	Mobile_Phone(String Number){
		number=Number;
	}
	  public void powerOn() {
		  PowerOn=true;
	    	System.out.println(" Mobile is ON ");
	    }
	    
	    
	    public void dialNo(String Number) {
	    	System.out.println("The phone is ringing"+Number);
	    }
	    public void ans() {
	    	if(isRinging==true &&PowerOn) {
	    		System.out.println("Please ans the call from number");
	    		isRinging=false;
	    	}
	    	else
	    		System.out.println("Phone not ringing");
	    }
	    
	    public boolean callPhone(String Number) {
	    	if(Number==number && PowerOn) {
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
