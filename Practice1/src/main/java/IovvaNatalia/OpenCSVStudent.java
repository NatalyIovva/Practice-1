package IovvaNatalia;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class OpenCSVStudent {
    public static void main(String[] args) {

        String csvFile = "Students.csv";
        try(CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                //System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
                for(String token:line){
                    System.out.print(token+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

