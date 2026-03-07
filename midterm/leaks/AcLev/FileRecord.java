package midterm.leaks.AcLev;

public class FileRecord {
    private String name;
    private long size;
    private AccessLevel accessLevel;

    public FileRecord(String name, long size, AccessLevel accessLevel){
        this.name = name;
        this.size = size;
        this.accessLevel = accessLevel;
    }

     public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public AccessLevel getLevel() {
        return accessLevel;
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof FileRecord)) return false;
        FileRecord frl = (FileRecord) o;
        return name.equals(frl.name);
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
    
}
