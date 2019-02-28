package com.simplegame.tddjava.game;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class GameSpec {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    private Game game;

    @Before
    public final void before(){
        game = new Game();
    }

    @Test
    public void whenNothingWasSelected(){
        exception.expect(RuntimeException.class);
        game.play('\0', '\0');
    }

    @Test
    public void whenSameSelectedThenNoWinner(){
        String actual = game.play('k','k');
        assertEquals("remis", actual);
    }

    @Test
    public void whenP1hasKAndP2hasNThenLose(){
        String actual = game.play('k','n');
        assertEquals("Wygral P1", actual);
    }

    @Test
    public void whenP1hasNAndP2hasPThenLose(){
        String actual = game.play('n','p');
        assertEquals("Wygral P1", actual);
    }

    @Test
    public void whenP1hasPAndP2hasKThenLose(){
        String actual = game.play('p','k');
        assertEquals("Wygral P1", actual);
    }

    @Test
    public void whenP1hasNAndP2hasKThenLose(){
        String actual = game.play('n','k');
        assertEquals("Wygral P2", actual);
    }

    @Test
    public void whenP1hasPAndP2hasNThenLose(){
        String actual = game.play('p','n');
        assertEquals("Wygral P2", actual);
    }

    @Test
    public void whenP1hasKAndP2hasPThenLose(){
        String actual = game.play('k','p');
        assertEquals("Wygral P2", actual);
    }

}
