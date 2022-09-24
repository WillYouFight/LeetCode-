package ExemTask;

/**
 * project : Bootcamp1
 * package : ExemTask
 * author  : Allamuradov Tal'at
 * date    : 18.09.2022_15:06
 */
public class UserDate {
    private String name;
    private int age;
    private String phoneNumber;
    public UserDate(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
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
    public void showUserInfo(){
        System.out.println("Name:" + name + " && " + " Age: " + age + " && " + "PhoneNumber: " + phoneNumber);
    }
}
