package com.company;

import java.io.IOException;

/**
 * Created by student1 on 30.01.17.
 */
public class Game {
    public String result;
    Game() throws IOException {
        Situation situation_previous = new Situation(0);
        while (situation_previous.num!=16){
            situation_previous.num+=1;
            Situation situation_next = new Situation(situation_previous.num);
            System.out.println(situation_next.s);
            result = situation_next.s + " The game is over";
                  }
    }
}
