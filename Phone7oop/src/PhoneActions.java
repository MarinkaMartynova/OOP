public interface PhoneActions {
    void call();
    void sendSMS(String number, String message);
    void listenToAnsweringMachine();
}
