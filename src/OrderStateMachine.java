
//定义外部接口
interface orderState {
    OrderStateMachine nextState();
    OrderStateMachine prevState();
}


//枚举类实现接口，override 重写方法

public enum OrderStateMachine implements orderState {
    DISPATCHING {
        @Override
        public OrderStateMachine nextState() {
            return DELIVERING;
        }

        @Override
        public OrderStateMachine prevState() {
            return this;
        }

    },
    DELIVERING {
        @Override
        public OrderStateMachine nextState(){
            return RECEIVED;
        }

        @Override
        public OrderStateMachine prevState(){
            return DISPATCHING;
        }
    },
    RECEIVED {
        @Override
        public OrderStateMachine nextState(){
            return this;
        }

        @Override
        public OrderStateMachine prevState(){
            return DELIVERING;
        }
    }
}


