package streamsHomeWork;

public class DDR {


    private int ddrVolume;
    private DDRType ddrType;

    public DDR(int ddrVolume, DDRType ddrType) {
        this.ddrVolume = ddrVolume;
        this.ddrType = ddrType;
    }

    public int getDdrVolume() {
        return ddrVolume;
    }

    public void setDdrVolume(int ddrVolume) {
        this.ddrVolume = ddrVolume;
    }

    public DDRType getDdrType() {
        return ddrType;
    }

    public void setDdrType(DDRType ddrType) {
        this.ddrType = ddrType;
    }

    @Override
    public String toString() {
        return "DDR{" +
                "ddrVolume=" + ddrVolume +
                ", ddrType=" + ddrType +
                '}';
    }
}