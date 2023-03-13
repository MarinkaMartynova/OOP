public class Main {

    public static void main(String[] args) {
        Dog dogLusya = new Dog("Люся",2, "черно-белая");
        Animal catMurzik = new Cat("Мурзик",5,"рыжий");
        Person person = new Person("Женя", 30);

        System.out.println("Это " + person.getName() + ". Ему " + person.getAge() + " лет");
        person.petCat(catMurzik);
        person.call(dogLusya);



    }
}
