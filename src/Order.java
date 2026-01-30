
import java.math.BigDecimal;

// 定义order 类，写好gitter setter方法。
public class Order {
    private OrderStateMachine stateMachine = OrderStateMachine.DISPATCHING;
    private String name;
    private BigDecimal amount;

    public Order(String orderName, BigDecimal amount) {
        this.name = orderName;
        this.amount = amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void nextState() {
        this.stateMachine = this.stateMachine.nextState();
        System.out.printf("商品状态为：%s%n", this.stateMachine);
    }

    public void prevState() {
        this.stateMachine = this.stateMachine.prevState();
        System.out.printf("商品状态为：%s%n", this.stateMachine);
    }
}



