interface Drawable {
    void draw();
}

interface Clickable {
    void click();
}

class InteractiveButton implements Drawable, Clickable {

    @Override
    public void draw() {
        System.out.println("Drawing...");
    }

    @Override
    public void click() {
        System.out.println("Clicking...");
    }
}

public class Multiple {
    public static void main(String[] args) {
        InteractiveButton button = new InteractiveButton();
        button.click();
        button.draw();
    }
}
