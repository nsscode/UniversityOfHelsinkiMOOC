public class Fitbyte {
    private int age, restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double maxiumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }


    public double targetHeartRate(double percentageOfMaximum){
         return (this.maxiumHeartRate() - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
    }
}
