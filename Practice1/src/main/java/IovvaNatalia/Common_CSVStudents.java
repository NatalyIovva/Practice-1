package IovvaNatalia;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class Common_CSVStudents {
    private static final String MyFile = "Students.csv";

    public static void main(String[] args) throws IOException {
        try (
                Reader reader = new BufferedReader(new FileReader(MyFile));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index
                String group = csvRecord.get(0);
                String second_name = csvRecord.get(1);
                String name = csvRecord.get(2);

                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Group : " + group);
                System.out.println("Name : " + name);
                System.out.println("Second name : " + second_name);
                System.out.println("---------------\n\n");
            }
        }
    }
}
