// Interface 1
interface Switchable {
    void turnOn();
    void turnOff();
}

// Interface 2
interface Adjustable {
    void increaseLevel();
    void decreaseLevel();
}

// Interface 3 (Lamp extends both)
interface Lamp extends Switchable, Adjustable {
    void changeColor(String color);
}

// Class implementing Lamp interface
class SmartLamp implements Lamp {

    private boolean isOn;
    private int level;   // 0-10
    private String color;

    // Constructor
    SmartLamp() {
        isOn = false;
        level = 0;
        color = "White";
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is turned ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is turned OFF");
    }

    @Override
    public void increaseLevel() {
        if (level < 10) {
            level++;
            System.out.println("Brightness increased to: " + level);
        } else {
            System.out.println("Brightness already at MAX");
        }
    }

    @Override
    public void decreaseLevel() {
        if (level > 0) {
            level--;
            System.out.println("Brightness decreased to: " + level);
        } else {
            System.out.println("Brightness already at MIN");
        }
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
        System.out.println("Lamp color changed to: " + color);
    }

    // Main method to test
    public static void main(String[] args) {

        SmartLamp lamp = new SmartLamp();

        lamp.turnOn();
        lamp.increaseLevel();
        lamp.changeColor("Blue");
        lamp.turnOff();
    }
}