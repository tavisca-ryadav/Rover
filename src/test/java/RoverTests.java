import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RoverTests {

    @Test
   public void vectorInitializesWithGivenPoints(){
        Vector r = new Vector(10,10,'N');
        assertEquals(r.x,10);
        assertEquals(r.y,10);
        assertEquals(r.direction,'N');
    }

    @Test
    public void vectorCanRotateLeftFromNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.turnLeft();
        assertEquals('W',newVector.direction);
    }

    @Test
    public void vectorCanRotateLeftFromWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.turnLeft();
        assertEquals('S',newVector.direction);
    }

    @Test
    public void vectorCanRotateLeftFromSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.turnLeft();
        assertEquals('E',newVector.direction);
    }

    @Test
    public void vectorCanRotateLeftFromEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.turnLeft();
        assertEquals('N',newVector.direction);
    }

    @Test
    public void vectorCanRotateRightFromNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.turnRight();
        assertEquals('E',newVector.direction);
    }

    @Test
    public void vectorCanRotateRightFromWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.turnRight();
        assertEquals('N',newVector.direction);
    }

    @Test
    public void vectorCanRotateRightFromSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.turnRight();
        assertEquals('W',newVector.direction);
    }

    @Test
   public void vectorCanRotateRightFromEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.turnRight();
        assertEquals('S',newVector.direction);
    }

    @Test
    public void nextVectorInNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.getNextVector();
        assertEquals(11,newVector.y);
        assertEquals(10,newVector.x);
    }

    @Test
    public void nextVectorInWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.getNextVector();
        assertEquals(9,newVector.x);
        assertEquals(10,newVector.y);
    }

    @Test
    public void nextVectorInSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.getNextVector();
        assertEquals(9,newVector.y);
        assertEquals(10,newVector.x);
    }

    @Test
    public void nextVectorInEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.getNextVector();
        assertEquals(11,newVector.x);
        assertEquals(10,newVector.y);
    }

    @Test
    public void vectorMoveAndRotate(){
        Vector newVector = new Vector(10,10,'S');
        newVector.turnLeft();
        newVector.getNextVector();
        newVector.getNextVector();
        newVector.turnLeft();
        newVector.getNextVector();
        assertEquals(11,10,'N');

    }



}
