package org.example;

public class Main {

    public static void main(String[] args) {

        String commands = args[1];

        Robot robot = new Robot(new Position(1, 1), Direction.NORTH);

        int height = Integer.parseInt(args[0].split("x")[0]);
        int width = Integer.parseInt(args[0].split("x")[1]);
        MarsPlateau marsPlateau = new MarsPlateau(height, width);

        for(int i = 0; i != commands.length(); i++) {

            char command = commands.charAt(i);

            switch(command) {
                case 'L':
                    robot.turnLeft();
                    break;
                case 'R':
                    robot.turnRight();
                    break;
                case 'F':
                    robot.moveFront(marsPlateau);
                    break;
            }

        }


        System.out.println(robot.getPosition().getX() + ","
                        + robot.getPosition().getY() + ","
                        + robot.getDirection().toString().charAt(0)
                        + robot.getDirection().toString().toLowerCase().substring(1));

    }


}