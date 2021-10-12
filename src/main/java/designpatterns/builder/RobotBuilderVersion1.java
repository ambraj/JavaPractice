package designpatterns.builder;

public class RobotBuilderVersion1 implements RobotBuilder {

    private final Robot robot;

    public RobotBuilderVersion1() {
        robot = new Robot();
    }

    @Override
    public void buildHead() {
    }

    @Override
    public void buildHands() {

    }

    @Override
    public void buildLegs() {

    }

    public Robot getRobot() {
        return this.robot;
    }

}
