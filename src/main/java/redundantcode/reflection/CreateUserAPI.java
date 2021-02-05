package redundantcode.reflection;

public class CreateUserAPI  {

    //@BankAPIField(order = 1, length = 12, type = "S")
    String name;
    private String identity;
    private String mobile;
    private int age;

    public CreateUserAPI() {
    }



    public CreateUserAPI(String name, String identity, String mobile, int age) {
        this.name = name;
        this.identity = identity;
        this.mobile = mobile;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
