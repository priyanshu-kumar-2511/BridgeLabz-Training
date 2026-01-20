package bagnball;

import java.util.*;

public class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls = new ArrayList<>();

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public boolean addBall(Ball ball) {
        if (balls.size() >= capacity) {
            return false; 
        }
        balls.add(ball);
        return true;
    }

    public boolean removeBall(String ballId) {
        return balls.removeIf(b -> b.getId().equals(ballId));
    }

    public void showBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag");
            return;
        }
        for (Ball b : balls) {
            System.out.println(b);
        }
    }

    public int getBallCount() {
        return balls.size();
    }
}
