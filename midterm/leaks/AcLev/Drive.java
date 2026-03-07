package midterm.leaks.AcLev;

import java.util.HashSet;

public class Drive {
    private String ownerName;
    private HashSet<FileRecord> files;
    public Drive(String ownerName){
        this.ownerName = ownerName;
        files = new HashSet<>();
    }

    public void addFile(FileRecord file){
        files.add(file);
    }

    public void printFiles(){
        System.out.println("Drive owner: " + ownerName);

        for(FileRecord f: files){
            System.out.println(f);
        }
    }
}
