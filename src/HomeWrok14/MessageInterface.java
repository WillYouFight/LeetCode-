package HomeWrok14;

/**
 * project : Bootcamp1
 * package : HomeWrok14
 * author  : Allamuradov Tal'at
 * date    : 15.09.2022_22:30
 */
interface MessageInterface {
    default void showMessage(String message) {
        System.out.println(">->>->>->>->>->>->>->>->>BODY<<-<<-<<-<<-<<-<<-<<-<<-<");
    }
}
