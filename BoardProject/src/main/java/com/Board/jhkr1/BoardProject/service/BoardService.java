package com.Board.jhkr1.BoardProject.service;

import com.Board.jhkr1.BoardProject.dto.BoardDTO;
import com.Board.jhkr1.BoardProject.entity.BaseEntity;
import com.Board.jhkr1.BoardProject.entity.BoardEntity;
import com.Board.jhkr1.BoardProject.repositoty.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// DTO -> Entity (Entity Class)
// Entity -> DTO (DTO Class)
// Entity 클래스는 DB와 직접 연결
@Service
@RequiredArgsConstructor // 생성자 주입
public class BoardService {
    private final BoardRepository boardRepository;
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BaseEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
