package Proxy;

public class RobotBombDefuserProxy extends RobotBombDefuse {
    private RobotBombDefuse robotBombDefuse;
    private int communicationWaveLenght;
    private int connectionAttempts = 3;

    public RobotBombDefuserProxy(int communicationWaveLenght) {
        robotBombDefuse = new RobotBombDefuse();
        this.communicationWaveLenght = communicationWaveLenght;
    }

    private void EnsureConnectedWithRobot() throws Exception{
        if(robotBombDefuse == null) {
            robotBombDefuse = new RobotBombDefuse();
            robotBombDefuse.ConnectWirelles(communicationWaveLenght);
        }
        for(int i = 0; i < connectionAttempts; i++) {
            if(robotBombDefuse.IsConnected() != true)
                robotBombDefuse.ConnectWirelles(communicationWaveLenght);
            else
                break;
        }
        if(robotBombDefuse.IsConnected() != true)
            throw new Exception("No connection with remote bomb " +
                    "diffuser robot could be made after few attempts");
    }

    @Override
    public void WalkStraightForward(int steps) {
        try {
            EnsureConnectedWithRobot();
            robotBombDefuse.WalkStraightForward(steps);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void TurnLeft() {
        try {
            EnsureConnectedWithRobot();
            robotBombDefuse.TurnLeft();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void TurnRight() {
        try {
            EnsureConnectedWithRobot();
            robotBombDefuse.TurnRight();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void DefuseBomb() {
        try {
            EnsureConnectedWithRobot();
            robotBombDefuse.DefuseBomb();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
