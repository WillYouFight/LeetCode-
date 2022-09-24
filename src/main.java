import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * project : Bootcamp1
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.09.2022_18:18
 */
public class main {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("talat");
        names.add("talat");
        names.add("bobir");
        names.add("binafsha");
        names.add("atirgul");
        names.add("lola");
        names.add("binafsha");
        Set<String> gelNew=new HashSet<>(names);
        System.out.println(gelNew);

    }

}
