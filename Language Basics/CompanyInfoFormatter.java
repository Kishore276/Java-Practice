public class CompanyInfoFormatter {
    public static void main(String[] parameters) {
        if (parameters.length != 2) {
            System.out.println("Error: Please provide exactly two arguments.");
            System.out.println("Usage: java CompanyInfo <CompanyName> <City>");
            return;
        }
        String organizationName = parameters[0];
        String location = parameters[1];
        String finalOutput = organizationName + " Technologies " + location;
        System.out.println(finalOutput);
    }
}
