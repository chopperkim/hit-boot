package kr.ac.hit.boot.board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(BoardController.class)
class BoardControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BoardService service;

    @Test
    @DisplayName("게시판 컨트롤러 테스트")
    @WithMockUser(username = "miso", password = "miso")
    void selectBoards() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/board/list")
                        .param("searchCondition", "t")
                        .param("searchKeyword", "등록"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        String content = mvcResult.getResponse().getContentAsString();
        Assertions.assertFalse(content.contains("수정"));
    }
}