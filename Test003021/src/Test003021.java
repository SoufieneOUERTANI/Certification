class Rectangle {
    private int height;
    private int width;
    
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
}
 
public class Test003021 {
    public static void main(String[] args) {
        private int i = 100;
        private int j = 200;
        Rectangle rect = new Rectangle(i, j);
        System.out.println(rect.getHeight() + ", " + rect.getWidth());
    }
}
