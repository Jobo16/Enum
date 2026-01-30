import java.math.BigDecimal;

// 定义order 类，写好getter setter方法。
public class Order {
    private OrderState stateMachine = OrderStateMachine.DISPATCHING;
    private String name;
    private BigDecimal amount;
    // 构造方法
    public Order(String orderName, BigDecimal amount) {
        this.name = orderName;
        this.amount = amount;
    }

    // 设置金额 
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    // 获取金额
    public BigDecimal getAmount() {
        return amount;
    }
    // 设置名称
    public void setName(String name) {
        this.name = name;

    }
    // 获取名称
    public String getName() {
        return name;
    }
    // 获取下一个状态
    public void nextState() {
        System.out.printf("商品状态已从%s变为%s%n", this.stateMachine.toString(), this.stateMachine.nextState().toString());
        this.stateMachine = this.stateMachine.nextState();
    }
    // 获取上一个状态
    public void prevState() {
        System.out.printf("商品状态已从%s变为%s%n", this.stateMachine.toString(), this.stateMachine.prevState().toString());
        this.stateMachine = this.stateMachine.prevState();
    }
}



