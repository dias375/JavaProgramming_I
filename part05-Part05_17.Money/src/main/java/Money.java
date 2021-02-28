
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

    public Money plus(Money addition) {

        int nuEuro = this.euros + addition.euros();
        int nuCents = this.cents + addition.cents();
        Money nuMoney = new Money(nuEuro, nuCents);
        return nuMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros()) {
            return false;
        }
        if (this.euros == compared.euros() && this.cents > compared.cents()) {
            return false;
        }
        return true;
    }

    public Money minus(Money decreaser) {
        int nuEuro = this.euros - decreaser.euros();
        int nuCents = this.cents - decreaser.cents();

        if (nuEuro < 0) {
            nuEuro = 0;
            nuCents = 0;
        } else if (nuCents < 0) {
            nuEuro--;
            nuCents += 100;
        }

        Money nuMoney = new Money(nuEuro, nuCents);
        return nuMoney;
    }

}
