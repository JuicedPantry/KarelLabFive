
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void findTreasure() {
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
        countBeepers();
        findBeepers();
    }
    public void countBeepers(){
        int numBeepers=0;
        while(nextToABeeper()){
            pickBeeper();
            numBeepers++;
        }
        if(numBeepers==1){
            faceNorth();
        }
        if(numBeepers==2){
            faceEast();
        }
        if(numBeepers==3){
            faceSouth();
        }
        if(numBeepers==4){
            faceWest();
        }
        if(numBeepers==5){
            turnOff();
        }
    }
    public void faceNorth(){
        while(!facingNorth()){
            turnLeft();
        }
    }
    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }
    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }
    public void faceWest(){
        while(!facingWest()){
            turnLeft();
        }
    }
    public void findBeepers(){
        while(!nextToABeeper()){
            move();
        }
    }
}