package com.bf.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author bofei
 * @date 2018/7/27 14:56
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hears Club Band";
    private String artist = "The Beatles";



    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
