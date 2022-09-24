package HomeWork18.Task1;

/**
 * project : Bootcamp1
 * package : HomeWork18.Task1
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_7:05
 */
public class Task1Product {
    private String name;
    private int cost;
    private int date;

    public Task1Product(String name, int cost, int date) {
        this.name = name;
        this.cost = cost;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "task1Product{" +
                "name: " + name +
                ", cost: " + cost +
                ", date: " + date +
                '}';
    }
}
