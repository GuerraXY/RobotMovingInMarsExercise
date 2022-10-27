import org.example.Direction;
import org.example.MarsPlateau;
import org.example.Position;
import org.example.Robot;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    Robot robot = new Robot(new Position(1, 1), Direction.NORTH);
    MarsPlateau marsPlateau = new MarsPlateau(10, 10);

    @Test
    void TestTurningLeftWhenFacingNorthShouldResultInFacingWest(){

        robot.setDirection(Direction.NORTH);
        robot.turnLeft();

        assertEquals(Direction.WEST, robot.getDirection());

    }

    @Test
    void TestTurningLeftWhenFacingSouthShouldResultInFacingEast(){

        robot.setDirection(Direction.SOUTH);
        robot.turnLeft();

        assertEquals(Direction.EAST, robot.getDirection());

    }

    @Test
    void TestTurningRightWhenFacingEastShouldResultInFacingSouth(){

        robot.setDirection(Direction.EAST);
        robot.turnRight();

        assertEquals(Direction.SOUTH, robot.getDirection());

    }

    @Test
    void TestTurningRightWhenFacingWestShouldResultInFacingNorth(){

        robot.setDirection(Direction.WEST);
        robot.turnRight();

        assertEquals(Direction.NORTH, robot.getDirection());

    }

    @Test
    void TestMovingForwardWhenFacingNorthShouldIncreaseYby1(){

        robot.setDirection(Direction.NORTH);
        Position expectedPosition = new Position(robot.getPosition().getX(), robot.getPosition().getY() + 1);

        robot.moveFront(marsPlateau);

        assertEquals(expectedPosition.getY(), robot.getPosition().getY());

    }

    @Test
    void TestMovingForwardWhenFacingEastShouldIncreaseXby1(){

        robot.setDirection(Direction.EAST);
        Position expectedPosition = new Position(robot.getPosition().getX() + 1, robot.getPosition().getY());

        robot.moveFront(marsPlateau);

        assertEquals(expectedPosition.getX(), robot.getPosition().getX());

    }

}
