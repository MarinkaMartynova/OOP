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

    public void call() {
        // звать кота
        System.out.println(" Кис-кис-кис.");
    }

    public void petCat() {
        // гладить кота
        System.out.println(" гладить котика");
    }

}
