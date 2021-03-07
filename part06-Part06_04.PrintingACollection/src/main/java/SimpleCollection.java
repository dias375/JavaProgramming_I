
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String firstSentence = "The collection " + this.name + " has ";

        String secondSentence;
        if (this.elements.size() == 1) {
            secondSentence = this.elements.size() + " element:";
        } else {
            secondSentence = this.elements.size() + " elements:";
        }

        String thirdSentence = "\n";
        for (String element : this.elements) {
            thirdSentence += element;
            if (this.elements.size() > 1) {
                thirdSentence += "\n";
            }
        }

        return firstSentence + secondSentence + thirdSentence;
    }

}
