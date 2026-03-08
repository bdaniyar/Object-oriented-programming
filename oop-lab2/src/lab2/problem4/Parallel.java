package lab2.problem4;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;

    private double potentialDiff;

    public Parallel(Circuit c1, Circuit c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public double getResistance(){

        double r1 = c1.getResistance();
        double r2 = c2.getResistance();

        return (r1 * r2) / (r1 + r2);
    }

    public double getPotentialDiff(){
        return potentialDiff;
    }

    public void applyPotentialDiff(double V){

        potentialDiff = V;

        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}