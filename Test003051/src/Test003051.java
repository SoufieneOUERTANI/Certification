

class Point {
    static int x;
    int y, z;
    
    public String toString() {
        return "Point(" + x + ", " + y + ", " + z + ")";
    }
}
 
public class Test003051 {

        // What will be the result of compiling and executing Test class?

    // Point(17, 35, -1)
    // Point(19, 40, 0)
    
    // Point(19, 35, -1)
    // Point(19, 40, 0)
    
    // Point(17, 35, -1)
    // Point(17, 40, 0)
    
    // Point(19, 40, 0)
    // Point(19, 40, 0)
    
    // Point(17, 35, -1)
    // Point(17, 35, -1)
    
    // Point(19, 35, -1)
    // Point(19, 35, -1)
    
    // Compilation error


    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 17;
        p1.y = 35;
        p1.z = -1;
        
        Point p2 = new Point();
        p2.x = 19;
        p2.y = 40;
        p2.z = 0;
        
        System.out.println(p1); //Line n1
        System.out.println(p2); //Line n2
    }
}
