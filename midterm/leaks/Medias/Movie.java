package midterm.leaks.Medias;

public class Movie extends Media{
    private int duration;

    public Movie(String title, int duration){
        super(title);
        this.duration = duration;
    }

    @Override
    public void play(){
        System.out.println("Playing Movie: " + title);
    }

    public int getDuration(){
        return duration;
    }
}
