public abstract class Pokemon {

    private String name;
    private double health;
    private double attack;
    private double defense;

    public Pokemon(String name, double health, double defense, double attack) {
        this.name = name;
        this.health = health;
        this.defense = defense;
        this.attack = attack;
    }

    public abstract double attack(int attackIndex);

    public abstract double defense();

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public double getDefense() {
        return defense;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getAttack() {
        return attack;
    }

    public void fight(int attackIndex, Pokemon p) {

        double attack = attack(attackIndex);
        String attackName = getAttackName();
        double defense = p.defense();
        double damage = defense - attack;
        double currentHealth = p.getHealth() + damage;


        if (damage <= 0) {
            if (damage == 0) {
                System.out.println("Attack and defense points are EQUAL! No damage dealth. HP = " + currentHealth);

            } else if (currentHealth < 0) {
                System.out.println(getName() + " deals " + attack + " damage with " + attackName +" and leaves " + p.getName() +
                        " after defense(" + defense + ") D E A D");
                p.setHealth(currentHealth);
                System.out.println(getName() + " wins! end");

            } else if (currentHealth > 0) {
                p.setHealth(currentHealth);
                System.out.println(getName() + " deals " + attack + " damage with " + attackName +" and leaves " + p.getName() +
                        " after defense(" + defense + ") with " + currentHealth + " HP");
            }

        } else {
            System.out.println("defence(" + defense + ") is higher than attack(" +  attack + ")");

        }
    }

    protected abstract String getAttackName();

    public boolean isAlive() {
        if (getHealth() > 0) {
            return true;
        }else{
            return false;
        }
    }
}
