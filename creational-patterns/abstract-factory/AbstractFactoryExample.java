// Abstract Factory
interface GUIFactory {
    Button createButton();

    TextBox createTextBox();
}

// Concrete Factories
class DarkThemeFactory implements GUIFactory {
    public Button createButton() {
        return new DarkButton();
    }

    public TextBox createTextBox() {
        return new DarkTextBox();
    }
}

class LightThemeFactory implements GUIFactory {
    public Button createButton() {
        return new LightButton();
    }

    public TextBox createTextBox() {
        return new LightTextBox();
    }
}

// Abstract Products
interface Button {
    void render();
}

interface TextBox {
    void render();
}

// Concrete Products
class DarkButton implements Button {
    public void render() {
        System.out.println("Rendering Dark Button");
    }
}

class LightButton implements Button {
    public void render() {
        System.out.println("Rendering Light Button");
    }
}

class DarkTextBox implements TextBox {
    public void render() {
        System.out.println("Rendering Dark TextBox");
    }
}

class LightTextBox implements TextBox {
    public void render() {
        System.out.println("Rendering Light TextBox");
    }
}

// Client
public class AbstractFactoryExample {
    public static void main(String[] args) {
        GUIFactory factory = new DarkThemeFactory(); // Could also use LightThemeFactory
        Button button = factory.createButton();
        TextBox textBox = factory.createTextBox();

        button.render();
        textBox.render();
    }
}
