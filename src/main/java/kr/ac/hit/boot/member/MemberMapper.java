package kr.ac.hit.boot.member;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper {
    List<MemberVO> toMemberVOs(List<Member> members);
    MemberVO toMemberVO(Member member);
    Member toMember(MemberVO vo);
}
