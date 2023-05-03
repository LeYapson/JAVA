package Exercice4;

public class Animal {
    private Espece espece;
    private Diet diet;
    private String origine;

    public Animal(Espece espece, Diet diet, String origine) {
        this.espece = espece;
        this.diet = diet;
        this.origine = origine;
    }

    public Espece getEspece() {
        return espece;
    }

    public void setEspece(Espece espece) {
        this.espece = espece;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return String.format("The Edgard is an animal for the species of %s who got an %s alimentation. This species comme from the %s.",getEspece(),getDiet(),getOrigine());
    }

    public static void main(String[] args) {
        Animal nAnimal = new Animal(Espece.MAMMALS,Diet.OMNIVORES,"Middle Age");
        System.out.println(nAnimal);
    }
}
