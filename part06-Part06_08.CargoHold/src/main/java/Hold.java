import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holder;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holder= new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight() <= this.maxWeight) {
            holder.add(suitcase);
        } 
    }

    public int totalWeight() {
            int totalWeight = 0;

            for (Suitcase suitcase : holder) {
                totalWeight += suitcase.totalWeight();
            }

            return totalWeight;
    }

    public void printItems() {
        for (Suitcase suitcase : holder) {
            for (Item item : suitcase.getItemList()) {
                System.out.println(item);
            }
        }
    }

    public String toString() {
        return holder.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

}
