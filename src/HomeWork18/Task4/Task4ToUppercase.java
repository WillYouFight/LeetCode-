package HomeWork18.Task4;

import java.util.ArrayList;

/**
 * project : Bootcamp1
 * package : HomeWork18.Task4
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_10:09
 */
public class Task4ToUppercase {
    public static void main(String[] args) {
        ArrayList<String>nListUpper=new ArrayList<>();
        nListUpper.add("talat123");
        nListUpper.add("begzot");
        nListUpper.add("normat");
        toUpperCaseList(nListUpper);
    }
    public static void toUpperCaseList(ArrayList<String> nameList){
        if (nameList.size()!=0){
            for (int i = 0; i < nameList.size(); i++) {
                nameList.set(i,nameList.get(i).replaceAll("[^a-zA-Z]",""));
                System.out.println(nameList.get(i).toUpperCase());
            }
        }
    }
}
