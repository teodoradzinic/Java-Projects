import java.util.Random;

public class Squirtle extends Pokemon{
    public Squirtle(String name, double health, double defense, double attack){
        super(name, health,defense,attack);
    }

    private String attackName;
    Random rand = new Random(1);

    @Override
    public double attack(int attackIndex) {

        double attack = getAttack();
        double attackModified;
        double modifier = rand.nextDouble();

        switch (attackIndex) {
            case 1: {
                attackName ="Torrent";
                attackModified = attack * modifier * 0.5;
            }
            break;
            case 2: {
                attackName ="Rain Dish";
                attackModified = attack * modifier * 0.25;
            }
            break;
            default:
                throw new IllegalArgumentException();
        }

        double roundOff = Math.round(attackModified * 100.0)/100;
        return roundOff;
    }
    @Override
    public String getAttackName() {
        return attackName;
    }
    @Override
    public double defense() {
        double defense = getDefense();
        double modifier = rand.nextDouble() * 0.5;
        double defenseModified = defense * modifier;
        double roundOff = Math.round(defenseModified * 100.0)/100;
        return roundOff;
    }
}
