package HomeWork18.Task1;

import java.util.ArrayList;

/**
 * project : Bootcamp1
 * package : HomeWork18.Task1
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_7:20
 */
public class Task1ProductMain {
    public static void main(String[] args) {
        ArrayList<Task1Product> pList=new ArrayList<>();
        Task1Product p1=new Task1Product("Mango",4000,3);
        Task1Product p2=new Task1Product("Gango",5000,6);
        Task1Product p3=new Task1Product("Bango",6000,15);
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        Task1Product max=pList.get(0);
        Task1Product penultimate;
        int index1=0;
        int index2=0;
        for (int i = 1; i < pList.size(); i++) {
            if (pList.get(i).getCost()>max.getCost()){
                penultimate=max;
                index1=pList.indexOf(penultimate);//>?
                index2=pList.indexOf(pList.get(i));//>?
                max=pList.get(i);
            }
        }
        int fresh=0;
        if (pList.get(index1).getDate()>=pList.get(index2).getDate()){
            fresh=index1;
        }else {
            fresh=index2;
        }
        System.out.println(pList.get(fresh));
    }
}
