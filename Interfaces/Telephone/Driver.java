package Telephone;
public class Driver {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new Deskphone(123456);

        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();
        myPhone.powerOff();

        System.out.println("\n\n");
        ITelephone mobile = new MobilePhone(123457);
        mobile.powerOff();
        mobile.powerOn();
        mobile.dial(123456);
        mobile.powerOff();
        mobile.dial(123456);
        mobile.powerOff(); 
    }    
}
