public class Cat extends Animal implements Voice, Reaction, Call{
    public Cat(String name, int age, String color) {
        super(name, age, color);
        this.satiety = (int) (Math.random() * 100);
    }
    @Override
    public void voice() {
        System.out.println(getName() + ": мяу!");
    }

    @Override
    public void reaction() {
        System.out.println(getName() + " мурлыкает.");
    }

    @Override
    public void call() {
        System.out.println(getName() + " подходит");
    }

    @Override
    public int compareTo(Animal o) {
        return this.getAge() - o.getAge();
    }

    //@Override
    //public void voice(){
    //    System.out.println(" мяу!");
    //}
    //@Override
    //public void eat(){
    //    System.out.println(getName() + " ест");
    //}
    //@Override
    //public void call(){
    //    System.out.println(getName() + " подходит");
    //}
    //@Override
    //public void reaction(){
    //    System.out.println(getName() + " радуется");
    //}
}
