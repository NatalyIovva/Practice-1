package IovvaNatalia;

import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;

public class OpenCSVCreater {
    private static final String MyFile = "Students.csv";
    public static void main(String[] args) throws IOException {
        try(CSVWriter writer = new CSVWriter(new FileWriter(MyFile))) {
            List<String[]> data = new ArrayList<String[]>();
            data.add(new String[] {"Group", "Name", "Second_name"});
            data.add(new String[] { "IA-1703", "Natali", "Iovva"});
            data.add(new String[] {"IA-1703", "Alexsandr", "Popov"});
            data.add(new String[] {"IA-1703", "Jhon", "Smit"});
            data.add(new String[] {"IA-1703", "Ion", "Bodruk"});
            writer.writeAll(data);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
