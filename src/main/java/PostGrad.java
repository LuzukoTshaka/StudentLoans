public class PostGrad extends Student {

    PostGrad(int interestAmt) {
        super(interestAmt);
    }

    @Override
    public int loan(int loanedAmt) {
        return loanedAmt + loanInterst;
    }
}
