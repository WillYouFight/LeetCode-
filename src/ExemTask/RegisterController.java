package ExemTask;

import HomeWrok14.User;

import java.util.Objects;
import java.util.Random;

/**
 * project : Bootcamp1
 * package : ExemTask
 * author  : Allamuradov Tal'at
 * date    : 18.09.2022_15:20
 */
public class RegisterController {
    private LogInterface logListener;
    private UserInterface userListener;
    private int maxRegister;
    private UserDate[] userArrayRegistered;
    private UserDate[] userArrayUnRegistered;
    private int countUnRegistered;
    private int countRegsitered;
    private int[] codeArray;

    public RegisterController(int maxRegister) {
        this.maxRegister = maxRegister;
        userArrayRegistered = new UserDate[maxRegister];//d1lshod
        userArrayUnRegistered = new UserDate[10];
        codeArray = new int[10];
    }

    public void register(UserDate user) {
        if (!isUserRegistered(userArrayRegistered, countRegsitered, user) && isUserRegistered(userArrayUnRegistered, countUnRegistered, user)) {
            logListener.showMessage("User Avvaldan mavjud !");
            return;
        }
        check(user);

    }
    public  void setUserListener(UserInterface userListener){
        this.userListener=userListener;
    }

    private boolean isUserRegistered(UserDate[] userDataList, int count, UserDate user) {
        for (int i = 0; i < count; i++) {
            if (userDataList[i].getPhoneNumber().equals(user.getPhoneNumber())) {
                return true;
            }
        }
        return false;
    }

    private void check(UserDate userDate) {
        if (!(checkName(userDate.getName()) &&
                userDate.getName().length() > 3 &&
                userDate.getName().length() < 12 &&
                checkPhone(userDate.getPhoneNumber()) &&
                userDate.getAge() > 16 &&
                userDate.getAge() < 25)) {
            logListener.showMessage("User not correct");
            return;
        }
        userArrayUnRegistered[countUnRegistered] = userDate;
        sendSmsCode(userDate.getPhoneNumber());
    }

    private void sendSmsCode(String phoneNumber) {
        Random random = new Random();
        int randomNumber = random.nextInt(8999) + 1000;
        if (codeArray.length == countUnRegistered) {
            codeArray = resize(codeArray);
            userArrayUnRegistered = resizeArray(userArrayUnRegistered);
        }
        codeArray[countUnRegistered++] = randomNumber;
        logListener.showMessage("Your code: " + randomNumber);
    }

    private boolean checkName(String userName) {//Dil1shod
        String replaceName = userName.replaceAll("[a-zA-Z]", "");
        return replaceName.length() == 0;
    }

    private boolean checkPhone(String userPhoneNumber) {
        return userPhoneNumber.matches("^(\\+998|998)(90|91|93|94|95|97|98|99|88)\\d{7}$");
    }

    public void logListener(LogInterface _logInterface) {
        logListener = _logInterface;
    }

    public UserDate[] resizeArray(UserDate[] userArrayUnRegistered) {
        UserDate[] size = new UserDate[userArrayUnRegistered.length + userArrayUnRegistered.length / 2];
        for (int i = 0; i < userArrayUnRegistered.length; i++) {
            size[i] = userArrayUnRegistered[i];
        }
        return size;//referenc ketdi
    }

    private int[] resize(int[] size) {
        int[] a = new int[size.length + size.length / 2];
        for (int i = 0; i < size.length; i++) {
            a[i] = size[i];
        }
        return size;//referenc ketdi
    }

    public void checkSmsCode(String phoneNumber, int code) {
        int index = checkUserPhoneNumber(phoneNumber, countUnRegistered, userArrayUnRegistered);
        if (index == -1) {
            logListener.showMessage("User Topilmadi !");
            return;
        }

        if (codeArray[index] != code) {
            logListener.showMessage("Code is not Correct !");
            return;
        }
        if (countUnRegistered == maxRegister) {
            logListener.showMessage("User is Full !");
            return;
        }
        userArrayRegistered[countRegsitered++] = userArrayUnRegistered[index];
        logListener.showMessage("User is Registered Successfully");
        countUnRegistered--;
        userArrayUnRegistered[index] = userArrayUnRegistered[countUnRegistered];
        codeArray[index] = codeArray[countUnRegistered];

    }

    private int checkUserPhoneNumber(String phoneNumber, int count, UserDate[] userDateArray) {//
        for (int i = 0; i < count; i++) {
            if (Objects.equals(phoneNumber, userDateArray[i].getPhoneNumber())) {
                return i;
            }
        }
        return -1;
    }

    public void repeatSmsCode(UserDate userDate) {
        if (!isUserRegistered(userArrayUnRegistered, countRegsitered, userDate)) {
            logListener.showMessage("Bunday User topilmadi !");
            return;
        }
        Random rnadom = new Random();
        int randomNumber = rnadom.nextInt(8999) + 1000;
        int index = checkUserPhoneNumber(userDate.getPhoneNumber(), countUnRegistered, userArrayUnRegistered);
        codeArray[index] = randomNumber;
        logListener.showMessage("New code:" + randomNumber);


    }// 0=h 1=j 2=j<-t

    public void getAllUsers(){
        for (int i = 0; i < countRegsitered; i++) {
            System.out.println("=====================================================================");
            userListener.show(userArrayRegistered[i]);
            System.out.println("=====================================================================");
        }
    }

    public void unRegister(UserDate userDate){
        if (!isUserRegistered(userArrayRegistered,countRegsitered,userDate)){
            logListener.showMessage("Bunday user Yo`q");
            return;
        }
        int position =checkUserPhoneNumber(userDate.getPhoneNumber(),countRegsitered,userArrayRegistered);
        countRegsitered--;
        userArrayRegistered[position]=userArrayRegistered[countRegsitered];
        logListener.showMessage("Muvaffaqiyatli o`chirildi !");
    }

}
