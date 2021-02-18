
public class Statistics {

    private int number;
    private int count;

    public Statistics() {
        this.number = 0;
        this.count = 0;
    }

    public void addNumber(int newNumber) {
        this.number += newNumber;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.number;
    }

    public double average() {
        double avg = 0.0;
        if (this.count > 0) {
            avg = 1.0 * this.number / this.count;
        }
        return (avg);
    }
}
