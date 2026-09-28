public class Loan {


    
    double P;
    double R;
    double T;
    int n;
    public Loan(double p,double r,double y,int n){
        this.P=p;
        this.R=r;
        this.T=y;
        this.n=n;
    }
    

    //P+P*R*T
    public double calculateSimpleInterest(){
       
        return P+P*R*T/100;
        //return 0.0;
    }

    //double P,double R,double T,int n
    public double calculateTotalRepayment(){
        return P*Math.pow(1+(R/100)/n,n*T);
        //return 0.0;
    } 

}
