package streamsHomeWork;

import java.util.Arrays;
import java.util.List;

public class ComputerCollection {

    public static List<Computer> computersList(){


        return Arrays.asList(
                new Computer(new Storage(512, "SSD", "Zalman"),
                        new Processor(4,2.300),
                        new DDR(8, DDRType.DDR3),
                        new VideoRam("Nvidia",2),
                        "Windows", 2300, 45464987),
                new Computer(new Storage(1024, "HDD", "Verbatim"),
                        new Processor(8,3.800),
                        new DDR(8,DDRType.DDR4),
                        new VideoRam("AMD",3),
                        "MacOS", 3600, 45464988),
                new Computer(new Storage(256, "HDD", "Intel"),
                        new Processor(8,2.100),
                        new DDR(8,DDRType.DDR4),
                        new VideoRam("Asus",4),
                        "Linux", 1800, 45464990),
                new Computer(new Storage(128, "HDD", "Dell"),
                        new Processor(6,1.800),
                        new DDR(8,DDRType.DDR3),
                        new VideoRam("EVGA",8),
                        "Linux", 1500, 45464991),
                new Computer(new Storage(512, "SSD", "Seagate"),
                        new Processor(6,2.800),
                        new DDR(8,DDRType.DDR3),
                        new VideoRam("Sapphire",6),
                        "Windows", 1200, 45464992),
                new Computer(new Storage(512, "SSD", "Transcend"),
                        new Processor(4,3.800),
                        new DDR(2,DDRType.DDR2),
                        new VideoRam("Zotac",5),
                        "MacOS", 1950, 45464993),
                new Computer(new Storage(256, "HDD", "Sandisk"),
                        new Processor(6,2.100),
                        new DDR(8,DDRType.DDR3),
                        new VideoRam("Intel",3),
                        "MacOS", 2850, 45464994),
                new Computer(new Storage(256, "HDD", "Samsung"),
                        new Processor(6,2.900),
                        new DDR(8,DDRType.DDR4),
                        new VideoRam("Gigabyte",1),
                        "Windows", 3050, 45464995),
                new Computer(new Storage(1024, "SSD", "Transcend"),
                        new Processor(4,3.100),
                        new DDR(8,DDRType.DDR4),
                        new VideoRam("Power VR",10),
                        "Linux", 2999, 45464996),
                new Computer(new Storage(2048, "HDD", "Kingston"),
                        new Processor(12,1.300),
                        new DDR(8,DDRType.LDDR),
                        new VideoRam("Radeon",3),
                        "Windows", 4500, 45464999)
        );
    }
}