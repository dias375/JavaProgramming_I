/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rgd
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand hundSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundSeconds = new ClockHand(100);
    }

    public void advance() {
        this.hundSeconds.advance();
        if (this.hundSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return (this.seconds + ":" + this.hundSeconds);
    }

}
