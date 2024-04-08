
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
        if (this.day < 30) {
            this.day = this.day + 1;
        } else if (this.month < 12) {
            this.month = this.month + 1;
            this.day = 1;
        } else {
            this.year = this.year + 1;
            this.month = 1;
            this.day = 1;
        }

    }

    public void advance(int howManyDays) {
        // Loop through each day to advance by the specified number of days
        for (int i = 0; i < howManyDays; i++) {
            this.day++; // Increment the day by one

            // Checks if the day exceeds 30
            if (this.day > 30) {
                this.day = 1; // If so, reset day to 1
                this.month++; // Increment the month

                // Checks if the month exceeds 12
                if (this.month > 12) {
                    this.month = 1; // If so, reset month to 1
                    this.year++; // Increment the year
                }
            }
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
