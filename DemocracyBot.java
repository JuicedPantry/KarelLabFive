
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        findBallot();
        fixBallot();
        findBallot();
        fixBallot();
        findBallot();
        fixBallot();
        findBallot();
        fixBallot();
        findBallot();
        fixBallot();
    }
    public void findBallot(){
        move();
    }
    public void fixBallot(){
        if(nextToABeeper()){
            turnLeft();
            move();
            while(nextToABeeper()){
                pickBeeper();
            }
            putBeeper();
            turnLeft();
            turnLeft();
            move();
            move();
            while(nextToABeeper()){
                pickBeeper();
            }
            putBeeper();
            turnLeft();
            turnLeft();
            move();
            turnRight();
        }
        else{
            turnLeft();
            move();
            while(nextToABeeper()){
                pickBeeper();
            }
            turnLeft();
            turnLeft();
            move();
            move();
            while(nextToABeeper()){
                pickBeeper();
            }
            turnLeft();
            turnLeft();
            move();
            turnRight();
        }
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

