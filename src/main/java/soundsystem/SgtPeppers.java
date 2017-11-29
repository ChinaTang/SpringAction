package soundsystem;

import org.springframework.stereotype.Component;

public class SgtPeppers implements CompactDisc {
    private String title = "this is SgtCD";

    private String artist = "the Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    @Override
    public void change() {
        title = "this is changeCD";
        artist = "this is CHANGE CD";
    }


}
