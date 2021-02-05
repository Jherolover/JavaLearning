package redundantcode.templatemethod.right;

import redundantcode.templatemethod.Cart;
import redundantcode.templatemethod.Db;

public class TestMain {

    public static void main(String[] args) {


    }
    public Cart right(int userId) {
        String userCategory = Db.getUserCategory(userId);
        //AbstractCart cart = (AbstractCart) applicationContext.getBean(userCategory + "UserCart");
        //return cart.process(userId, items);
        return new Cart();
    }

}
