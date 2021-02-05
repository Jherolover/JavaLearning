package redundantcode.templatemethod.wrong;

import redundantcode.templatemethod.Cart;
import redundantcode.templatemethod.Db;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

    public static void main(String[] args) {
        String usertype = Db.getUserCategory(1L);
        if("Normal".equals(usertype)){
            NormalUserCart normalUserCart  = new NormalUserCart();
            Map<Long,Integer> items = new HashMap<>();
            items.put(1L,3);
            Cart process = normalUserCart.process(1L, items);
            System.out.println(process.toString());
        }
    }
}
