package net.javaguides.springboot.dao;

import net.javaguides.springboot.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
