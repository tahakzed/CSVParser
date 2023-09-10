package controller;

import models.Car;
import models.Motorcycle;
import models.Vehicle;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

public class Parser {
    public static Set<Vehicle> csvParse(String file) throws IOException{
        Set<Vehicle> vehicleSet = new HashSet<>();
        Reader csvData = new FileReader(file);
        CSVParser parser = new CSVParser(csvData,CSVFormat.DEFAULT.builder().setHeader().setSkipHeaderRecord(true).setDelimiter(";").build());
        for(CSVRecord record : parser){
            String name = record.get(0);
            int year = Integer.parseInt(record.get(1));

            if(file.contains("car")){ // car csv
                String transmission = record.get(2);
                vehicleSet.add(new Car(name,year,transmission));
            } else{ //motorcycle
                boolean used = Boolean.parseBoolean(record.get(2));
                vehicleSet.add(new Motorcycle(name,year,used));
            }
        }

        return vehicleSet;
    }
}
