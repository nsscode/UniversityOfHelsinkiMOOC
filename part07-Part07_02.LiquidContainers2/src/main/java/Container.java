public class Container {
    private int amountOfLiquid;

    public Container() {

    }

    public int contains() {
        return amountOfLiquid;
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.amountOfLiquid -= amount;
            if (amountOfLiquid < 0) {
                amountOfLiquid = 0;
            }
        }
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amountOfLiquid += amount;
            if (amountOfLiquid > 100) {
                amountOfLiquid = 100;
            }
        }
    }

    public String toString() {
        return this.amountOfLiquid + "/100";

    }
}
