package finalword;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ExampleFinalClass {
    public static void main(String[] args) {
        FinalClass.VAR_PERSON.setName("Juan");
        System.out.println(FinalClass.VAR_PERSON.getName());

        FinalClass.VAR_PERSON.setName("Carlos");
        System.out.println(FinalClass.VAR_PERSON.getName());

    }
}