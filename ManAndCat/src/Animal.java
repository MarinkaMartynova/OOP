public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int age;
    private String color;
    protected int satiety;

    public Animal(String name, int age,  String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void voice();

    //public abstract void eat();

    public void feed() {
        if (satiety < 50) {
            System.out.println(satiety + " покорми! ");
            satiety = 100;
        } else {
            System.out.println(satiety + " не нужно кормить, лучше погладь ");
        }
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return satiety == animal.satiety;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' + age +
                '}';
    }
}


