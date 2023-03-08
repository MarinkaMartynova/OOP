public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Кот", "Шотландский короткошерстный");
        Cat cat = new Cat("Мурзик",5,"рыжий");
        Person person = new Person("Женя", 30);

        System.out.println("Это " + cat.getName() + " " + animal.getBreed() + " " + animal.getName() + ". Ему " + cat.getAge() + " лет.");
        System.out.println(person.getName() + " - это владелец котика. И ему " + person.getAge() + " лет.");

        person.call();
        animal.feed();
        person.petCat();
        cat.play();
        cat.sleep();

    }
}
