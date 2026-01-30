interface OrderState {
    OrderStateMachine nextState();

    OrderStateMachine prevState();
}

public enum OrderStateMachine implements OrderState {
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
        public OrderStateMachine nextState() {
            return RECEIVED;
        }

        @Override
        public OrderStateMachine prevState() {
            return DISPATCHING;
        }

    },

    RECEIVED {
        @Override
        public OrderStateMachine nextState() {
            return this;
        }

        @Override
        public OrderStateMachine prevState() {
            return DELIVERING;
        }


    }
}