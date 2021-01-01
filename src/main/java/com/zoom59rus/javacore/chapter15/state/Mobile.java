package com.zoom59rus.javacore.chapter15.state;

import com.zoom59rus.javacore.chapter15.state.state.Contact;
import com.zoom59rus.javacore.chapter15.state.state.Lock;
import com.zoom59rus.javacore.chapter15.state.state.MediaPlayer;
import com.zoom59rus.javacore.chapter15.state.state.Sender;

public class Mobile {
    private State state;

    public Mobile(State initialState){
        this.state = initialState;
    }

    public void changeState(){
        if(state instanceof Lock){
            this.state = new Contact();
            state.execute();
        }else if (state instanceof Contact){
            this.state = new Sender();
            state.execute();
        }else if(state instanceof Sender){
            this.state = new MediaPlayer();
            state.execute();
        }else if (state instanceof MediaPlayer){
            this.state = new Lock();
            state.execute();
        }
    }
}