package HomeWrok14;

/**
 * project : Bootcamp1
 * package : HomeWrok14
 * author  : Allamuradov Tal'at
 * date    : 15.09.2022_22:26
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
