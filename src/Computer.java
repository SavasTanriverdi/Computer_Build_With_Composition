// Computer Class (Composition)
class Computer {
    private Monitor monitor;
    private CPU cpu;
    private Keyboard keyboard;

    public Computer(Monitor monitor, CPU cpu, Keyboard keyboard) {
        this.monitor = monitor;
        this.cpu = cpu;
        this.keyboard = keyboard;
    }

    public void displayComputerDetails() {
        System.out.println("Computer Specifications:");
        monitor.displayDetails();
        cpu.displayDetails();
        keyboard.displayDetails();
    }
}