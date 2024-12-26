/**
 * @author uday
 * Singleton Design Pattern example.
 */

// Singleton class
class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) { // Thread-safe
                if (instance == null) { // Double-checked locking
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Main class
public class SingletonPatternExample {
    public static void main(String[] args) {
        // Access Singleton instance
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Show message
        instance1.showMessage();

        // Verify both references are the same
        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}

