import java.math.BigDecimal;

public class OrderDemo{
    public static void main(String [] args){
        Order order = new Order("测试商品",new BigDecimal(10));
        System.out.println( "商品的名字为：" + order.getName() + "商品的金额为：" + order.getAmount());
        order.nextState();
        order.prevState();
        order.nextState();

    }
}