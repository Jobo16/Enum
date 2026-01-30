import java.math.BigDecimal;

public class OrderDemo{
    public static void main(String [] args){
        Order order = new Order("测试商品",new BigDecimal(10));
        order.nextState();
        order.prevState();
        order.nextState();

    }
}