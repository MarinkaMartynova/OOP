public abstract class Phone implements PhoneActions{
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

}
