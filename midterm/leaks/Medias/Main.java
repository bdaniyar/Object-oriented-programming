package midterm.leaks.Medias;

import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Vector<Media> playlist = new Vector<>();

        playlist.add(new Song("Numb", "Linkin Park"));
        playlist.add(new Movie("Interstellar", 169));
        playlist.add(new Movie("mamd", 9));

        for(Media m: playlist){
            m.play();
            if(m instanceof Song){
                Song s = (Song) m;
                System.out.println("Artist: " + s.getArtist());
            }
        }
    }
}
