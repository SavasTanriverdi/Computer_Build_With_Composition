// Main Class
public class CompositionExample {
    public static void main(String[] args) {
        // Creating components
        Monitor monitor = new Monitor("Dell", 24, "1920x1080");
        CPU cpu = new CPU("Intel i7", 8, 3.6);
        Keyboard keyboard = new Keyboard("Mechanical", true);

        // Creating a computer with components
        Computer computer = new Computer(monitor, cpu, keyboard);

        // Displaying computer details
        computer.displayComputerDetails();
    }
}