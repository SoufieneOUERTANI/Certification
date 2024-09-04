public class Test002051 {
    public static void main(String[] args) throws Exception {
        var style = new Style(); //Line n1
        System.out.println(style.pattern.repeat(5).length()); //Line n2
    }

    class Style {
        String pattern = "*";
    }

}
