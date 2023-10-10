package kr.ac.hit.boot.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository repository;
    private final MemberMapper mapper;

    public List<MemberVO> selectMembers() {
        List<Member> members = repository.findAll();
        return mapper.toMemberVOs(members);
    }

    public MemberVO selectMember(String id) {
        Member member = repository.getReferenceById(id);
        return mapper.toMemberVO(member);
    }

    public void insertMember(MemberVO vo) {
        Member member = mapper.toMember(vo);
        repository.save(member);
    }

    public void updateMember(MemberVO vo) {
        Member member = mapper.toMember(vo);
        repository.save(member);
    }

    public void deleteMember(String id) {
        repository.deleteById(id);
    }

}
