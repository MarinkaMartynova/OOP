import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Phone granny = new Landline("1234567", "Бабуля");
        Phone bro = new Mobile("01245345", "Брат");
        Person person = new Person();
        granny.call();
        person.call();
        bro.sendSMS("1234567", "Привет! Как дела?");
        person.sendSMS();
        bro.listenToAnsweringMachine();


    }
}