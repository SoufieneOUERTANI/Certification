public class Test003037 {
    public static void main(String[] args) {
        Report rep = new Report();
        String csv = rep.generateReport();
        Object xlsx = rep.generateReport();
        System.out.println(String.join(":", csv, (String)xlsx));
    }
}

class Report {
    public String generateReport() {
        return "CSV";
    }
    
    public Object generateReport() {
        return "XLSX";
    }
}