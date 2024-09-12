interface Sellable {
    double getPrice();
}
 
public class Test002081 {
    private static void printPrice(Sellable sellable) {
        System.out.println(sellable.getPrice());
    }
 
    public static void main(String[] args) {

        printPrice(null);

        // printPrice(new Sellable());
        
        // printPrice(new Sellable(){
        // });
        
        printPrice(new Sellable() {
            @Override
            public double getPrice() {
                    return 45.34;
            }
        });

        var obj = new Sellable() {
            @Override
            public double getPrice() {
                return 20.21;
            }
            public Sellable getThisObject() {
                return this;
            }
        };
            
        printPrice(obj.getThisObject());

    }
}