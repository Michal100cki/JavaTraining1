package Player;

/**
 * Created by Rokers on 2016-12-07.
 */
public class EnhancedPlayer {

    private String name;
    private int hitPoints=100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0&&health<100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints=this.hitPoints-damage;
        if(this.hitPoints<=5){
            System.out.println( "Nokaut zawodnika "+this.hitPoints);
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
