package kr.ac.hit.boot.board;

import lombok.Data;

@Data
public class SearchVO {
    /**
     * 검색조건
     * 제목(t)
     * 내용(c)
     * 제목 + 내용(tc)
     */
    private String searchCondition;
    // 검색어
    private String searchKeyword;

    // 만약 페이징 처리가 되어 있을 경우에 필요한 필드(field)
    // 현재 요청 페이지 번호
    private int requestPageNo;

    // 게시판 페이지 갯수
    private int pageUnit;

    // 페이지 사이즈
    private int pageSize;

}
