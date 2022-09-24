import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * project : Bootcamp1
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.09.2022_18:30
 */
public class cars {
    public static void main(String[] args) {
        ArrayList<ArrayList<modelCars>> solution=new ArrayList<>();
        ArrayList<modelCars> carsBmwList=new ArrayList<>();
        ArrayList<modelCars> carsMercedesList=new ArrayList<>();
        ArrayList<modelCars> carsAudiList=new ArrayList<>();
        modelCars cars=new modelCars("Bmw","x5",35_000);
        modelCars cars1=new modelCars("Mercedes","GLS200",55_000);
        modelCars cars2=new modelCars("Audi","A7",43_000);
        modelCars cars3=new modelCars("Bmw","x7",85_000);
        modelCars cars4=new modelCars("Mercedes","AMG220",80_000);
        carsBmwList.add(cars);
        carsBmwList.add(cars3);
        carsMercedesList.add(cars1);
        carsMercedesList.add(cars1);


    }
}
class modelCars{
    String name;
    String model;
    int cost;

    public modelCars(String name, String model, int cost) {
        this.name = name;
        this.model = model;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
