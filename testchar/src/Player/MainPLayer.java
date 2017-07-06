package Player;

/**
 * Created by Rokers on 2016-12-07.
 */
public class MainPLayer {
    public static void main(String [] args){
        EnhancedPlayer player=new EnhancedPlayer("Bolek",30,"sword");

        player.loseHealth(20);
        System.out.println( player.getHealth());
        player.loseHealth(30);
        System.out.println( player.getHealth());
    }
}
