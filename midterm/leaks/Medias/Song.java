package midterm.leaks.Medias;

public class Song extends Media{
    private String artist;
    
    public Song(String title, String artist){
        super(title);
        this.artist = artist;
    }

    @Override
    public void play(){
        System.out.println("Playing song: " + title);
    }

    public String getArtist(){
        return artist;
    }
}
