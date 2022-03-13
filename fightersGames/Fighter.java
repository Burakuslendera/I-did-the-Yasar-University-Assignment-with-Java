
public class Fighter {
    public String name;
    public int health;
    public int damage;

    public Fighter(String name, int damage) {
        this.name = name;
        this.health = 100;
        this.damage = damage;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public void setDamage(int damage) {
        if (damage < 0) {
            this.damage = 0;
        } else {
            this.damage = damage;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Fighter enemy) {
        enemy.setHealth(enemy.getHealth() - enemy.getDamage());
    }

    @Override
    public String toString() {
        return "Fighter{"
                + "name =" + name
                + ", health =" + health
                + ", damage =" + damage
                + '}';
    }

}