package org.example;

public class MarsPlateau {

    final private int width;
    final private int height;

    public MarsPlateau(int width, int height) {

        this.width = width;
        this.height = height;

    }

    public boolean inBounds(Position position){

        if(position.getX() > width
                || position.getX() <= 0
                || position.getY() > height
                || position.getY() <= 0) {
            return false;
        }
        else {
            return true;
        }

    }

}
