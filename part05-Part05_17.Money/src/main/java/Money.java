
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents > 99) {
            newEuros = newEuros + (newCents / 100);
            newCents = newCents % 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this == compared) {
            return false;
        }

        if (!(compared instanceof Money)) {
            return false;
        }

        Money moneyCompared = (Money) compared;

        if (this.euros > moneyCompared.euros) {
            return false;
        } else if (this.euros == moneyCompared.euros &&
                this.cents > moneyCompared.cents) {
            return false;
        }

        return true;

    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0) {
            newCents = newCents + 100;
            newEuros --;
        }
        if (newEuros < 0) {
            return new Money(0, 0);
        }
        
        return new Money(newEuros, newCents);
    }

    public boolean equals(Money compared) {

        if (!(compared instanceof Money)) {
            return false;
        }

        Money moneyCompared = (Money) compared;

        return this.euros == moneyCompared.euros && this.cents == moneyCompared.cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
