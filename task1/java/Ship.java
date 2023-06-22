import java.time.LocalTime;
import java.util.Date;
import java.util.PrimitiveIterator;

public class Ship extends Thread{

    final private int box = 10;

    @Override
    public void run() {
        for (int i = 1;i<=box;i++){
            try {
                sleep( 500);
                System.out.println(LocalTime.now() + " Ship "+ getName()+ " Unloaded box: " + i);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Ship " + getName() + " Unloaded");
    }

    public int getBox() {
        return box;
    }
}
