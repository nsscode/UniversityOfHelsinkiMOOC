public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.value = this.value + increaseBy;
        }
    }

    public void increase() {
        increase(1);
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value = this.value - decreaseBy;
        }
    }

    public void decrease() {
        decrease(1);
    }

    public String toString() {
        return "This is the value of the counter: " + this.value;
    }
}
