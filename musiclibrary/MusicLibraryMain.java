package musiclibrary;

public class MusicLibraryMain {
    public static void main(String[] args) {
        MusicLibrary spotify = new MusicLibrary();

        spotify.addMusic("Unang Sayaw");
        spotify.addMusic("Huling Sandali");
        spotify.addMusic("Baby Blue Eyes");

        System.out.println("Playing random song: " + spotify.playRandomSong());

        spotify.removeMusic("Unang Sayaw");
        
        System.out.println("Playing random song: " + spotify.playRandomSong());
    }

}
