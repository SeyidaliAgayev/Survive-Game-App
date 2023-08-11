package threads;

import model.Gamer;
import service.impl.GameServiceImpl;

import static helper.GameServiceHelper.decrementDrinkLevel;
import static helper.GameServiceHelper.decrementFoodLevel;

public class DecrementThread implements Runnable{
    private Gamer gamer;
    GameServiceImpl gameService;

    public DecrementThread(GameServiceImpl gameService, Gamer gamer) {
        this.gameService = gameService;
        this.gamer = gamer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                    decrementFoodLevel(gamer);
                    decrementDrinkLevel(gamer);

                    if (gamer.getHealthStatus() < 40 && gamer.getHealthStatus() > 1) {
                        System.err.println("ATTENTION! YOUR HEALTH LEVEL IS UNDER 40");
                    }
                    if (gamer.getHealthStatus() < 1) {
                        System.err.println("YOU DEAD!");
                        System.exit(-1);
                    }
            } catch (InterruptedException exception) {
                throw new RuntimeException(exception);
            }
        }
    }
}
