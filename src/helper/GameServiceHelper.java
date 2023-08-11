package helper;

import model.Gamer;

public class GameServiceHelper {
    private static Gamer gamer;
    public static void incrementFoodLevel(Gamer gamer) {
        gamer.setHealthStatus(gamer.getHealthStatus() + gamer.getHealthStatus() * 0.08);
    }
    public static void incrementDrinkLevel(Gamer gamer) {
        gamer.setHealthStatus(gamer.getHealthStatus() + gamer.getHealthStatus() * 0.07);
    }
    public static synchronized void decrementFoodLevel(Gamer gamer) {
        gamer.setHealthStatus(gamer.getHealthStatus() - gamer.getHealthStatus() * 0.04);
    }
    public static synchronized void decrementDrinkLevel(Gamer gamer) {
        gamer.setHealthStatus(gamer.getHealthStatus() - gamer.getHealthStatus() * 0.04);
    }

}
