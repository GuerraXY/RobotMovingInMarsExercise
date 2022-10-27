package org.example;

public class Robot {

    private Position position;
    private Direction direction;

    public Robot(Position position, Direction direction){

        this.position = position;
        this.direction = direction;

    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void turnLeft() {

        switch (getDirection()) {
            case NORTH :
                setDirection(Direction.WEST);
                break;
            case SOUTH :
                setDirection(Direction.EAST);
                break;
            case EAST :
                setDirection(Direction.NORTH);
                break;
            case WEST :
                setDirection(Direction.SOUTH);
                break;
        }
    }

    public void turnRight() {

        switch (getDirection()) {
            case NORTH:
                setDirection(Direction.EAST);
                break;
            case SOUTH:
                setDirection(Direction.WEST);
                break;
            case EAST:
                setDirection(Direction.SOUTH);
                break;
            case WEST:
                setDirection(Direction.NORTH);
                break;
        }
    }

    public void moveFront(MarsPlateau marsPlateau) {

        Position newPosition;

        switch (direction) {
            case NORTH:
                newPosition = new Position(position.getX(), position.getY() + 1);
                break;
            case SOUTH:
                newPosition = new Position(position.getX(), position.getY() - 1);
                break;
            case EAST:
                newPosition = new Position(position.getX() + 1, position.getY());
                break;
            case WEST:
                newPosition = new Position(position.getX() - 1, position.getY());
                break;
            default:
                newPosition = position;
        }

        if (marsPlateau.inBounds(newPosition)) {
            setPosition(newPosition);
        }

    }

}
