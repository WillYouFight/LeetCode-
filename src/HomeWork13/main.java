package HomeWork13;

/**
 * project : Bootcamp1
 * package : HomeWork13
 * author  : Allamuradov Tal'at
 * date    : 14.09.2022_10:19
 */
public class main {
    public static void main(String[] args) {
        Car auto=Car.getInstance("Mercedes Bens",50);
        System.out.println(auto.isActive());
        System.out.println(auto.reFuel(15));
        System.out.println(auto.getMaxWey(15));
        System.out.println(auto.isActive());
        System.out.println(auto.name());
        Car auto1=Car.getInstance("Bmw",45);
        System.out.println("|===||===||===||===||===||===||===||TELEGRAM||===||===||===||===||===||===||===||===|");
        User u = new User.UserBuilder("123456789",1234)
                .years(1991)
                .setlName("talat")
                .nickName("destroyer")
                .setFName("Allamuradov")
                .build();
        System.out.println(u.getFName());
        System.out.println(u.getLName());
        System.out.println(u.getCode());
        System.out.println(u.getPhone());
        System.out.println(u.getNickName());
    }
}
class Car{
    private final String name;
    private final int maxCapacity;
    private int buyPetrol;
    private static String nameCar;
    private static Car car=null;

    private Car(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }
    public static Car getInstance(String nameCarNotChange,int maxCapacityNotChange){
        if (car==null) car=new Car(nameCarNotChange,maxCapacityNotChange);
        return car;
    }
    boolean isActive(){
        return buyPetrol>0;
    }
    boolean reFuel(int addPetrol){
        if (addPetrol<=maxCapacity-buyPetrol){
            buyPetrol+=addPetrol;
            return true;
        }
        return false;
    }
    int getMaxWey(int value){
        return buyPetrol*value;
    }
    String name(){
        return this.name;
    }
}
class  User {
    private String fName;
    private String lName;
    private String phone;
    private String nickName;
    private  int years;
    private int code;
    private User(UserBuilder builder) {
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.phone = builder.phone;
        this.nickName = builder.nickName;
        this.years =builder.years;
        this.code=builder.code;
    }
    public int getCode() {
        return code;
    }
    public String getNickName() {
        return nickName;
    }
    public int getYears() {
        return years;
    }

    public String getPhone() {
        return phone;
    }

    public String getFName() {
        return fName;
    }
    public String getLName() {
        return lName;
    }
    public static class UserBuilder {
        private String nickName;
        private int years;
        private String fName;
        private String lName;
        private String phone;
        private int code;
        public UserBuilder(String phone, int code) {
            this.phone = phone;
            this.code = code;
        }

        public UserBuilder setFName(String fName) {

            this.fName = fName;
            return this;
        }
        public UserBuilder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public UserBuilder setlName(String lName) {
            this.lName = lName;
            return this;
        }
        public UserBuilder years(int years) {
            this.years =years;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
}
