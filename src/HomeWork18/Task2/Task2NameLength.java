package HomeWork18.Task2;

import java.util.ArrayList;

/**
 * project : Bootcamp1
 * package : HomeWork18.Task2
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_8:32
 */
public class Task2NameLength {
    public static void main(String[] args) {
        ArrayList<String> nameList=new ArrayList<>();
        nameList.add("jeck");
        nameList.add("johan123123123");
        nameList.add("alisaxon");
        if (nameList.size()==0){
            System.out.println("Name list is empty");
        }else {
            String symbol=nameList.get(0).replaceAll("[^a-zA-Z]","");
            int maxLength=symbol.length();
            int index=0;
            for (int i = 1; i < nameList.size(); i++) {
                nameList.set(i,nameList.get(i).replaceAll("[^a-zA-Z]",""));
                if (nameList.get(i).length()>maxLength){
                    index=i;
                    maxLength=nameList.get(i).length();
                }
            }
            System.out.println(nameList.get(index));
        }
    }
}
