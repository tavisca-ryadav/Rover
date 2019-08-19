import java.util.HashMap;

public class Vector {
    public final int x;
    public final int y;
    public final char direction;

    public Vector(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    private static HashMap<Character,Character> leftMap = new HashMap<Character, Character>(){{
        put('N','W');
        put('W','S');
        put('S','E');
        put('E','N');
    }};

    private static HashMap<Character,Character> rightMap = new HashMap<Character, Character>(){{
        put('N','E');
        put('W','N');
        put('S','W');
        put('E','S');
    }};




    public Vector turnLeft() {
        return new Vector(this.x,this.y,leftMap.get(this.direction));
    }

    public Vector turnRight() {
        return new Vector(this.x,this.y,rightMap.get(this.direction));
    }

    public Vector getNextVector() {
        int newX = x,newY = y;
        switch (direction){
            case 'N':
                newY++;
                break;
            case 'E':
                newX++;
                break;
            case 'S':
                newY--;
                break;
            case 'W':
                newX--;
                break;
        }
        return new Vector(newX,newY,direction);
    }
}
