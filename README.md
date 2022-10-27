# RobotMovingInMarsExercise
Simulating a robot moving in Mars

## Input

1st argument: Mars plateau size, mars plateau is a grid defined by the initial input of the app, such as 5x5, 3x4, etc.

2nd argument: string containing multiple commands as described below:

  **L**: Turn the robot left
  
  **R**: Turn the robot right
  
  **F**: Move forward on it's facing direction
  
**Input example**: 5x5 FFRFLFLF
  
## Functionality

The robot's initial position will always be X: 1, Y: 1 facing NORTH. 

If the robot reaches the limits of the plateau the command must be ignored.

The goal is to navigate the robot and print the final position.

## Result
The robot will read the instructions and walk along the plateau, in the end the final position and direction is printed.

For the input '5x5 FFRFLFLF' the result should be '1,4,West'

## Things taken in account

There is no limit for the Plateau size

Inputs will always be valid, so there is no need to validate them

There is no 0,0 position

# To compile

You can use 'mvn clean install' to compile the application, which will also run all the JUnit tests.

# To run

In the 'target' folder there is a jar file called 'CodecCodingTest-1.0-SNAPSHOT', you can run this executable with this code:

  - java -jar CodecCodingTest-1.0-SNAPSHOT.jar <**grid_size**> <**list_of_commands**>





