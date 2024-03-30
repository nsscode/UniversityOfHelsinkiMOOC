
public class Main {

    public static void main(String[] args) {
        
        SimpleDate date = new SimpleDate(18, 8, 1999);
        SimpleDate date2 = new SimpleDate(12, 7, 1964);

        Person nine = new Person("Nine", date, 168, 57);
        Person grieteke = new Person("Grieteke", date2, 165, 63);
        Person nine2 = new Person("Nine", date, 168, 57);

        if (nine.equals(nine2)) {
            System.out.println("They are the same!");
        }

        if (nine.equals(grieteke)) {
            System.out.println("Doesn't make sense");
        }



        
    }
}
