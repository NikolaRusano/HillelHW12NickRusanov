package streamsHomeWork;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static sun.security.validator.PKIXValidator.toArray;

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
                    "3 - Show collections of the prices\n" +
                    "4- Sort according to the price and ");

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
            /*}else if (choise == 3) {
                List<Computer> priceComputerList = computerList.stream().flatMapToInt(id-> IntStream.of(id.getId())).collect(Collectors.toMap(id::getId()));

                for (Computer elem : priceComputerList) {
                    System.out.println(elem);

                }*/

            }else if (choise == 4) {
                Computer thirdSortedPriceComputerelement = computerList.stream()
                        .sorted().collect(Collectors.toList())
                        .stream().skip(2).findFirst().orElse("1").stream()).toArray(String[]::new);


                    System.out.println(thirdSortedPriceComputerelement);

                }
        }while (choise != 0);
    }
}
