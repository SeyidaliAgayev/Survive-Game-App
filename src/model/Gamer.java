package model;

import java.text.DecimalFormat;

public class Gamer {
    private String name;
    private double healthStatus;

    public Gamer() {
        this.name = "Gamer";
        this.healthStatus = 100.00;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(double healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "name='" + name + '\'' +
                ", healthStatus=" + healthStatus +
                '}';
    }
}
