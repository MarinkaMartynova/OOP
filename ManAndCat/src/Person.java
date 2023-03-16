class Person {
    private String name;
    private int age;
    public Object fullName;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void call(Cat cat) {
        // звать животное
        System.out.println("Иди сюда, " + cat.getName());
        cat.call();
    }

    public void petCat(Cat cat) {
        // гладить животное
        System.out.println(getName() + " гладит " + cat.getName() + "а. ");
        cat.reaction();
    }

}
