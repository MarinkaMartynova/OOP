public class Person extends Phone{

    public Person(){
        super( );

    }

    @Override
    public void call() {
        System.out.println(" - Алло?");
    }

    @Override
    public void sendSMS(String number, String message) {

    }

    public  void sendSMS() {
        System.out.println(" смс прочитана");
    }

    @Override
    public void listenToAnsweringMachine() {
        System.out.println(" Нет сообщений");
    }

}
