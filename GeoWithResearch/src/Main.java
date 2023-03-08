public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        Person katya = new Person("Катя");
        Person sasha = new Person("Саша");
        Person nadya = new Person("Надя");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.append(sasha, vasya);
        gt.append(sasha, masha);
        gt.append(masha, katya);
        gt.appendPartner(irina, sasha);
        gt.appendPartner(vasya, nadya);
        gt.appendSibling(vasya,masha);
        gt.appendSibling(jane,ivan);

        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.parent));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.partner));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.sibling));
    }

}
