package Practice_JDBC;

public class Customer {
    int id;
    String name;
    String city;
    int rate;
    int num;

    public Customer(int id, String name, String city, int rate, int num) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rate = rate;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", rate=" + rate +
                ", num=" + num +
                '}';
    }

}
