public class Mobile extends Phone implements TakeMessage, SendMessage, InternetConnection{
    public Mobile(String number, String owner) {
        super(number, owner);
    }

    @Override
    public void sendSMS() {
        System.out.println("отправить сообщение");
    }

    @Override
    public void getMessage() {
        System.out.println("получить сообщение");

    }

    @Override
    public void turnOn() {
        System.out.println("включить интернет-соединение");
    }

    @Override
    public void turnOff() {
        System.out.println("выключить интернет-соединение");

    }

    @Override
    public void makeCallWifi() {
        System.out.println("сделать звонок через wi-fi");
    }

}
