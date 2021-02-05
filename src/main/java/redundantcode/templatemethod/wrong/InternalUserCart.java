package redundantcode.templatemethod.wrong;

import redundantcode.templatemethod.Cart;
import redundantcode.templatemethod.Db;
import redundantcode.templatemethod.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 内部用户
 */
public class InternalUserCart {
    public Cart process(long userid, Map<Long,Integer> items){
        Cart cart = new Cart();
        //把Map的购物车转化为Item列表
        List<Item> itemList = new ArrayList<Item>();
        items.entrySet().stream().forEach(entry-> {
            Item item = new Item();
            item.setId(entry.getKey());
            item.setPrice(Db.getItemPrice(entry.getKey()));
            item.setQuantity(entry.getValue());
            itemList.add(item);
        });
        cart.setItems(itemList);
        //处理商品优惠和折扣
        itemList.stream().forEach(item -> {
            //运费为商品总价的10%
            item.setDeliveryPrice(BigDecimal.ZERO);
            //无优惠
            item.setCouponPrice(BigDecimal.ZERO);
        });
        //计算总总价
        cart.setTotalItemPrice(cart.getItems().stream().map(item-> item.getPrice().multiply(BigDecimal.valueOf(item.getQuantity()))).reduce(BigDecimal.ZERO,BigDecimal::add));
        //获取总运费
        cart.setTotalDeliveryPrice(cart.getItems().stream().map(Item::getDeliveryPrice).reduce(BigDecimal.ZERO,BigDecimal::add));
        //结算总优惠
        cart.setTotalDiscount(cart.getItems().stream().map(Item::getCouponPrice).reduce(BigDecimal.ZERO,BigDecimal::add));
        //支付总价=总价+总运费-总优惠
        cart.setPayPrice(cart.getTotalItemPrice().add(cart.getTotalDeliveryPrice()).subtract(cart.getTotalDiscount()));
        return cart;
    }
}
