package helper;

import model.Gamer;

public class GameServiceHelper {
    private static Gamer gamer;
    public static void incrementFoodLevel(Gamer gamer) {
        gamer.setHealthStatus(gamer.getHealthStatus() + gamer.getHealthStatus() * 0.05);
    }
    public static void incrementDrinkLevel(Gamer gamer) {
        gamer.setHealthStatus(gamer.getHealthStatus() + gamer.getHealthStatus() * 0.03);
    }
    public static synchronized void decrementFoodLevel(Gamer gamer) {
        gamer.setHealthStatus(gamer.getHealthStatus() - gamer.getHealthStatus() * 0.02);
    }
    public static synchronized void decrementDrinkLevel(Gamer gamer) {
        gamer.setHealthStatus(gamer.getHealthStatus() - gamer.getHealthStatus() * 0.02);
    }

}
