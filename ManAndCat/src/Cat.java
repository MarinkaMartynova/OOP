class Cat {
    private String name;
    private int age;
    private String furColor;

    public Cat(String name, int age, String furColor) {
        this.name = name;
        this.age = age;
        this.furColor = furColor;
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

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void play() {
        // игра
        System.out.println(" играет котик");
    }

    public void sleep() {
        // сон
        System.out.println(" спит котик");
    }

}
