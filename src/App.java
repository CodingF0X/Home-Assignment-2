import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "M3", 2019, "Red", 15000, "ABC123"));
        cars.add(new Car(2, "BMW", "M5", 2022, "green", 33000, "DE0123"));
        cars.add(new Car(4, "Ford", "Mustang", 2017, "Yellow", 25000, "GHI012"));
        cars.add(new Car(4, "Ford", "Mustang", 2018, "Yellow", 26000, "GHI012"));

     
      

        //-- Requirement number 1 : Save to file a list of cars of a given brand --//
        String make = "Ford";
        ArrayList<Car> carMake = new ArrayList<>();

        for (int i = 0; i< cars.size(); i++){
            Car car = cars.get(i);
            if (car.getMake().equals(make)){
                carMake.add(car);
            }
        }
        saveToFile(carMake, "carMake");


        // Requirement number 2 : Save to file a list of cars of a given model that have been used for n years --//
        String model = "Mustang";
        int nYears = 1;
        ArrayList<Car> carModel = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++){
            Car car = cars.get(i);
            // System.out.println(((2023 - car.getYearOfManufacture()) > nYears));
            // System.out.println(car.getModel().equals(model));

            if(car.getModel().equals(model) && (2023 - car.getYearOfManufacture()) > nYears){
                carModel.add(car);
            }
        }

        saveToFile(carModel, "carModel");


        //-- Requirement number 3 : Save to file a list of cars of a given year of manufacture the price of which is higher than the specified one --//
        int year = 2022;
        double  price = 50000;
        ArrayList<Car> pricyCars =  new ArrayList<>();
        
        for (int i = 0; i < cars.size(); i++){
            Car car = cars.get(i);
            if(car.getYearOfManufacture() == year && car.getPrice() > price){
                pricyCars.add(car);
                
            }
        }

        saveToFile(pricyCars, "carYear_Price");

        


    }

       

    private static void saveToFile(ArrayList<Car> cars, String fileName){
           try {
            File file = new File("C:\\users\\Jeffar\\Documents\\"+fileName+".txt");
            if(!file.exists()){

            file.createNewFile();
            System.out.println("File created successfully");
            
            }else{
                System.out.println("File already exists");
            }

            FileWriter fileWriter = new FileWriter(file);
            for(int i =0; i < cars.size(); i++){
                Car car = cars.get(i);
                // System.out.println(car.toString());
                fileWriter.write(car.toString());
                fileWriter.write(System.lineSeparator());
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
