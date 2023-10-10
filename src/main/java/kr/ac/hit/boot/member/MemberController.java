package kr.ac.hit.boot.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService service;

    @GetMapping("/member/list")
    public String selectMembers(Model model) {
        List<MemberVO> members = service.selectMembers();
        model.addAttribute("members", members);
        return "member/list";
    }

    @GetMapping("/member/{id}")
    public String selectMember(@PathVariable String id, Model model) {
        MemberVO member = service.selectMember(id);
        model.addAttribute("member", member);
        return "member/view";
    }

    @GetMapping("/member/insert")
    public String insertMember(Model model) {
        model.addAttribute("member", new MemberVO());
        return "member/insert";
    }
    @PostMapping("/member/insert")
    public String insertMember(MemberVO vo) {
        service.insertMember(vo);
        return "redirect:/member/list";
    }
    @PostMapping("/member/update")
    public String updateMember(MemberVO vo) {
        service.updateMember(vo);
        return "redirect:/member/list";
    }
    @GetMapping("/member/delete")
    public String insertMember(@RequestParam String id) {
        service.deleteMember(id);
        return "redirect:/member/list";
    }
}
