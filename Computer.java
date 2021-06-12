package streamsHomeWork;

public class Computer {


    private Storage storage;
    private Processor processor;
    private DDR ddr;
    private VideoRam videoRam;
    private String OS;
    private double price;
    private Integer id;

    public Computer(Storage storage, Processor processor, DDR ddr, VideoRam videoRam, String OS, double price, int id) {
        this.storage = storage;
        this.processor = processor;
        this.ddr = ddr;
        this.videoRam = videoRam;
        this.OS = OS;
        this.price = price;
        this.id = id;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public DDR getDdr() {
        return ddr;
    }

    public void setDdr(DDR ddr) {
        this.ddr = ddr;
    }

    public VideoRam getVideoRam() {
        return videoRam;
    }

    public void setVideoRam(VideoRam videoRam) {
        this.videoRam = videoRam;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "storage=" + storage +
                ", processor=" + processor +
                ", ddr=" + ddr +
                ", videoRam=" + videoRam +
                ", OS='" + OS + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}