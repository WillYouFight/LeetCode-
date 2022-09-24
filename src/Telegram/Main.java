package Telegram;

import java.util.Random;

/**
 * project : Bootcamp1
 * package : Telegram
 * author  : Allamuradov Tal'at
 * date    : 09.09.2022_20:38
 */
public class Main {

}

class User {
    String lastName;
    String firstName;
    String phoneNumber;
    int age;

    public User(String lastName, String firstName, String phoneNumber, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}

class Telegram {
    private User[] registeredUsers;
    private User[] unRegisteredUsers;
    private int[] codes;
    private int regIndex;
    private int unRegIndex;//5=> 0 1,2,3,4
    public Telegram() {
        registeredUsers = new User[10];
        unRegisteredUsers = new User[10];//unRegisteredUsers.length=10=>0..9
        codes = new int[10];
    }
    public boolean createAccount(User user) {
        int position1 = findUserByIndex(user.getPhoneNumber(), registeredUsers, regIndex);//
        int position2 = findUserByIndex(user.getPhoneNumber(), unRegisteredUsers, unRegIndex);//
        if (position1 == -1 && position2 == -1) {
            Random random = new Random();
            int code = random.nextInt(89_999) + 10_000;
            if (unRegIndex == unRegisteredUsers.length) resizeUnReg();
            unRegisteredUsers[unRegIndex] = user;//?
            codes[unRegIndex++]=code;//
            System.out.println("sms code => "+code+"\n for phoneNumber=> "+user.getPhoneNumber());
            return true;
        }
        return false;
    }
    public void checkSMSCode(int code, String phoneNumber) {
        int position=findUserByIndex(phoneNumber,unRegisteredUsers,unRegIndex);
        if (position!=-1){
            if (unRegisteredUsers[position].getPhoneNumber().equals(phoneNumber)&&codes[position]==code){
                if (registeredUsers.length==regIndex)resizeReg();
                registeredUsers[regIndex++]=unRegisteredUsers[position];
                removeUsersFromUnRegistered(position);
            }
        }else System.out.println("invalid code for phoneNumber=> "+ phoneNumber);
    }

    public int getUserAccount() {
        return  regIndex;
    }
    public boolean deleteAccount(String phoneNumber) {
        int position=findUserByIndex(phoneNumber,registeredUsers,regIndex);
        if (position!=-1){
            removeUsersFromRegistered(position);
            return true;
        }
        return false;
    }
    private int findUserByIndex(String phoneNumber, User[] users, int index) {
        for (int i = 0; i < index; i++) {
            if (users[i].getPhoneNumber().equals(phoneNumber))
                return i;
        }
        return -1;
    }

    private void resizeUnReg() {
        int size = unRegisteredUsers.length + (unRegisteredUsers.length >> 1);
        User[] newUnRegUser = new User[size];
        int[] newUnCode = new int[size];
        for (int i = 0; i < newUnRegUser.length; i++) {
            newUnRegUser[i] = unRegisteredUsers[i];
            newUnCode[i] = codes[i];
        }
        unRegisteredUsers = newUnRegUser;
        codes = newUnCode;
    }

    private void resizeReg() {
        int size = registeredUsers.length + (registeredUsers.length >> 1);
        User[] newRegUsers = new User[size];
        for (int i = 0; i < registeredUsers.length; i++) {
            newRegUsers[i] = registeredUsers[i];
        }
        registeredUsers = newRegUsers;
    }

    private void removeUsersFromUnRegistered(int position) {
        unRegIndex--;//0,1,2,3,4
        unRegisteredUsers[position] = unRegisteredUsers[unRegIndex];
        codes[position] = codes[unRegIndex];
    }

    private void removeUsersFromRegistered(int position) {
        regIndex--;
        registeredUsers[position] = registeredUsers[regIndex];
    }
}


