/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.support.util;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author gabriel.rios
 */
public class FileCSVReader {

    public static List<List<String>> getRows(String filePath) {
        List<List<String>> records = new LinkedList<List<String>>();
        try {
            CSVReader csvReader = new CSVReader(new FileReader(filePath));
            if (csvReader != null && csvReader.verifyReader()) {
                csvReader.readNext();
            }
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                int cont = 0;
                for (String value : values) {
                    System.out.println("value[" + (cont++) + "]=" + value);

                }
                records.add(Arrays.asList(values));
                System.out.println("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return records;
    }

}
