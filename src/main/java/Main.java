public class Main {
    public static void main(String[] args) {
        System.out.println("Hello familytree!");

        Person willem = new Person( "Willem", "van Oranje", 55, "M");

        Pet mambo = new Pet("Mambo", 1, "Toypoedel");

        Person amalia = new Person( "Amalia", "van Oranje", 18, "V");

        System.out.println( willem.getAge());
        System.out.println( amalia.getAge());
        willem.addChild(amalia);


    }
}