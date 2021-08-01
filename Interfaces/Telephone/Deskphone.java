package Telephone;

public class Deskphone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action take, this phone is always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing " + phoneNumber);
    }

    @Override
    public void answer() {
        if(this.isRinging) {
            System.out.println("Answering the desk phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        }
        else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void powerOff() {
        System.out.println("This phone can't be turned off");
    }
}
