package IovvaNatalia;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;

public class CSVCreater_common {
    private static final String MyFile = "Students.csv";

    public static void main(String[] args) throws IOException {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(MyFile));

                CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                        .withHeader("Group", "Name", "Second_name"));
        ) {
            csvPrinter.printRecord("IA-1703", "Natali", "Iovva");
            csvPrinter.printRecord("IA-1703", "Alexsandr", "Popov");
            csvPrinter.printRecord("IA-1703", "Jhon", "Smit");
            csvPrinter.printRecord("IA-1703", "Ion", "Bodruk");

            csvPrinter.flush();
        }
    }
}
