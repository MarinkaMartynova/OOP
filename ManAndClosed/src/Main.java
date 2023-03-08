public class Main {
    public static void main(String[] args) {

        Closet closet = new Closet(10,"Дуб Вотан",2100,600);
        Person person = new Person("Вася", "мужчина",26);

        closet.open();
        Item book = new Item("книги","красная");
        Item jeans = new Item("джинсы", "синие");
        person.putItemInCloset(closet,book);
        Person.putItemInCloset(closet,jeans);
        closet.close();

    }
}