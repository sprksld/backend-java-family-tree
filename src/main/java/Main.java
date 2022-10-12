public class Main {
    public static void main(String[] args) {
        System.out.println("Hello familytree!");

        Person willem = new Person( "Willem", "van Amsberg", 55, "M");
        Person maxima = new Person( "Maxima", "Zorreguieta", 51, "V");
        Person amalia = new Person( "Amalia", "van Amsberg", 18, "V");
        Person alexia = new Person( "Alexia", "van Amsberg", 16, "V");
        Person ariane = new Person( "Ariane", "van Amsberg", 14, "V");
        Pet mambo = new Pet("Mambo", 1, "Toypoedel");

        System.out.println( willem.getName() + " " + willem.getLastName() + " " + willem.getAge() );
        System.out.println( maxima.getName() + " " + maxima.getLastName() + " " + maxima.getAge() );


    }
}