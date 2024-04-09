package net.javaguides.springboot.dao;

import net.javaguides.springboot.entity.GameResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameResultRepository extends JpaRepository<GameResult, Long> {
}
