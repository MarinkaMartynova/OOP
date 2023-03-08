public class Person {
    private static String name;
    private String sex;
    private  int age;
    private String item;

    public Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void putItemInCloset(Closet closet, Item item){
        if (closet.isOpen) {
            System.out.println(name + " кладет " + item.getName() + " в шкаф");
        }
        else{
            System.out.println("Шкаф закрыт и вещи в него не кладут.");
        }
    }
}
