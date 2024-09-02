public class Test002029 {

    // For the class Test, which options, if used to replace /*INSERT*/, will print "SINGAPORE AUSTRALIA CHINA RUSSIA " on to the console?
    public static void main(String[] args) throws Exception {
        String [][] countries = {{"SINGAPORE", "AUSTRALIA"}, {"CHINA", "RUSSIA"}};
        /*INSERT*/

        for(int i = 0; i < countries.length; i++)
        for(int j = 0; j < countries[i].length ; j++)
        System.out.print(countries[i][j] + " ");
        System.out.println("");
        

        // for(int i = 1; i <= countries. length; i++)
        // for(int j = 1; j <= countries[i].length ; j++)
        // System.out.print(countries[i][j] + " ");
        // System.out.println("");


        for(int i = 1; i < countries. length; i++)
        for(int j = 1; j < countries[i].length ; j++)
        System.out.print(countries[i][j] + " ");
        System.out.println("");

        for(String [] arr : countries)
        for(String country : arr)
        System.out.print(country + " ");
        System.out.println("");
    }
}
