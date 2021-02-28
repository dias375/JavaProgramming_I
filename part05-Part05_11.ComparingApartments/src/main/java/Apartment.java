
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPrice() {
        return this.squares * this.princePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        if (this.moreExpensiveThan(compared)) {
            return this.getPrice() - compared.getPrice();
        } else {
            return compared.getPrice() - this.getPrice();
        }
    }

}
