public abstract class Phone implements MakeCall, TakeCall{
    protected String number;
    protected String owner;

    public Phone(String number, String owner){
        this.number = number;
        this.owner = owner;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void call() {
        System.out.println("сделать звонок");
    }

    @Override
    public void takeCall() {
        System.out.println("принять звонок");
    }
}
