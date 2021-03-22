
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

    public String longest() {

        if (elements.isEmpty()) {
            return null;
        }

        String longest = "";
        for (String element : elements) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }
        return longest;
    }

    public String toString() {
        String firstSentence = "The collection alphabet ";

        if (elements.isEmpty()) {
            return firstSentence + "is empty.";
        }

        int arraySize = elements.size();
        String lastSentence;
        if (arraySize == 1) {
            lastSentence = " element:";
        } else {
            lastSentence = " elements:";
        }

        String completeIntro = firstSentence + "has " + arraySize + lastSentence;

        String orderedElements = "\n";
        for (String element : elements) {
            orderedElements = orderedElements + element + "\n";
        }

        return completeIntro + orderedElements;

    }

}
