package TestUtil;

/**
 * project : Bootcamp1
 * package : TestUtil
 * author  : Allamuradov Tal'at
 * date    : 14.09.2022_0:32
 */
  public   class TestUtil {
        public static void assertEquals(Object result, Object expected) {
            if (!result.equals(expected)) {
                throw new IllegalArgumentException("Kutilgan natija: " + expected + " Sizning natijangiz:" + result);
            }
        }
    }

