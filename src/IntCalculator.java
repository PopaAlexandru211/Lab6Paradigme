public class IntCalculator  {
    public int state;
    IntCalculator(){
        state=0;
    }
    IntCalculator(int IntState) {
        this.state=IntState;
    }
    public IntCalculator add(int nr){
        state+=nr;
        return this;
    }
    public IntCalculator subtract(int nr){
        state-=nr;
        return this;
    }
    public IntCalculator multiply(int nr){
        state*=nr;
        return this;
    }
    public int results(){
        return state;
    }
    public void clear(){
        state=0;
    }
}
