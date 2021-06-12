package streamsHomeWork;

public class VideoRam {

    private String manufacturer;
    private double ramSize;

    public VideoRam(String manufacturer, double ramSize) {
        this.manufacturer = manufacturer;
        this.ramSize = ramSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "VideoRam{" +
                "manufacturer='" + manufacturer + '\'' +
                ", ramSize=" + ramSize +
                '}';
    }
}
