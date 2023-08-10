package service.impl;

import model.Gamer;
import service.GameServiceManagement;
import threads.DecrementThread;

import static util.MenuUtil.*;

public class GameServiceManagementImpl implements GameServiceManagement {
    Gamer gamer = new Gamer();
    GameServiceImpl gameService = new GameServiceImpl();
    @Override
    public void gameManagement() {
        DecrementThread decrementThread = new DecrementThread(gameService,gamer);
        Thread thread = new Thread(decrementThread);
        thread.start();
        while (true) {

            int option = entryMenu();
            switch (option) {
                case 0:
                    System.exit(-1);
                case 1:
                    gameService.eat(gamer);
                    break;
                case 2:
                    gameService.drink(gamer);
                    break;
                case 3:
                    gameService.show(gamer);
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}
