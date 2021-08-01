package Telephone;
public class Driver {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new Deskphone(123456);

        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();
        myPhone.powerOff();
    }    
}
