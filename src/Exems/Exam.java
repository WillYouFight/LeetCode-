package Exems;

import java.util.Scanner;

/**
 * project : Bootcamp1
 * package : Exems
 * author  : Allamuradov Tal'at
 * date    : 16.09.2022_11:50
 */
public class Exam {
    public static void main(String[] args) {
        RegisterController reg = new RegisterController(10);
        reg.setLogInterface(new LogInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }
        });
        reg.setUserInfoInterface(new UserDataInterface() {
            @Override
            public void show(UserData user) {
                user.showInfo();
            }
        });
        Scanner sc = new Scanner(System.in);
        UserData user1 = new UserData("Talat",31,"+998915085939");
        reg.register(user1);
        System.out.print("Kodni kiriting: ");
        reg.checkSmsCode(sc.nextInt(),user1.getPhoneNumber());
        reg.unregister(user1);

    }
}

class UserData{
    private String name;
    private int age;
    private String phoneNumber;

    public UserData(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public void showInfo(){
        System.out.println("Name: " + name + "  " + "Age: " + age + "  " + "PhoneNumber: " + phoneNumber);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
interface LogInterface{
    void showMessage(String message);
}
interface  UserDataInterface{
    void show(UserData user);
}
class RegisterController{
    private int maxMembers;
    LogInterface logInterface;
    UserDataInterface userDataInterface;
    UserData[] usersRegistered;
    UserData[] usersUnregistered;
    private int[] codes;
    private int countRegistered;
    private int countUnregistered;
    public RegisterController(int maxMembers) {
        this.maxMembers = maxMembers;
        usersRegistered = new UserData[maxMembers];
        usersUnregistered = new UserData[10];
        codes = new int[10];
    }

    public void setLogInterface(LogInterface logListener){
        logInterface = logListener;
    }
    public void setUserInfoInterface(UserDataInterface userListener){
        userDataInterface = userListener;
    }
    public void register(UserData user){
        if(!checkIsUserNotRegistered(usersRegistered,countRegistered,user) && checkIsUserNotRegistered(usersUnregistered,countUnregistered,user)){
            logInterface.showMessage("bunday abonent mavjud");
            return;
        }
        check(user);
    }

    public void checkSmsCode(int code, String phoneNumber){
        int index = getPositionOfUser(phoneNumber,countUnregistered,usersUnregistered);
        if(index == -1){
            logInterface.showMessage("bunday abonent yoq");
            return;
        }
        if(codes[index] != code){
            logInterface.showMessage("Code ERROR");
            return;
        }
        if(countRegistered == maxMembers){
            logInterface.showMessage("Joy mavjud emas ");
            return;
        }
        usersRegistered[countRegistered++] = usersUnregistered[index];
        System.out.println("registration completed successfully!");
        countUnregistered--;
        usersUnregistered[index] = usersUnregistered[countUnregistered];
        codes[index] = codes[countUnregistered];
        if(countRegistered == usersRegistered.length) usersRegistered = resizeUserDataArrays(usersRegistered);
    }
    public void repeatSendSmsCode(UserData user){
        if(checkIsUserGotCode(user)){
            int random_int = (int)Math.floor(Math.random()*(1000-9999+1)+9999);
            int pos = getPositionOfUser(user.getPhoneNumber(),countUnregistered,usersUnregistered);
            codes[pos] = random_int;
            System.out.println("Sizning yangi kodingiz: " + random_int);
            return;
        }
        logInterface.showMessage("Siz hali ro'yxatdan o'tmagansiz royhatdan oting!");
    }

    public void getAllUsers(){
        for (int i = 0; i < countRegistered; i++) {
            userDataInterface.show(usersRegistered[i]);
        }
    }
    public void unregister(UserData user){
        if(checkIsUserNotRegistered(usersRegistered,countRegistered,user)){
            logInterface.showMessage("Bu abonent royhatdan ormagan!");
            return;
        }
        int pos = getPositionOfUser(user.getPhoneNumber(),countRegistered,usersRegistered);
        countRegistered--;
        usersRegistered[pos] = usersRegistered[countRegistered];
        logInterface.showMessage("Abonent o'chirib tashlandi");
    }
    private void check(UserData user){
        if(!isOnlyLetters(user.getName()) && user.getName().length() > 3 && user.getName().length() < 12 &&
                checkIsRightPhoneNumber(user.getPhoneNumber()) && user.getAge() > 16 && user.getAge() <= 25){
            logInterface.showMessage("Abonent malumotlarini notogri kirtilgan!");
            return;
        }
        usersUnregistered[countUnregistered] = user;
        sendSmsCode(user.getPhoneNumber());
    }
    private void sendSmsCode(String phoneNumber){
        int random_int = (int)Math.floor(Math.random()*(1000-9999+1)+9999);
        codes[countUnregistered++] = random_int;
        if(countRegistered == usersUnregistered.length){
            usersUnregistered = resizeUserDataArrays(usersUnregistered);
            codes = resizeIntArray(codes);
        }
        System.out.println("Sizning kodingiz: " + random_int);
    }
    private boolean isOnlyLetters(String name){
        name = name.replaceAll("[a-zA-Z]","");
        return name.length() == 0;
    }
    private boolean checkIsUserNotRegistered(UserData[] users, int num, UserData user){
        for (int i = 0; i < num; i++) {
            if(users[i].getPhoneNumber().equals(user.getPhoneNumber())) return false;
        }
        return true;
    }
    private boolean checkIsRightPhoneNumber(String number){
        String temp = number.substring(0,3);
        return temp.charAt(0) == '9' && temp.charAt(1) == '9' && temp.charAt(2) == '8' && number.length() == 12;
    }
    private int getPositionOfUser(String phoneNumber, int num, UserData[] users){
        for (int i = 0; i < num; i++) {
            if(users[i].getPhoneNumber().equals(phoneNumber)) return i;
        }
        return -1;
    }
    private boolean checkIsUserGotCode(UserData user){
        for (int i = 0; i < countUnregistered; i++) {
            if(usersUnregistered[i].getPhoneNumber().equals(user.getPhoneNumber())) return true;
        }
        return false;
    }

    private UserData[] resizeUserDataArrays(UserData[] users){
        UserData[] new_arr = new UserData[users.length + users.length / 2];
        for (int i = 0; i < users.length; i++) {
            new_arr[i] = users[i];
        }
        return new_arr;
    }

    private int[] resizeIntArray(int[] arr){
        int[] new_arr = new int[arr.length + arr.length / 2];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr.length;
        }
        return new_arr;
    }


}
