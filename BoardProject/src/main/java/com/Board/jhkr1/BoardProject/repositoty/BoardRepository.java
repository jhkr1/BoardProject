package com.Board.jhkr1.BoardProject.repositoty;

import com.Board.jhkr1.BoardProject.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//MySQL 기준 쿼리 update board_table set board_hits=board_hits+1 where id=?
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    //update, delete를 사용할 때 사용하는 어노테이션
    @Modifying
    //Entity 기준 쿼리
    @Query(value = "update BoardEntity b set b.boardHits=b.boardHits+1 where b.id=:id")
    void updateHits(@Param("id") Long id);

}
