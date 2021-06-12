package streamsHomeWork;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HoweWorkWithStreams {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Computer> computerList = ComputerCollection.computersList();
        System.out.println(computerList.stream().count());

        int choise;
        do {
            System.out.println("Input command:\n" +
                    "1 - Select only Windows computers;\n" +
                    "2 - computers with SSD Disk;\n" +
                    "3 - Show collections of the prices");

            choise = scanner.nextInt();

            if(choise == 1) {
                List<Computer> windowsComputerList = computerList.stream()
                        .filter(os -> os.getOS() == "Windows")
                        .collect(Collectors.toList());
                for (Computer elem : windowsComputerList) {
                    System.out.println(elem);

                }
            }else if (choise == 2) {
                List<Computer> twoSSDComputerList = computerList.stream()
                        .filter(ssd -> ssd.getStorage()
                        .getStorageType() == "SSD")
                        .limit(2)
                        .collect(Collectors.toList());

                for (Computer elem : twoSSDComputerList) {
                    System.out.println(elem);
                }
            }else if (choise == 3) {
                List<Computer> priceComputerList = computerList.stream().flatMapToInt(id-> IntStream.of(id.getId())).collect(Collectors.toMap(id::getId()));

                for (Computer elem : priceComputerList) {
                    System.out.println(elem);

                }

            }
        }while (choise != 0);
    }
}
