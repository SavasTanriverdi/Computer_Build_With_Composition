// CPU Class
class CPU {
    private String processor;
    private int cores;
    private double speed; // in GHz

    public CPU(String processor, int cores, double speed) {
        this.processor = processor;
        this.cores = cores;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("Cores: " + cores);
        System.out.println("Speed: " + speed + " GHz");
    }
}