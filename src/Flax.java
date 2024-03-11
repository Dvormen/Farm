import java.util.Random;

public class Flax extends Flower{
    Random rn = new Random();
    private int growthState;

    public String WateringAndGrowing(){
        double chance = rn.nextDouble(10)+10;
        chanceOfGrowth += chance;
        if(rn.nextDouble(100)<chanceOfGrowth){
            chanceOfGrowth = 0;
            growthState++;
            if(growthState==5){
                return "The "+name+" has fully grown";
            }
            return "The "+name+" grew :)";
        }
        return "The "+name+" has better chances of growing next time! +("+chance+")";
    }

    public boolean doesFit (double land){
        if (land > neededArea){
            return true;
        }else{
            return false;
        }
    }

}
