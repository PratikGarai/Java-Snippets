package Telephone;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        if(isOn) {
            System.out.println("Mobile phone is already on");
            return;
        }
        System.out.println("Turned on the phone");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if(!isOn) {
            System.out.println("Mobile phone is off, please turn on");
            return;
        }
        System.out.println("Now dialing " + phoneNumber);
    }

    @Override
    public void answer() {
        if(!isOn) {
            System.out.println("Mobile phone is off, please turn on");
            return;
        }
        if(this.isRinging) {
            System.out.println("Answering the desk phone");
            this.isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(!isOn) {
            System.out.println("Mobile phone is off, please turn on");
            return false;
        }
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
        if(!isOn) {
            System.out.println("Mobile phone is off, please turn on");
            return false;
        }
        return isRinging;
    }

    @Override
    public void powerOff() {
        if(!isOn) {
            System.out.println("Mobile phone is already off");
            return;
        }
        System.out.println("Shutting down");
        isOn = false;
    }
}
