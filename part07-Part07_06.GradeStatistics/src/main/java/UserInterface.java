
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rgd
 */
public class UserInterface {

    Scanner scanner;
    Points points;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.points = new Points();
    }

    public void start() {

        while (true) {
            int input = nextInput();

            if (input == -1) {
                break;
            } else {
                points.add(input);
            }
        }

        this.printPoints();
    }

    private int nextInput() {
        System.out.println("Enter point totals, -1 stops: ");
        int input = Integer.valueOf(scanner.nextLine());
        return input;
    }

    private void printPoints() {
        this.printAverage();
        this.printPassingAverage();
        this.printPassingPercentage();
        this.printDistributuion();
    }

    private void printAverage() {
        System.out.println("Point average (all): " + this.points.average());
    }

    private void printPassingAverage() {
        String pointsPassingAverage = "" + this.points.passingAverage();
        if (pointsPassingAverage.equals("0.0")) {
            pointsPassingAverage = "-";
        }
        System.out.println("Point average (passing): " + pointsPassingAverage);
    }

    private void printPassingPercentage() {
        System.out.println("Pass percentage: " + points.passPercentage());
    }

    private void printDistributuion() {
        ArrayList<Integer> distribution = points.distribution();

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + printStars(distribution.get(i)));
        }

    }

    private String printStars(int howMany) {
        String stars = "";
        for (int i = 0; i < howMany; i++) {
            stars += "*";
        }
        return stars;
    }

}
