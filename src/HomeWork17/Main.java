package HomeWork17;

import HomeWork17.PlayStation.Games.WarCraf.WarCraft;
import HomeWork17.PlayStation.Games.WarZone.WarZone;
import HomeWork17.PlayStation.Games.WeaponOff.WeaponOff;
import HomeWork17.PlayStation.PlayStation.PlayStation;

/**
 * project : Bootcamp1
 * package : HomeWork17
 * author  : Allamuradov Tal'at
 * date    : 21.09.2022_8:57
 */
public class Main {
    public static void main(String[] args) {
        PlayStation playStation=new PlayStation();
        WarCraft warCraft=new WarCraft();
        warCraft.setGameQuitAndOffListener(playStation);
        playStation.addGame(warCraft);
        WarZone warZone=new WarZone();
        warZone.setGameQuitAndOffListener(playStation);
        playStation.addGame(warZone);
        WeaponOff weaponOff=new WeaponOff();
        weaponOff.setGameQuitAndOffListener(playStation);
        playStation.addGame(weaponOff);
        playStation.powerOn();
    }
}
