
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(200);

        counter.value();
        counter.increase();
        counter.decrease();
        counter.value();
        counter.increase(20);
        System.out.println(counter);


    }
}
