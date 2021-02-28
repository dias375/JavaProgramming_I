
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {

        Book comparedBook = (Book) compared;
        if (this.toString().equals(comparedBook.toString())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return (this.name + " " + this.publicationYear);
    }
}
