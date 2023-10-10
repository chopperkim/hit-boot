package kr.ac.hit.boot.board;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.domain.Page;

import java.util.List;
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BoardMapper {
    List<BoardVO> toBoardVOs(List<Board> boards);
    BoardVO toBoardVO(Board board);
    Board toBoard(BoardVO vo);
}
