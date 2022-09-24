package MoneyBox;

/**
 * project : Bootcamp1
 * package : MoneyBox
 * author  : Allamuradov Tal'at
 * date    : 06.09.2022_6:22
 */
public class TestUtil {
    public static void assertEquals(Object result, Object expected) {
        if (!result.equals(expected)) {
            throw new IllegalArgumentException("Kutilgan natija: " + expected + " Sizning natijangiz:" + result);
        }
    }
}
