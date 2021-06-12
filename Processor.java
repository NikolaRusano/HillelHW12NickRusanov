package streamsHomeWork;

public class Processor {


    private  int numberOfCore;
    private double frequency;

    public Processor(int numberOfCore, double frequency) {
        this.numberOfCore = numberOfCore;
        this.frequency = frequency;
    }


    public int getNumberOfCore() {
        return numberOfCore;
    }

    public void setNumberOfCore(int numberOfCore) {
        this.numberOfCore = numberOfCore;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "numberOfCore=" + numberOfCore +
                ", frequency=" + frequency +
                '}';
    }
}
