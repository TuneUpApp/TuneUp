package com.example.cvtechies.tuneup;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import java.util.HashMap;


public class soundController {

    //setting up the private variables needed to create a soundPool for the string sounds
    //these are private because we don't want these to be changed. We always want the string sounds
    //to be in the same place. Changing the placement of the sound in the Map would interfere with
    //tuning the guitar properly
    private  SoundPool chordPool;
    private  AudioManager  chordManager;
    private  HashMap<Integer, Integer> chordMap;
    private  Context chordContext;
    boolean isPlaying = false;

    //public static final int maxSounds = 1;

    public soundController()
    {

    }

    public void soundState(Context theContext) {
        chordContext = theContext;
        chordPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        chordMap = new HashMap<Integer, Integer>();
        chordManager = (AudioManager)chordContext.getSystemService(Context.AUDIO_SERVICE);
    }

    //function is loading a specific sound file and putting it into the soundPool mapping
    public void addStringSound(int soundIndex,int IDnum)
    {
        chordMap.put(soundIndex, chordPool.load(chordContext, IDnum, 1));

    }
    //this function is accessing the correct index within the sound map to play the correct chord upon a button click
    //it sets a certain volume for both left and right and the -1 defines the function to always loop the sound
    //and the +1 will cut the sound whenever another button is clicked
    public void playString(int index) {

        int chordVolume = chordManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        chordPool.play(chordMap.get(index), chordVolume, chordVolume, 1, -1, 1f);

    }

    //Stops playing the sound of a certain string which is identified by its id number (index)
    public void stopStrings(int index){
        chordPool.stop(index);

    }


}
