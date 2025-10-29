package session7.B_TDD;

public class Player {
    String name;
    int wonMatches=0;
    int lostMatches = 0;

    public Player(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public int wonMatches() {
        return this.wonMatches;
    }

    public int lostMatches() {
        return this.lostMatches;
    }

    public void hasWonAMatch() {
        this.wonMatches+=1;
    }
}
