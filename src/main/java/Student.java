public abstract class Student implements LoanInterest{

    int loanInterst;

    Student (int interestAmt)

    {

        this.loanInterst = interestAmt;
    }

    public int getLoanInterst() {
        return loanInterst;
    }

    public void setLoanInterst(int loanInterst) {
        this.loanInterst = loanInterst;
    }
}
