package session7.B_TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *  Badminton Player:
 *
 *  - Write a class to represent a badminton player.
 *
 *  - A player has a name and a number of won and lost matches.
 *
 *  Exercise (using TDD):
 *  - Add a method "void wonMatch()" to the player class to signal s/he has won a match.
 *  - Add a method "void lostMatch()" to the player class to signal s/he has lost a match.
 */
public class TestPlayer {

    @Test
    void createPlayer(){
        //Create a Player object.
        Player player = new Player("Anders Madsen");
        assertNotNull(player);
    }

    @Test
    void testPlayerName(){
        Player player = new Player("Anders Madsen");
        String name = player.getName();
        assertEquals("Anders Madsen", name);
    }

    @Test
    void testWonMatches(){
        Player player = new Player("Anders Madsen");
        int wonMatches = player.wonMatches();
        assertEquals(0,wonMatches);

    }

    @Test
    void testLostMatches(){
        Player player = new Player("Anders Madsen");
        int lostMatches = player.lostMatches();
        assertEquals(0,lostMatches);
    }

    @Test
    void testNewWonMatch(){
        Player player = new Player("Anders Madsen");

        player.hasWonAMatch();

        int wonMatches = player.wonMatches();
        assertEquals(1,wonMatches);

    }





    /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
    /*
    @Test
    public void feedback() {
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session8_B", I_did_finish, I_did_understand, comment);
        }
     */
}
