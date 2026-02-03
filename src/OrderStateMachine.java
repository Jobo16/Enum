//写一个有两个方法的接口

interface OrderState {
    OrderState nextState();
    OrderState prevState();
}


//写实现具体方法的enum子类

public enum OrderStateMachine implements OrderState {
    DISPATCHING{
        @Override
        public OrderStateMachine nextState(){
            return DELIVERING;
        }
        @Override
        public OrderStateMachine prevState(){
            return this;
        }

    },

    DELIVERING{
        @Override
        public OrderStateMachine nextState(){
            return RECEIVED;
        }
        @Override
        public OrderStateMachine prevState(){
            return DISPATCHING;
        }

    },

    RECEIVED{
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
