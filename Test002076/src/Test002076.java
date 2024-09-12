class Season {
    public void printCurrentSeason() {
        System.out.println("SUMMER");
    }
}
 
public class Test002076 {
    public static void main(String[] args) {
        var season = new Season() { //Line n1
            @Override public void PrintCurrentSeason() { //Line n2
                System.out.println("WINTER");
            }
        };
        season.PrintCurrentSeason(); //Line n3
    }
}
