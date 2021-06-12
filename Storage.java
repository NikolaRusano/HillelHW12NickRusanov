package streamsHomeWork;

public class Storage {

    private int storageVolume;
    private String storageType;
    private String manufacturer;

    public Storage(int storageVolume, String storageType, String manufacturer) {
        this.storageVolume = storageVolume;
        this.storageType = storageType;
        this.manufacturer = manufacturer;
    }

    public int getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(int storageVolume) {
        this.storageVolume = storageVolume;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "storageVolume=" + storageVolume +
                ", storageType='" + storageType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}