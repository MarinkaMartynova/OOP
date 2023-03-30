public class Landline extends Phone implements WaitForResponse{
    public Landline(String number,String owner) {
        super(number, owner);
    }

    @Override
    public void waiting() {
        System.out.println("ожидание звонка");

    }
}
