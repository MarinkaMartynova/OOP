public class Landline extends Phone{
    public Landline(String number,String owner) {
        super(number, owner);
    }

    @Override
    public void call() {
        System.out.println("Звоним на стационарный номер " + number + " " +owner);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Со стационарного нельзя отправить СМС ");
    }

    @Override
    public void listenToAnsweringMachine() {
        System.out.println("Прослушиваем автоответчик");

    }


}
