public class Closet {
    private int shelves;
    private String colorMaterial;
    private int height;
    private int width;
    boolean isOpen;

    public Closet(int shelves, String colorMaterial, int height, int width){
        this.colorMaterial = colorMaterial;
        this.height = height;
        this.width = width;
        this.shelves = shelves;
    }

    public String getColorMaterial() {
        return colorMaterial;
    }
    public void setColorMaterial(String colorMaterial) {
        this.colorMaterial = colorMaterial;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }
    public void open(){
        isOpen = true;
        System.out.println("Шкаф открыт");
    }
    public void close(){
        isOpen = false;
        System.out.println("Шкаф закрыт");
    }
}
