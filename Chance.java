package me.moob.hardersurvival;

import java.util.ArrayList;
import java.util.Random;

//a class that represents a chance and gives a true/false accordingly

public class Chance {
    int num1, num2;
    Chance(int num1, int num2){//gets a chance, numb1/num2
        this.num1 = num1;
        this.num2 = num2;
    }
    public boolean getChance(){
        Random random = new Random();
        ArrayList<Boolean> list_of_chances = new ArrayList<>();
        for (int x = 0; x<=num1; x++){
            list_of_chances.add(true);
        }
        for (int x = 0; x<=num2-num1; x++){
            list_of_chances.add(false);
        }
        return list_of_chances.get(random.nextInt(list_of_chances.size()));
    }
}
