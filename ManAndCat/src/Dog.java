public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }
    @Override
    public void voice() {
        System.out.println("гав, гав");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест");
    }
    @Override
    public void call(){
        System.out.println(getName() + " подходит");
    }
    @Override
    public void reaction(){
        System.out.println(getName() + " радуется");
    }
}
