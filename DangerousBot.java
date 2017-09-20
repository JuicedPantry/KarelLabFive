
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        testOdd();
    }
    public void testOdd(){
        int numBeepers=0;
        while(nextToABeeper()){
            pickBeeper();
            numBeepers++;
        }
        if(numBeepers % 2 == 1){
            turnLeft();
            move();
            while(nextToABeeper()){
                pickBeeper();
            }
        }
        else{
            turnRight();
            move();
            while(nextToABeeper()){
                pickBeeper();
            }
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

