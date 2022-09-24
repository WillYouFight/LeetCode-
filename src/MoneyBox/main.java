package MoneyBox;

/**
 * project : Bootcamp1
 * package : MoneyBox
 * author  : Allamuradov Tal'at
 * date    : 06.09.2022_6:24
 */
public class main {
    public static void main(String[] args) {
        long lastTime = System.currentTimeMillis();
        MoneyBox box = new MoneyBox(5);
        TestUtil.assertEquals(box.isEmpty(), true);
        TestUtil.assertEquals(box.isFull(), false);
        TestUtil.assertEquals(box.add(new Money(500)), true);
        TestUtil.assertEquals(box.isEmpty(), false);
        TestUtil.assertEquals(box.getMoneyCount(), 1);
        TestUtil.assertEquals(box.getAmount(), 500);
        TestUtil.assertEquals(box.add(new Money(1500)), true);
        TestUtil.assertEquals(box.getAmount(), 2000);
        TestUtil.assertEquals(box.add(new Money(1500)), true);
        TestUtil.assertEquals(box.add(new Money(1500)), true);
        TestUtil.assertEquals(box.add(new Money(1500)), true);
        TestUtil.assertEquals(box.getMoneyCount(), 5);
        TestUtil.assertEquals(box.getAmount(), 6500);
        TestUtil.assertEquals(box.add(new Money(1500)), false);
        TestUtil.assertEquals(box.getAmount(), 6500);
        TestUtil.assertEquals(box.getMoneyCount(), 5);
        System.out.println("Run time: " + (System.currentTimeMillis() - lastTime) + " ms");
    }
}
class  Money{
    int dollar;

    public Money(int dollar) {
        this.dollar = dollar;
    }
}
class  MoneyBox{
     int count;
    int allMoney;
     int moneyBoxSize;
    public MoneyBox(int moneyBoxSize) {
        this.moneyBoxSize = moneyBoxSize;
    }
    boolean add(Money money){
        if (isFull()) return false;
        count++;
        allMoney+=money.dollar;
        return true;
    }
    boolean isEmpty(){
        return count==0;
    }
    boolean isFull(){
        return count==moneyBoxSize;
    }
    int getMoneyCount(){
        return count;
    }
    int getAmount(){
        return allMoney;
    }
}
