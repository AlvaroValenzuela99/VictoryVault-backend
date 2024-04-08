package net.javaguides.springboot.dao;

import net.javaguides.springboot.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
