package soundsystem;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class CDPlayerTest {


    @Qualifier("getSgtPeppers")
    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Autowired
    private MediaPlayer player2;

    @Test
    public void cdShouldNotBeNull(){
        Assert.notNull(cd);
    }

    @Test
    public void play(){
        player.play();
    }

    @Test public void chagecd(){
        player.chnageCD();
        player.play();
        player2.play();
    }
}
