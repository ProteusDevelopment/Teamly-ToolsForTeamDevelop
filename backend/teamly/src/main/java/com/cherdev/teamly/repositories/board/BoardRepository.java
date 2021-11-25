package com.cherdev.teamly.repositories.board;

import com.cherdev.teamly.entities.boards.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>
{
}
