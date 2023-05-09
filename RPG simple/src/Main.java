public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        Mage mage = new Mage("Gandalf");
        Barbarian barbarian = new Barbarian("Conan");
        Thief thief = new Thief("Robin");
        Warrior warrior = new Warrior("Aragorn");

        game.addCharacter(mage);
        game.addCharacter(barbarian);
        game.addCharacter(thief);
        game.addCharacter(warrior);

        game.play();
    }
}