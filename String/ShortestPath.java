public class ShortestPath {
    public static int shortestpath(String direction) {
        int x = 0, y = 0;
        for (int i = 0; i < direction.length(); i++) {
            if (direction.charAt(i) == 'W') {
                x = x - 1;
            } else if (direction.charAt(i) == 'E') {
                x = x + 1;
            } else if (direction.charAt(i) == 'N') {
                y = y + 1;
            } else if (direction.charAt(i) == 'S') {
                y = y - 1;
            } else {
                System.out.println("Wrong direction detected at index: " + i);
            }
        }
        double path = Math.sqrt((x * x) + (y * y));
        return (int) path;
    }

    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        System.out.println(shortestpath(direction));
    }
}
