import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemList;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        itemList = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int total = 0;

        for (Item item : itemList) {
            total += item.getWeight();
        }

        return total;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            itemList.add(item);
        }
    }

    public void printItems() {
        for (Item item : itemList) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (itemList.isEmpty()) {
            return null;
        }

        int index = 0;
        Item heaviestItem = itemList.get(0);

        for (int i = 0; i < itemList.size(); i++) {

            Item currentItem = itemList.get(i);

                if (heaviestItem.getWeight() < currentItem.getWeight()) {
                    heaviestItem = currentItem;
                    index = i;
                }
            }

        return itemList.get(index);
    }


    public String toString() {
        if (itemList.isEmpty()) {
            return "no items (" + this.totalWeight() + " kg)";
        }
        if (itemList.size() == 1) {
            return itemList.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return itemList.size() + " items (" + this.totalWeight() + " kg)";
        }
    }

}
