package com.projects.soccergoalperplayer.service;

import com.projects.soccergoalperplayer.entity.Player;
import com.projects.soccergoalperplayer.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {
    private PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        super();
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getAllPlayers() {
       Comparator<Player> goalComprator = Comparator.comparing(Player::getFifaRecognizedGoals).reversed();
       List<Player> sortedPlayers = playerRepository.findAll()
               .stream()
               .sorted(goalComprator)
               .toList();

       return sortedPlayers;
    }

    @Override
    public Player getPlayerByID(Long playerId) {
        return playerRepository.getById(playerId);
    }

    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);

    }

    @Override
    public Player updatePlayer(Player player) {
        return playerRepository.save(player);

    }

    @Override
    public void deletePlayerByID(Long playerId) {
        playerRepository.deleteById(playerId);
    }
}
