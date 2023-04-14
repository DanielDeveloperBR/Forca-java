package com.forca.services;

import java.util.ArrayList;
import java.util.List;

import com.forca.model.GameData;

public class GameDataService {

    public List<GameData> selectWord() {
        List<GameData> listaGameData = new ArrayList<>();
        GameData word1 = new GameData("Casa", "lugar onde moramos");
        listaGameData.add(word1);
       GameData word2 = new GameData("Trabalho", "lugar onde ganho a vida");
        listaGameData.add(word2);
        GameData word3 = new GameData("Escola", "lugar onde estudo");
        listaGameData.add(word3); 

        return listaGameData;
    }
}
