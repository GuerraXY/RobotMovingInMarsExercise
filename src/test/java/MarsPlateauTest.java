import org.example.Direction;
import org.example.MarsPlateau;
import org.example.Position;
import org.example.Robot;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class MarsPlateauTest {

    Robot robot = new Robot(new Position(1, 1), Direction.NORTH);
    MarsPlateau marsPlateau = new MarsPlateau(10, 10);

    @Test
     void TestCheckingIfIsInBoundsWhenNotInBoundsShouldReturnFalse(){

        robot.setPosition(new Position(11, 3));

        assertFalse(marsPlateau.inBounds(robot.getPosition()));

    }

    @Test
    void TestCheckingIfIsInBoundsWhenInBoundsShouldReturnTrue(){

        robot.setPosition(new Position(5, 5));

        assertTrue(marsPlateau.inBounds(robot.getPosition()));

    }

}
