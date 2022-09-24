package HomeWork17.PlayStation.Games.WeaponOff;

import HomeWork17.PlayStation.PlayStation.GameQuitAndOffListener;
import HomeWork17.PlayStation.PlayStation.GameTtx;

import java.util.Scanner;

/**
 * project : Bootcamp1
 * package : HomeWork17.PlayStation.Games.WeaponOff
 * author  : Allamuradov Tal'at
 * date    : 21.09.2022_11:16
 */
public class WeaponOff implements GameTtx {
    private GameQuitAndOffListener gameQuitAndOffListener;

    @Override
    public void play() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Playing...");
        System.out.print("Quit: ");
        System.out.print("OffPlayStation: ");
        int chosen=scanner.nextInt();
        if (chosen==1){
            off();
        }else if (chosen==2){
            quit();
        }else {
            System.out.println("Your chose not correct! Please enter the correct number");
        }
    }
    @Override
    public void quit() {
        gameQuitAndOffListener.show_And_backToMenu();
    }

    @Override
    public void off() {
        System.out.println("Have a nice day!");
    }

    @Override
    public String getNameGame() {
        return "Prepare weapons to kill";
    }

    @Override
    public void setGameQuitAndOffListener(GameQuitAndOffListener gameQuitAndOffListener) {
        this.gameQuitAndOffListener=gameQuitAndOffListener;
    }
}
