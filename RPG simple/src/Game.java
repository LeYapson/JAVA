import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Character> characters;

    public Game() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        this.characters.add(character);
    }

    public void play() {
        // Ajoutez ici votre logique de jeu et vos commentaires
    }
}
