public class Mobile extends Phone implements PhoneActions{
    public Mobile(String number, String owner) {
        super(number, owner);
    }

    @Override
    public void call() {
        System.out.println("Звоним на мобильный номер: " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Отправить сообщение на мобильный номер " + number + ": " + message);
    }

    @Override
    public void listenToAnsweringMachine() {
        System.out.println("В мобильных телефонах нет автоответчика");

    }
}
