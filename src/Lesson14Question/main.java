package Lesson14Question;

/**
 * project : Bootcamp1
 * package : Lesson14Question
 * author  : Allamuradov Tal'at
 * date    : 14.09.2022_18:09
 */
public class main {
    public static void main(String[] args) {

    }
}
class Car{
    private int batterySlots;
    private int motorPower;

    public Car(int batterySlots, int motorPower) {
        this.batterySlots = batterySlots;
        this.motorPower = motorPower;
    }
    public boolean run(){
        return false;
    }
}
class Battery{
    private int batteryCapacity;

    public Battery(int mAh) {
        this.batteryCapacity = mAh;
    }
}

