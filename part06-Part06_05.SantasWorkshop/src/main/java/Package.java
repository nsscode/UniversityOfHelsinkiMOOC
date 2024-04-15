import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> giftPackage;

    public Package() {
        this.giftPackage = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        giftPackage.add(gift);
    }

    public int totalWeight() {
        if (giftPackage.isEmpty()) {
            return -1;
        }

        int sumOfWeight = 0;
        for (Gift gift : giftPackage) {
            sumOfWeight += gift.getWeight();
        }

        return sumOfWeight;

    }

}
