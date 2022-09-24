package HomeWork18.Task3;

import java.util.ArrayList;

/**
 * project : Bootcamp1
 * package : HomeWork18.Task3
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_8:51
 */
public class Task3LastNameWomen {
    public static void main(String[] args) {
        ArrayList<String> lastName = new ArrayList<>();
        ArrayList<String> lastNameWomen=new ArrayList<>();
        lastName.add("boymuradov");
        lastName.add("dilova");
        lastName.add("toshova");
        lastName.add("erkinova");
        if (lastName.size()==0){
            System.out.println("");
        }
        for (int i = 0; i < lastName.size(); i++) {
            lastName.set(i,lastName.get(i).replaceAll("[^a-zA-Z]",""));
            if (lastName.get(i).endsWith("a")){
                lastNameWomen.add(lastName.get(i));
            }
        }
        String element = lastNameWomen.get(0);
        int max = element.length();
        int index = 0;
        for (int i = 1; i < lastNameWomen.size(); i++) {
            lastNameWomen.set(i, lastNameWomen.get(i));
            if (lastNameWomen.get(i).length() > max && lastNameWomen.get(i).endsWith("a")) {
                index = i;
                max = lastNameWomen.get(i).length();
            }
        }
        System.out.println(lastNameWomen.get(index));
    }
}
