/*
COMP9417 Machine Learning
Major Project - Traffic Lights Reinforcement Learning
Beth Crane
Gill Morris
Nathan Wilson
 */

import interfaces.TrafficLight;
import utils.Coords;

//Contains implementation of methods in interfaces.TrafficLight
public class TrafficLightImpl implements TrafficLight {
    private final int maxDelay = 3;
    private Coords coords;
    private boolean horizontalGreen;
    private int delay;

    public TrafficLightImpl(Coords coords, boolean horizontalGreen) {
        this.coords = coords;
        this.horizontalGreen = horizontalGreen;
    }

    @Override
    public void switchLight() {
    	if (getDelay() == 0) {
    		horizontalGreen = !horizontalGreen;
    		delay = maxDelay;
    	}
    }

    public Coords getCoords() {
        return coords;
    }

    public int getDelay()  {
        return delay;
    }

    public void clock() {
        if (delay > 0) {
            delay--;
        }
    }

    @Override
    public boolean horizontalGreen() {
        return horizontalGreen;
    }
}
