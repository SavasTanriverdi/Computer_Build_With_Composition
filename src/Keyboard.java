// Keyboard Class
class Keyboard {
    private String type; // e.g., Mechanical, Membrane
    private boolean hasBacklight;

    public Keyboard(String type, boolean hasBacklight) {
        this.type = type;
        this.hasBacklight = hasBacklight;
    }

    public void displayDetails() {
        System.out.println("Keyboard Type: " + type);
        System.out.println("Backlight: " + (hasBacklight ? "Yes" : "No"));
    }
}