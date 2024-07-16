import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> pointList;
    private ArrayList<Integer> pointAveragePassingList;

    public Points() {
        this.pointList = new ArrayList<>();
        this.pointAveragePassingList = new ArrayList<>();
    }

    public void add(int point) {
        if (point >= 0 && point <= 100) {
            pointList.add(point);
        }
    }

    public double pointAverage() {
        double totalPoints = 0;

        for (Integer integer : pointList) {
            totalPoints += integer;
        }

        return 1.0 * totalPoints / pointList.size();
    }

    public void updatePassingPoints() {
        pointAveragePassingList.clear();

        for (Integer integer : pointList) {
            if (integer >= 50) {
                pointAveragePassingList.add(integer);
            }
        }
    }

    public double pointAveragePassing() {
        updatePassingPoints();
        if (pointAveragePassingList.isEmpty()) {
            return -1;
        }

        double totalPassingPoints = 0;

        for (Integer integer : pointAveragePassingList) {
            totalPassingPoints += integer;
        }

        return 1.0 * totalPassingPoints / pointAveragePassingList.size();

    }

    public double passPercentage() {
        updatePassingPoints();
        return 100.0 * pointAveragePassingList.size() / pointList.size();
    }

    public void gradeDistribution() {

        int[] grades = new int[6];

        for (int point : pointList) {
            if (point < 50) {
                grades[0]++;
            } else if (point < 60) {
                grades[1]++;
            } else if (point < 70) {
                grades[2]++;
            } else if (point < 80) {
                grades[3]++;
            } else if (point < 90) {
                grades[4]++;
            } else {
                grades[5]++;
            }
        }

        for (int i = 5; i >= 0 ; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    @Override
    public String toString() {
        return pointList.toString();
    }
}
