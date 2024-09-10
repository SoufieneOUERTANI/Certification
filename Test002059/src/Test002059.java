class Outer {
    class Inner {
        public void m() {
            System.out.println("CHANGE IS GOOD");
        }
    }
}

public class Test002059 {
    public static void main(String[] args) {


        Outer.Inner obji = new Outer().new Inner();
        obji.m();
        
        // Inner obj2 = new Outer().new Inner();
        // obj2.m();
        
        var obj3 = new Outer().new Inner();
        obj3.m();
        
        // Outer.Inner obj4 = this.new Inner();
        // obj4.m();
        
        // Inner obj5 = this.new Inner();
        // obj5.m();

    }
}
