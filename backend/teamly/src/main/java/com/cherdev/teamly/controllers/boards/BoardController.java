package com.cherdev.teamly.controllers.boards;

import com.cherdev.teamly.entities.boards.Board;
import com.cherdev.teamly.entities.boards.Stage;
import com.cherdev.teamly.properties.mappings.BoardsMappings;
import com.cherdev.teamly.repositories.board.BoardRepository;
import com.cherdev.teamly.repositories.board.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(BoardsMappings.BOARDS)
public class BoardController
{
    @Autowired private BoardRepository boardRepository;

    @GetMapping
    public List<Board> allBoards()
    {
        return boardRepository.findAll();
    }

    @GetMapping(BoardsMappings.BY_ID_KEY)
    public Board board(@PathVariable long id)
    {
        return boardRepository.findById(id).get();
    }

    @PostMapping(BoardsMappings.NEW)
    public ResponseEntity<String> newBoard(@RequestParam String name,
                                           @RequestParam(required = false, defaultValue = "") String description)
    {
        Board newBoard = new Board(name, description);

        boardRepository.saveAndFlush(newBoard);

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
