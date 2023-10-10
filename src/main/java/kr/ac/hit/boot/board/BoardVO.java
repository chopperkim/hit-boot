package kr.ac.hit.boot.board;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardVO {
    private int no;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
