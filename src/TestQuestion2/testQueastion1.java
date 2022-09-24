package TestQuestion2;

/**
 * project : Bootcamp1
 * package : TestQuestion2
 * author  : Allamuradov Tal'at
 * date    : 09.09.2022_16:24
 */
public class testQueastion1 {
        public static void main(String[] args) {
            T t = new T();
            t.getPosition(t);
            t.getPosition(t);
            t.getPosition(t);
            t.show();
        }
    }
    class T {
        int count;
        void getPosition(T t){
            t.count++;
        }
        void show(){
            System.out.println(count);
        }
    }
