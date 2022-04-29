package com.projects.soccergoalperplayer.repository;

import com.projects.soccergoalperplayer.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {

}
