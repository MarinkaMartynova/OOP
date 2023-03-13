class Person {
    private String name;
    private int age;

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

    public void call(Animal animal) {
        // звать животное
        System.out.println(getName() + " зовет " + animal.getName());
        animal.call();
    }

    public void petCat(Animal animal) {
        // гладить животное
        System.out.println(getName() + " гладит " + animal.getName());
        animal.reaction();
    }

}
