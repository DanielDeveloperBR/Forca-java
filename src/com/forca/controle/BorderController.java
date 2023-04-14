/* package com.forca.controle;

import java.util.List;

import com.forca.model.Border;
import com.forca.model.GameData;
import com.forca.model.Player;
import com.forca.services.GameDataService;

public class BorderController {
    Border border;

    public void startGame(Player player) {

        border = new Border();

        GameDataService gameDataService = new GameDataService();
        List<GameData> listGameData = gameDataService.selectWord();
        int numAleatorio = (int) (Math.random() * listGameData.size());
        border.setGameData(listGameData.get(numAleatorio));

        border.setPoint(0);
        border.setError(0);
    }

    public void typeLetter(String letter) {
        String selectWord = border.getGameData().getWord();
        String secretWord = "";
        int positionLetter = selectWord.indexOf(letter);
        for (String i = ""; i < array.length; i++) {
            
        }

    }
}
 */