package Proxy;

import java.util.Random;

class RobotBombDefuse {
    private Random random = new Random();
    private int robotConfiguredWaveLength = 41;
    private boolean isConnected = false;

    public final boolean IsConnectedImmitatingConnectivitiyIssueses() {
        return random.nextInt(10) < 4;
    }

    public final boolean IsConnected() {
        isConnected = IsConnectedImmitatingConnectivitiyIssueses();
        return isConnected;
    }

    public final void ConnectWirelles(int communicationWaveLength) {
        if(communicationWaveLength == robotConfiguredWaveLength)
            isConnected = IsConnectedImmitatingConnectivitiyIssueses();
        else
            System.out.println("Connected is failed...");
    }

    public void WalkStraightForward(int steps) {
        System.out.println("Did " + steps + " steps forward...");
    }

    public void TurnRight() {
        System.out.println("Turned right...");
    }

    public void TurnLeft() {
        System.out.println("Turned left...");
    }

    public void DefuseBomb() {
        System.out.println("Cut red or green or blue wire...");
    }
}
