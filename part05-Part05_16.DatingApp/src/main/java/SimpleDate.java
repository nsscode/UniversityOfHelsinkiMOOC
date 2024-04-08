
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        this.day = this.day + 1;

        if (this.day > 30) {
            this.month++;
            this.day = 1;

            if (this.month > 12) {
                this.year++;
                this.month = 1;
            }
        }

    }

    public void advance(int howManyDays) {
        // Loop through each day to advance by the specified number of days
        for (int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        // create a new date object that receives the value of
        // the previous dat as its initial value
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        // calculate the new date with the advance method
        newDate.advance(days);

        // return the new date
        return newDate;
    }

}
