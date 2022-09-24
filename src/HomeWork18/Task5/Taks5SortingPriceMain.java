package HomeWork18.Task5;

import HomeWork18.Task1.Task1Product;

import java.util.ArrayList;

/**
 * project : Bootcamp1
 * package : HomeWork18.Task5
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_10:27
 */
public class Taks5SortingPriceMain {
    public static void main(String[] args) {
        ArrayList<Task5SortingPrice> pList=new ArrayList<>();
        Task5SortingPrice p1=new Task5SortingPrice("Mango",4000,3);
        Task5SortingPrice p2=new Task5SortingPrice("Gango",5000,6);
        Task5SortingPrice p3=new Task5SortingPrice("Bango",6000,15);
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        sortingProductsToPrice(pList);
    }
    public static void sortingProductsToPrice(ArrayList<Task5SortingPrice> arrayList){
        if (arrayList.size()==0){
            System.out.println("List is EMPTY");
        }else {
            for (int i = arrayList.size()-1; i >0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arrayList.get(j).getCost()>arrayList.get(j+1).getCost()){
                        Task5SortingPrice u=arrayList.get(j);
                        arrayList.set(j,arrayList.get(j+1));
                        arrayList.set(j+1,u);
                    }
                }
            }
            for (int i = arrayList.size()-1; i >= 0; i--) {
                System.out.println(arrayList.get(i));
                System.out.println("==>==>==>==>==>==>==>==>==>==>==>==>==>==>");
            }
        }
    }
}
