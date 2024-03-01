// Interface for objects that can be drawn
interface Drawable {
    void draw();
}

// Interface for clickable objects
interface Clickable {
    void click();
}

// A class that implements both Drawable and Clickable interfaces
class InteractiveButton implements Drawable, Clickable {

    // Implementation of the draw method from the Drawable interface
    public void draw() {
        System.out.println("Drawing...");
    }

    // Implementation of the click method from the Clickable interface
    public void click() {
        System.out.println("Clicking...");
    }
}

// Main class for testing
public class Multiple {
    public static void main(String[] args) {
        // Create an instance of InteractiveButton
        InteractiveButton button = new InteractiveButton();

        // Call the click and draw methods to demonstrate the implemented interfaces
        button.click();
        button.draw();
    }
}
