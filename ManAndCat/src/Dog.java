public class Dog extends Animal implements Voice, Reaction, Eat{
    public Dog(String name, int age, String color) {
        super(name, age, color);
        this.satiety = (int) (Math.random() * 100);
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
    public void reaction(){
       System.out.println(getName() + " ревнует и ругается :)");
   }

    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();
    }
}
