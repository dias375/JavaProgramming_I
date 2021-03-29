
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rgd
 */
public class Points {

    ArrayList<Integer> points;

    public Points() {
        this.points = new ArrayList<Integer>();
    }

    public void add(int point) {
        if (point < 0 || point > 100) {
            return;
        }
        this.points.add(point);
    }

    public double average() {
        if (participants() == 0) {
            return 0;
        }
        double sum = 1.0 * sum();

        double average = sum / participants();
        return average;
    }

    public double passingAverage() {
        if (participants() == 0) {
            return 0;
        }

        int passing = this.passing();
        if (passing == 0) {
            return 0;
        }

        double sum = 1.0 * sum(50);

        double average = sum / passing;
        return average;
    }

    public double passPercentage() {
        if (participants() == 0) {
            return 0.0;
        }

        double percentage = 100.0 * passing() / participants();

        return percentage;
    }

    public ArrayList<Integer> distribution() {
        ArrayList<Integer> distribution = new ArrayList<Integer>();
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;

        for (int point : points) {
            if (point < 50) {
                grade0++;
            } else if (point < 60) {
                grade1++;
            } else if (point < 70) {
                grade2++;
            } else if (point < 80) {
                grade3++;
            } else if (point < 90) {
                grade4++;
            } else {
                grade5++;
            }
        }

        distribution.add(grade0);
        distribution.add(grade1);
        distribution.add(grade2);
        distribution.add(grade3);
        distribution.add(grade4);
        distribution.add(grade5);

        return distribution;
    }

    private int sum() {
        int sum = 0;
        for (int point : this.points) {
            sum += point;
        }
        return sum;
    }

    private int sum(int passingGrade) {
        int sum = 0;
        for (int point : this.points) {
            if (point >= passingGrade) {
                sum += point;
            }
        }
        return sum;
    }

    private int passing() {
        int passing = 0;
        for (int point : this.points) {
            if (point >= 50) {
                passing++;
            }
        }
        return passing;
    }

    private int participants() {
        return this.points.size();
    }

    @Override
    public String toString() {
        String output = "";
        for (int point : points) {
            output += point + " / ";
        }
        output = output.substring(0, output.length() - 2);
        return output;
    }

}
