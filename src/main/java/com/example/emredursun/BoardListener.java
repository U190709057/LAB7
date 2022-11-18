package com.example.emredursun;

public interface BoardListener {
    byte NO_ONE = 0;
    byte PLAYER_1 = 1;
    byte PLAYER_2 = 2;

    void playedAt(byte player, byte row, byte col);
    void gameEnded(byte winner);
    void invalidPLay(byte row, byte col);
}
