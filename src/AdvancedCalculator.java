public class AdvancedCalculator extends IntCalculator {
    //public double doubleState;
    public AdvancedCalculator() {
        state = 0;
    }

    public AdvancedCalculator(int intState) {
        super(intState);
        //doubleState =(double) intState;
    }

    public AdvancedCalculator power(int nr) {
        state = state ^ nr;
        return this;
    }

    public double rad(int ordin) {
        state = (int) Math.pow(state, ordin);
        return state;
    }

    public AdvancedCalculator sub(double i) {
        state -= i;
        return this;
    }

    //    public void clear(){
//        doubleState =(double)0;
//        state=0;
//    }
//    public double results() {
//       return doubleState;
//    }

    @Override
    public AdvancedCalculator add(int nr) {
        super.add(nr);
        return this;
    }
    public AdvancedCalculator subtract(int nr){
        super.subtract(nr);
        return this;
    }
    public AdvancedCalculator multiply(int nr){
        super.multiply(nr);
        return this;
    }

}
