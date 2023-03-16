import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Люся",3, "черно-белая");
        Cat cat = new Cat("Мурзик",1,"рыжий");
        Person person = new Person("Женя", 30);

        //System.out.println("Это " + person.getName() + ". Ему " + person.getAge() + " лет");
        cat.voice();
        person.call(cat);
        person.petCat(cat);
        dog.reaction();

        System.out.println("Люся  и ее шкала сытости: ");
        dog.feed();
        System.out.println("Мурзик и его шкала сытости:  ");
        cat.feed();

        ArrayList<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);

        System.out.println(list);
        Collections.sort(list, new AnimalAgeComparator());
        System.out.println(list);

        System.out.println(cat.equals(dog));
        
        System.out.println(cat.compareTo(dog));

        AnimalAgeComparator animalAgeComparator = new AnimalAgeComparator();
        System.out.println(animalAgeComparator.compare(cat, dog));


    }
}
