package com.bf.soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author bofei
 * @date 2018/7/27 14:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class CDPlayerTest {

//    @Rule
//    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private CompactDisc cd;

//    @Autowired
//    private MediaPlayer player;



    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

//    @Test
//    public void play() {
//        player.play();
////        systemOutRule.getLog();
//    }
}