package kr.ac.hit.boot.board;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
class BoardServiceTest {
    @InjectMocks // @Mock으로 생성된 가짜 객체가 자동으로 주입된다.
    private BoardService service;

    @Mock       // 실제 mapper라는 객체가 아닌 가짜 객체를 생성해준다.
    private BoardMapper mapper;

    @Test
    void selectBoards() {
        // 실제 서비스를 호출했을 때의 비즈니스 로직과 관련된 내용으로 테스트
    }

    @Test
    void selectBoard() {
    }
}