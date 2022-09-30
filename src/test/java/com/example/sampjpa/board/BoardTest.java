package com.example.sampjpa.board;

import com.example.sampjpa.board.entity.Board;
import com.example.sampjpa.board.entity.BoardRepository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
public class BoardTest {

    @Autowired
    BoardRepository boardRepository;

    @Test
    void save() {

        // 1. 게시글 파라미터 생성
        Board params = Board.builder()
                .title("1번 게시글 제목")
                .contents("1번 게시글 내용")
                .writeId("user1")
                .writeName("길동이")
                .writeDate(LocalDateTime.now())
                .build();

        // 2. 게시글 저장
        boardRepository.save(params);

        // 3. 1번 게시글 정보 조회
        Board entity = boardRepository.findById((long) 19).get();
        assertThat(entity.getTitle()).isEqualTo("1번 게시글 제목");
        assertThat(entity.getContents()).isEqualTo("1번 게시글 내용");
        assertThat(entity.getWriteName()).isEqualTo("길동이");

    }

    @Test
    void findAll() {

        // 1. 전체 게시글 수 조회
        long boardsCount = boardRepository.count();

        // 2. 전체 게시글 리스트 조회
        List<Board> boards = boardRepository.findAll();
    }

    @Test
    void delete() {

        // 1. 게시글 조회
        Board entity = boardRepository.findById((long) 1).get();

        // 2. 게시글 삭제
        boardRepository.delete(entity);
    }

}
