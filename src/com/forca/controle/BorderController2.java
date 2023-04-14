package com.forca.controle;

import java.util.ArrayList;
import java.util.List;

import com.forca.model.Border;
import com.forca.model.GameData;
import com.forca.model.Player;
import com.forca.services.GameDataService;

public class BorderController2 {
    public Border border;
    public List<Character> usedLetters = new ArrayList<>(); // lista de letras já utilizadas
    public void startGame(Player player) {
        border = new Border();
        GameDataService gameDataService = new GameDataService();
        List<GameData> listGameData = gameDataService.selectWord();
        int numAleatorio = (int) (Math.random() * listGameData.size());
        border.setGameData(listGameData.get(numAleatorio));
        border.setPoint(0);
        border.setError(0);
        usedLetters.clear(); // limpa a lista de letras utilizadas
    }
    
    public void typeLetter(String letra) {
        String selectWord = border.getGameData().getWord();
        String secretWord = "";
        boolean letterFound = false; // variável para indicar se a letra foi encontrada
    
        for (int i = 0; i < selectWord.length(); i++) {
            char c = selectWord.charAt(i);
            if (usedLetters.contains(c)) {
                secretWord += c;
            } else if (c == letra.charAt(0)) {
                secretWord += c;
                letterFound = true;
            } else {
                secretWord += "_";
            }
        }
    
        if (!letterFound) {
            border.setError(border.getError() + 1);
        }
    
        usedLetters.add(letra.charAt(0)); // adiciona a letra utilizada à lista
    
        border.setSecretWord(secretWord);
    
        if (secretWord.equals(selectWord)) {
            border.setPoint(border.getPoint() + 1);
            startGame(null); // inicia um novo jogo
        }
    }
}    