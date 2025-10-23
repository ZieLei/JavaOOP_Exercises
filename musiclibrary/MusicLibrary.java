package musiclibrary;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    
    private ArrayList<String> musicLibrary;
    private Random rand = new Random();

    public MusicLibrary(){
        musicLibrary = new ArrayList<>();
    }

    public void addMusic(String name){
        musicLibrary.add(name);
    }

    public void removeMusic(String name){
        musicLibrary.remove(name);
    }
    
    public String playRandomSong(){
        return musicLibrary.get(rand.nextInt(musicLibrary.size()));
    }
}
