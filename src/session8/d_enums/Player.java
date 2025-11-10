package session8.d_enums;

public class Player{

    String name;
    String colour;

    public Player(String name, String color) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", color='" + colour + '\'' +
                '}';
    }

}
