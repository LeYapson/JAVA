package Exercice5;

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;

    private ArrayList<Folder> folders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public ArrayList<Folder> getFolders() {
        return folders;
    }

    public void setFolders(ArrayList<Folder> folders) {
        this.folders = folders;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }
    public void addFolder(Folder folder) {
        folders.add(folder);
    }
    public void removeFolder(Folder folder) {
        folders.remove(folder);
    }

    public int getFileSize() {
        int size = 0;
        for (File file : files) {
            size += file.getSize();
        }
        return size;
    }
    public int getFolderSize() {
        int folderSize = 0;
        for (Folder folder : folders) {
            folderSize += folder.getFileSize();
        }
        return folderSize + getFileSize();
    }
    public void folderDetails() {
        if (folders.size()==0) {
            System.out.println("il n'y a aucun dossier");
        } else {
            System.out.printf("Nom du dossier : %s. Nombre de dossier : %d. Taille totale des dossiers : %dMo. liste des dossiers : \n",getName(),getFolders().size(),getFolderSize());
            for (Folder folder : folders) {
                System.out.printf("nom du dossier : %s. nombre fichier présent :%d. Taille du dossier : %dMo. liste des fichiers : \n",folder.getName(),folder.getFiles().size(),folder.getFileSize());

            }

        }
    }

    public static void main(String[] args) {
        Folder testFolder = new Folder("testFolder");
        File test1 = new File("test1",TypeFile.EXE,750);
        File test2 = new File("test2",TypeFile.TXT,25);
        Folder testFolderfils = new Folder("testFolderfils");
        File testFiles1 = new File("testFiles1",TypeFile.EXE,12);
        File testFiles2 = new File("testFiles2",TypeFile.TXT,25);
        Folder contentFolder = new Folder("contentFolder");

        testFolder.addFile(test1);
        testFolder.addFile(test2);
        testFolderfils.addFile(testFiles1);
        testFolderfils.addFile(testFiles2);
        contentFolder.addFolder(testFolder);
        contentFolder.addFolder(testFolderfils);
        contentFolder.folderDetails();
    }
}
