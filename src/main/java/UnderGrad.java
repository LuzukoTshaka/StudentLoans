public class UnderGrad extends Student {
    UnderGrad(int interestAmt){

        super(interestAmt);
    }

    @Override
    public int loan(int loanAmount) {
        return loanAmount + loanInterst;
    }
}
