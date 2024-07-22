import java.util.ArrayList;

public class BirdWatcher {
    private ArrayList<Bird> birdList;

    public BirdWatcher() {
        this.birdList = new ArrayList<>();
    }

    public void add (String name, String latinName) {
        birdList.add(new Bird(name, latinName));
    }

    public void observation(String observed) {

        for (Bird bird : birdList) {
            if (bird.getName().equals(observed)) {
                bird.observe();
                return;
            }
        }

        System.out.println("Bird not found.");

    }

    public void print() {
        if (birdList.isEmpty()) {
            return;
        }

        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

    public void one(String name) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }

        System.out.println("Bird not found.");
    }
    
}
