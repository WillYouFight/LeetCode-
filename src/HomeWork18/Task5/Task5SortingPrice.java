package HomeWork18.Task5;

/**
 * project : Bootcamp1
 * package : HomeWork18.Task5
 * author  : Allamuradov Tal'at
 * date    : 22.09.2022_10:26
 */
public class Task5SortingPrice {
    private String name;
    private int cost;
    private int date;

    public Task5SortingPrice(String name, int cost, int date) {
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
