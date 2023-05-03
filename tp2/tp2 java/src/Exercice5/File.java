package Exercice5;

public class File {
    private String name;
    private TypeFile typeFile;
    private int size;

    public File(String name, TypeFile typeFile, int size) {
        this.name = name;
        this.typeFile = typeFile;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeFile getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(TypeFile typeFile) {
        this.typeFile = typeFile;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void fileDetail() {
        System.out.printf("ce fichier a pour nom : %s. il a pour extension .%s et pèse %d Mo. \n",getName(),getTypeFile(),getSize());
    }

    public static void main(String[] args) {
        File newfile = new File("t_un_gros_bot",TypeFile.EXE,750);
        newfile.fileDetail();
    }
}
