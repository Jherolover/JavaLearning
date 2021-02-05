package redundantcode.CopyBean;

public class OrderDto {
    private String name;
    private int age;
    private String orderinfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrderinfo() {
        return orderinfo;
    }

    public void setOrderinfo(String orderinfo) {
        this.orderinfo = orderinfo;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", orderinfo='" + orderinfo + '\'' +
                '}';
    }
}
