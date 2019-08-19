public class PositionParser {
    public static Vector parsePosition(String initialPosition) {
        String[] split = initialPosition.split(" ");
        return new Vector(Integer.parseInt(split[0]),Integer.parseInt(split[1]),split[2].charAt(0));
    }
}