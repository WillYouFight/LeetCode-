package ExemTask;

import java.util.Scanner;

/**
 * project : Bootcamp1
 * package : ExemTask
 * author  : Allamuradov Tal'at
 * date    : 18.09.2022_19:55
 */
public class Main {
    public static void main(String[] args) {
        UserDate userDate=new UserDate("Talat",22,"+998912153563");
        RegisterController registerController=new RegisterController(15);//maksimal soni.
        registerController.logListener(new LogInterface() {
            @Override
            public void showMessage(String message) {
                System.out.println(message);
            }
        });
        registerController.setUserListener(new UserInterface() {
            @Override
            public void show(UserDate user) {
                user.showUserInfo();
            }
        });
        Scanner scanner=new Scanner(System.in);
        registerController.register(userDate);
        System.out.println("Code:");
        registerController.checkSmsCode("+998912153563", scanner.nextInt());
        registerController.getAllUsers();

    }
}
