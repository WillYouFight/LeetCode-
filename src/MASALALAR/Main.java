package MASALALAR;

/**
 * project : Bootcamp1
 * package : MASALALAR
 * author  : Allamuradov Tal'at
 * date    : 19.09.2022_14:32
 */
public class Main {
    public static void main(String[] args) {

    }
}
class Worker{
    String familiya;
    String ismi;
    String lavozimi;
    String ishgaKirganYili;
    int yoshi;
    Worker []list;

    public Worker(String familiya, String ismi, String lavozimi, String ishgaKirganYili, int yoshi) {
        this.familiya = familiya;
        this.ismi = ismi;
        this.lavozimi = lavozimi;
        this.ishgaKirganYili = ishgaKirganYili;
        this.yoshi = yoshi;
        this.list = new Worker[10];
    }
}
//2.Quyidagi atributlari bor boâ€™lgan Worker nomli class yarating:
// 1.familiya,2ismi,3.yoshi,4.lavozimi,5.ishga kirgan yili.
// Yoshi berilgan sondan kata boâ€™lgan ishchilarni ekranga chiqaring.
