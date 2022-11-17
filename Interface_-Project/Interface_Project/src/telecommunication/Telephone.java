package telecommunication;

public interface Telephone {
       void powerOn();
       void dialNo( String Number);
       void ans();
       boolean callPhone(String Number);
       boolean isRinging();
}
