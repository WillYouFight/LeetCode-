package HomeWork15;

/**
 * project : Bootcamp1
 * package : HomeWork15
 * author  : Allamuradov Tal'at
 * date    : 17.09.2022_17:28
 */
public class Main {
    public static void main(String[] args) {
        Factory f = new Factory("Mercedes Benz");
        Factory.CarFactory c = f.new CarFactory(new ModelCar("GLS", "black"));
        c.getInfo();
    }
}
//        Factory(zavod) nomli sinf va uning kunstruktorida zavod nomi beriladi. Car(mashina) sinfi va konstruktorida
//        Model nomli sinf obyektini qabul qiladi. Model sinfi model nomi va rangini saqlaydi. Car sinfining getInfo
//        metodi mashina nomi, rangi va zavod nomini "factory_name|car_name|car_color" formatda qaytaradi.
class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    class CarFactory {
        private ModelCar modelCar;

        public CarFactory(ModelCar modelCar) {
            this.modelCar = modelCar;
        }

        public void getInfo() {
            System.out.println("Factory: " + name + "\n" + "Mocdel: " + modelCar.getModelName() + "\n" + "Car Color: " + modelCar.getModelColor());
        }
    }
}

class ModelCar {
    private String modelName;//
    private String modelColor;//

    public ModelCar(String modelName, String modelColor) {
        this.modelName = modelName;
        this.modelColor = modelColor;
    }

    public String getModelName() {
        return modelName;
    }

    public String getModelColor() {
        return modelColor;
    }
}