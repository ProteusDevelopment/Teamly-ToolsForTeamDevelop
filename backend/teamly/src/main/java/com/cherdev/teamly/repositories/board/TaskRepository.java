package com.cherdev.teamly.repositories.board;

import com.cherdev.teamly.entities.boards.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>
{

}
