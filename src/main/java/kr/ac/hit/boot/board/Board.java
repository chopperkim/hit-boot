package kr.ac.hit.boot.board;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;
    private String title;
    private String content;
    private String writer;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createDate;
    @UpdateTimestamp
    @Column(insertable = false)
    private LocalDateTime modifyDate;
}
