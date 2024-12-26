import java.util.ArrayList;
import java.util.List;
/**
 * @author uday
 * This example involves a Book class where we create clones of book objects using the Prototype pattern.
 */
// Prototype interface
interface Prototype extends Cloneable {
    Prototype clone();
}

// Concrete class implementing Prototype
class Book implements Prototype {
    private String title;
    private String author;
    private List<String> chapters;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(String chapter) {
        chapters.add(chapter);
    }

    public List<String> getChapters() {
        return chapters;
    }

    @Override
    public Book clone() {
        try {
            Book clonedBook = (Book) super.clone();
            clonedBook.chapters = new ArrayList<>(this.chapters); // Deep copy of chapters
            return clonedBook;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", chapters=" + chapters + "]";
    }
}

// Main class
public class PrototypePatternExample {
    public static void main(String[] args) {
        // Original book
        Book originalBook = new Book("Design Patterns", "Gamma et al.");
        originalBook.addChapter("Introduction");
        originalBook.addChapter("Prototype Pattern");

        // Cloning the book
        Book clonedBook = originalBook.clone();
        clonedBook.addChapter("Decorator Pattern");

        // Display original and cloned book details
        System.out.println("Original Book: " + originalBook);
        System.out.println("Cloned Book: " + clonedBook);
    }
}
