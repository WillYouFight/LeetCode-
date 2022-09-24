package HomeWrok14;

/**
 * project : Bootcamp1
 * package : HomeWrok14
 * author  : Allamuradov Tal'at
 * date    : 15.09.2022_22:44
 */
public class Main {
    public static void main(String[] args) {
        GroupManager groupManager=new GroupManager();
        groupManager.setManagerListener(new MessageInterface() {
            @Override
            public void showMessage(String message) {
                MessageInterface.super.showMessage(message);
                System.out.println(message);

            }
        });
        User user=new User("Jamshid","Qo`ziyev",20);
        User user2=new User("Husanxon","Azamov",16);
        User user3=new User("Tal`at","Allamurodov",31);
        groupManager.createGroup("TIPTOP",27);
        groupManager.createGroup("BUYAKASHA",2);
        groupManager.createGroup("LAYLAK",2);
        groupManager.createGroup("BESHBARMOQ",7);
        groupManager.addUserFromGroup("TIPTOP",user);
        groupManager.addUserFromGroup("BUYAKASHA",user2);
        groupManager.addUserFromGroup("LAYLAK",user3);
        groupManager.addUserFromGroup("BESHBARMOQ",user3);
        groupManager.getUserOfManyGroup();
    }
}
