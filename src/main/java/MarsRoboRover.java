import java.util.Scanner;

public class MarsRoboRover{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String coordinates="5 5",initialPosition = "0 0 N",command="LLLL";
        if(sc.hasNextLine())
            coordinates = sc.nextLine();
        if(sc.hasNextLine())
            initialPosition = sc.nextLine();
        if(sc.hasNextLine())
            command = sc.nextLine();
        Vector newVector = PositionParser.parsePosition(initialPosition);

        for(int i=0;i<command.length();i++){
            switch(command.charAt(i)) {
                case 'L':
                    newVector = newVector.turnLeft();
                    break;
                case 'R':
                    newVector = newVector.turnRight();
                    break;
                case 'M':
                    newVector = newVector.getNextVector();
                    break;
            }
        }

        System.out.println(newVector.x+" "+newVector.y+" "+newVector.direction);

    }
}