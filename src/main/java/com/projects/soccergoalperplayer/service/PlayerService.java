package com.projects.soccergoalperplayer.service;

import com.projects.soccergoalperplayer.entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();

    Player getPlayerByID(Long playerId);

    Player savePlayer(Player player);

    Player updatePlayer(Player player);

    void deletePlayerByID(Long playerId);


}
