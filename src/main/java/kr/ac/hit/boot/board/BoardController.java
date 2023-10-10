package kr.ac.hit.boot.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service;

    @GetMapping("/board/list")
    public String selectBoards(Model model, SearchVO vo) {
        List<BoardVO> list = service.selectBoards(vo);
        model.addAttribute("boards", list);
        return "board/list";
    }

    @GetMapping("/board/{no}")
    public String selectBoard(Model model, @PathVariable int no) {
        BoardVO board = service.selectBoard(no);
        model.addAttribute("board", board);
        return "board/view";
    }

    @GetMapping("/board/insert")
    public String insertBoard(Model model) {
        // Spring Security에서 Post 방식으로 데이터를 전달할때 CSRF 공격에 대비하도록
        // 권한이 있는 사용자만 데이터를 전달할 수있도록 하고 있다.
        model.addAttribute("board", new BoardVO());
        return "board/insert";
    }

    @PostMapping("/board/insert")
    public String insertBoard(BoardVO vo) {
        service.insertBoard(vo);
        return "redirect:/board/list";
    }

    @PostMapping("/board/update")
    public String boardUpdate(BoardVO vo) {
        service.updateBoard(vo);
        return "redirect:/board/list";
    }

    @GetMapping("/board/delete")
    public String deleteBoard(@RequestParam int no) {
        service.deleteBoard(no);
        return "redirect:/board/list";
    }
}
