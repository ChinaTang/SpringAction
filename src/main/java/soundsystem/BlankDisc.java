package soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {

    private String title;

    private String artist;

    private List<String> tracks;

    @Override
    public void play() {
        System.out.println("playing " + title + " by " + artist);
        for(String track : tracks){
            System.out.println("-Track: " + track);
        }
    }

    @Override
    public void change() {

    }

    public BlankDisc(String title, String artist, List<String> tracks){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }
}
