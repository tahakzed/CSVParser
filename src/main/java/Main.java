import controller.Parser;
import models.Vehicle;

import java.io.IOException;
import java.util.Set;

public class Main {

    public static void main(String args[]){
        try{
            Set<Vehicle> vehicles = Parser.csvParse("src/main/resources/car.csv");
            Set<Vehicle> motorcycles = Parser.csvParse("src/main/resources/motorcycle.csv");
            vehicles.addAll(motorcycles);

            for(Vehicle vehicle: vehicles){
                System.out.println(vehicle);
            }
        }catch (IOException e){
            System.out.println("An error has occurred!\n"+e.getMessage());
        }

    }
}
