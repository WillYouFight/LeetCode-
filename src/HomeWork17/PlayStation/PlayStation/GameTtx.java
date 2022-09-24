package HomeWork17.PlayStation.PlayStation;

/**
 * project : Bootcamp1
 * package : HomeWork17.PlayStation.PlayStation
 * author  : Allamuradov Tal'at
 * date    : 21.09.2022_9:01
 */
public interface GameTtx {
    void play();
    void quit();
    void off();
    String getNameGame();
    void setGameQuitAndOffListener(GameQuitAndOffListener gameQuitAndOffListener);
}
