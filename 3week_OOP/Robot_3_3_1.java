public static void moveRobot(Robot robot, int toX, int toY) {

    if (toX - robot.getX() >= 0) {
        while (robot.getDirection() != Direction.RIGHT) {
            robot.turnRight();
        }
    }
    else {
        while (robot.getDirection() != Direction.LEFT) {
            robot.turnLeft();
        }
    }

    while (toX != robot.getX()) {
        robot.stepForward();
    }


    if (toY - robot.getY() >= 0) {
        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
    }
    else {
        while (robot.getDirection() != Direction.DOWN) {
            robot.turnLeft();
        }
    }

    while (toY != robot.getY()) {
        robot.stepForward();
    }
}
