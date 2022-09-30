package com.example.sampjpa.board.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;    //PK

    private String title;
    private String contents;
    private String writeId;
    private String writeName;
    private LocalDateTime writeDate;
    private String modifyId;
    private String modifyName;
    private LocalDateTime  modifyDate;

    @Builder
    public Board(String title, String contents, String writeId, String writeName, LocalDateTime writeDate) {
        this.title = title;
        this.contents = contents;
        this.writeId = writeId;
        this.writeName = writeName;
        this.writeDate = writeDate;
    }

}
