// Monitor Class
class Monitor {
    private String brand;
    private int size;
    private String resolution;

    public Monitor(String brand, int size, String resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
    }

    public void displayDetails() {
        System.out.println("Monitor Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Resolution: " + resolution);
    }
}