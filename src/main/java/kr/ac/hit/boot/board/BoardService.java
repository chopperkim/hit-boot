package kr.ac.hit.boot.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository repository;
    private final BoardMapper mapper;

    public List<BoardVO> selectBoards(SearchVO vo) {
        List<Board> boards = repository.findAll();
        return mapper.toBoardVOs(boards);
    }
    public BoardVO selectBoard(int no) {
        Board board = repository.getReferenceById(no);
//        Board board = repository.findById(no).orElseThrow();
        return mapper.toBoardVO(board);
    }

    public void insertBoard(BoardVO vo) {
        Board board = mapper.toBoard(vo);
        // 저장을 할 때: persist()를 사용해서 새로운 데이터를 저장한다.
        repository.save(board);
    }
    public void updateBoard(BoardVO vo) {
        Board board = mapper.toBoard(vo);
        // 수정할 때 : merge()를 사용해서 변경된 데이터만 저장한다.
        repository.save(board);
    }
    public void deleteBoard(int no) {
        repository.deleteById(no);
    }
}
