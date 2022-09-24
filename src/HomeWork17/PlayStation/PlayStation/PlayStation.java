package HomeWork17.PlayStation.PlayStation;

import java.util.Scanner;

/**
 * project : Bootcamp1
 * package : HomeWork17.PlayStation.PlayStation
 * author  : Allamuradov Tal'at
 * date    : 21.09.2022_9:13
 */
public class PlayStation implements GameQuitAndOffListener {
    private GameTtx[] gamesArray;
    private int count;

    public PlayStation() {
        gamesArray = new GameTtx[10];
    }
    private void arrayBigger(GameTtx[] gamesMassive) {
        GameTtx[] size = new GameTtx[gamesMassive.length + gamesMassive.length / 2];
        for (int i = 0; i < gamesMassive.length; i++) {
            size[i] = gamesArray[i];
        }
        gamesArray=size;
    }

    public void addGame(GameTtx games) {
        if (gamesArray.length == count) {
            arrayBigger(gamesArray);
        }
        gamesArray[count++]=games;
    }
    private void gamesMenu(){
        if (gamesArray.length==count){
            System.out.println("You not have are game");
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+": "+gamesArray[i].getNameGame());
        }
        int deleted=count+1;
        int off=count+2;
        System.out.println("<==><==><==><==><==><==><==><==>|<==<==><==><==><==><==><==><==>");
        System.out.println(deleted+": Deleted game from menu");
        System.out.println(off+": Completely off PlayStation №5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chose: ");
        int index=scanner.nextInt();
        if (index==off){
            playStationOffFull();
        }else if (index==deleted){
            removeGame();
        }else if (index>0 && index<=count){
            gamesArray[index-1].play();
        }else {
            System.out.println("Your chose not correct! Please enter the correct number!");
            show_And_backToMenu();
        }
    }
    public void removeGame(){
        if (gamesArray.length==count){
            System.out.println("You are not have game");
        }
        for (int i = 0; i < count; i++) {
            System.out.println(i+": "+gamesArray[i].getNameGame());
        }
        System.out.println("<==><==><==><==><==><==><==><==>|<==<==><==><==><==><==><==><==>");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Select game to delete: ");
        int deleteToIndex=scanner.nextInt();
        if (deleteToIndex>0 && deleteToIndex<=count){
            gamesArray[deleteToIndex-1]=gamesArray[--count];
            System.out.println("Game deleted");
            show_And_backToMenu();
        }else {
            System.out.println("Your chose not correct! Please enter the correct number");
            show_And_backToMenu();
        }
    }
    public void powerOn(){
        show_And_backToMenu();
    }
    @Override
    public void show_And_backToMenu() {
        gamesMenu();
    }
    @Override
    public void playStationOffFull() {
        System.out.println("Have a nice day!");
    }
}
