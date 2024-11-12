package T20;


public class XyCordinates {
    public static void main(String[] args) {
        System.out.println(getFinalCoordinates("UUU")); // (0, 3)
        System.out.println(getFinalCoordinates("URRDDL")); // (1, -1)
        System.out.println(getFinalCoordinates("DOWN UP 2xRIGHT DOWN 3xLEFT")); // (-1, -1)
    }

    public static int[] getFinalCoordinates(String directions) {
        int x = 0, y = 0;
        String[] steps = directions.split(" ");

        for (String step : steps) {
            if (step.equals("U")) {
                y++;
            } else if (step.equals("D")) {
                y--;
            } else if (step.equals("L")) {
                x--;
            } else if (step.equals("R")) {
                x++;
            } else if (step.contains("x")) {
                String[] parts = step.split("x");
                int count = Integer.parseInt(parts[0]);
                String direction = parts[1];
                for (int i = 0; i < count; i++) {
                    if (direction.equals("UP")) {
                        y++;
                    } else if (direction.equals("DOWN")) {
                        y--;
                    } else if (direction.equals("LEFT")) {
                        x--;
                    } else if (direction.equals("RIGHT")) {
                        x++;
                    }
                }
            }
        }

        return new int[]{x, y};
    }
}
