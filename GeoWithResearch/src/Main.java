public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 50);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 29);
        Person jane = new Person("Женя", 2);
        Person ivan = new Person("Ваня", 7);
        Person katya = new Person("Катя", 6);
        Person sasha = new Person("Саша", 50);
        Person nadya = new Person("Надя", 26);
        GeoTree gt = new GeoTree();
        gt.append(irina, Relationship.parent, vasya);
        gt.append(irina, Relationship.parent, masha);
        gt.append(vasya, Relationship.parent, jane);
        gt.append(vasya, Relationship.parent, ivan);
        gt.append(sasha, Relationship.parent, vasya);
        gt.append(sasha, Relationship.parent, masha);
        gt.append(masha, Relationship.parent, katya);
        gt.append(irina, Relationship.partner, sasha);
        gt.append(vasya, Relationship.partner, nadya);
        gt.append(vasya, Relationship.sibling, masha);
        gt.append(jane, Relationship.sibling, ivan);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.partner));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.sibling));


    }
}
