class Test {
    static void m(Double d) {
        System.out.println("m(Double)");
    }

    static void m(Integer i) {
        System.out.println("m(Integer)");
    }

    public static void main(String[] args) {
        Integer value = 5;
        m(value); // Erreur : pas de conversion implicite Integer → Double
    }
}
