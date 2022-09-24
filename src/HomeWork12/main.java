package HomeWork12;

import TestUtil.TestUtil;

import java.util.Locale;

/**
 * project : Bootcamp1
 * package : HomeWork13
 * author  : Allamuradov Tal'at
 * date    : 12.09.2022_21:01
 */
public class main {
    public static void main(String[] args) {
        BonusLid bonus = new BonusLid(4);
        Lid lid = new Lid("bbbbbb22");
        Lid lid2 = new Lid("aaba1121");
        Lid lid3 = new Lid("AA22bb1b");
        Lid lid4 = new Lid("BBbb2222");
        Lid lid5 = new Lid("BBbb22221");
        Lid lid6 = new Lid("ccbb3322");
        Lid lid7 = new Lid("abcd1234");
        Lid lid8 = new Lid("BBbb2222");
        TestUtil.assertEquals(bonus.check(lid),true);//true
        TestUtil.assertEquals(bonus.check(lid2),true);//true
        TestUtil.assertEquals(bonus.check(lid3),false);//false
        TestUtil.assertEquals(bonus.check(lid4),true); //true
        TestUtil.assertEquals(bonus.check(lid5),false);//false
        TestUtil.assertEquals(bonus.check(lid6),true);//true
        TestUtil.assertEquals(bonus.check(lid7),false);//false
        TestUtil.assertEquals(bonus.check(lid8),false);//false
        System.out.println("Job done!");
        System.out.println("|===||===||===||===||===||===||===||OVEN||===||===||===||===||===||===||===||===|");
        Oven oven=new Oven(1200,1500);
        oven.showInfo();
        oven.switchOn(1,20);
        oven.switchOn(2,10);
        oven.switchOn(3,5);
        oven.showInfo();
        //oven.switchOff(1);
        //oven.showInfo();
        //oven.switchOff(2);
        //oven.showInfo();
        //oven.switchOff(3);
        //oven.showInfo();
        oven.switchOff(1);
        oven.switchOn(2,10);
        oven.showInfo();
        oven.switchOff(2);
        oven.switchOn(3,5);
        oven.showInfo();

    }
}
class Oven {
        private final int modePower1;
        private final int modePower2;
        private int wholePower;
        private boolean mode1;
        private boolean mode2;
        private boolean mode3;
        public Oven(int _mode1, int _mode2) {
            this.modePower1 = _mode1 / 60;
            this.modePower2 = _mode2 / 60;
        }
        void switchOn(int i, int time) {
            switch (i) {
                case 1:
                    if (mode2 != true && mode3 != true) {
                        wholePower += modePower1 * time;
                        mode1 = true;
                        break;
                    }
                    break;
                case 2:
                    if (mode1 != true && mode3 != true) {
                        wholePower += modePower2 * time;
                        break;
                    }
                    break;
                case 3:
                    if (mode1 != true && mode2 != true) {
                        wholePower += modePower1 * time + modePower2 * time;
                        break;
                    }
                    break;
                default:
                    System.out.println("mode is not correct");
            }
        }
        void switchOff(int mode) {
            switch (mode) {
                case 1:
                    mode1 = false;
                    break;
                case 2:
                    mode2 = false;
                    break;
                case 3:
                    mode3=false;
                    break;
                default:
                    System.out.println("mode is not correct");
            }
        }
        void showInfo() {
            System.out.println("total charged capacity: " + wholePower);
        }
    }

class BonusLid {
    private int count;
    private int sum;

    public BonusLid(int count) {
        this.count = count;
    }

    int countFirst = 0;
    int countSecond = 0;
    int vowel = 0;
    int consonant = 0;
    public boolean check(Lid lid) {
        int first = 0;
        int second = 0;
        int unli = 0;
        int undosh = 0;
        String code = lid.getCode();
        String lowerCode = code.toLowerCase(Locale.ROOT);
        String sortLowerCode = lowerCode.replace(" ", "");
        if (sortLowerCode.length() == 8 && sum < count) {
            char[] mas = sortLowerCode.toCharArray();
            for (int i = 0; i < mas.length; i++) {
                int saveAlphabet ;
                if (i <= 3) {
                    if (mas[i] >= 'a' && mas[i]<='z'){
                        if (mas[i] == 'a' || mas[i] == 'e' || mas[i] == 'i' || mas[i] == 'u' || mas[i] == 'o'){
                            unli++;
                        }else {
                            undosh++;
                        }
                        saveAlphabet=mas[i]-'a'+1;
                    }else {
                        saveAlphabet=mas[i]-'0';
                    }
                    first+=saveAlphabet;
                }else {
                    if (mas[i]>='a'&&mas[i]<='z'){
                        saveAlphabet=mas[i]-'a'+1;
                    }else {
                    saveAlphabet=mas[i]-'0';
                    }
                    second+=saveAlphabet;
                }
            }
            boolean isAnd = first ==second||unli==undosh;
            if (isAnd)sum++;
            return isAnd;
        }
        return false;
    }
}

class Lid {
    private String code;

    public Lid(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

