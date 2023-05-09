public abstract class Character {
    private String name;
    private int health;
    private int level;
    private boolean isAlive;

    public Character(String name) {
        this.name = name;
        this.health = 100;
        this.level = 1;
        this.isAlive = true;
    }

    public void attack(Character target) {
        if (isAlive && target.isAlive) {
            int damage = this.level;
            target.takeDamage(damage);
            if (!target.isAlive) {
                this.level++;
            }
        }
    }

    public void heal(Character target) {
        if (isAlive && target.isAlive) {
            int healing = this.level;
            target.receiveHealing(healing);
        }
    }

    private void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            this.isAlive = false;
        }
    }

    private void receiveHealing(int healing) {
        this.health += healing;
        if (this.health > 100) {
            this.health = 100;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isAlive() {
        return isAlive;
    }
}


