package service.impl;

import helper.GameServiceHelper;
import helper.GameServiceHelper.*;
import model.Gamer;
import service.GameService;

import java.text.DecimalFormat;

import static helper.GameServiceHelper.*;

public class GameServiceImpl implements GameService {
    @Override
    public void eat(Gamer gamer) {
        incrementFoodLevel(gamer);
    }

    @Override
    public void drink(Gamer gamer) {
        incrementDrinkLevel(gamer);
    }

    @Override
    public void show(Gamer gamer) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("--------------------|" + gamer.getName() +"|--------------------" );
        System.out.println("Your Health Level is: " + decimalFormat.format(gamer.getHealthStatus()));
    }



}
