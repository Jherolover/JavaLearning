package redundantcode.CopyBean;


import org.springframework.beans.BeanUtils;
import org.springframework.core.annotation.Order;

public class TestCopy {
    public static void main(String[] args) {
        OrderDo orderDo = new OrderDo();
        orderDo.setName("do");
        orderDo.setAge(12);
        OrderDto orderDto = new OrderDto();
        BeanUtils.copyProperties(orderDo,orderDto);
        System.out.println(orderDto.toString());
    }
}
