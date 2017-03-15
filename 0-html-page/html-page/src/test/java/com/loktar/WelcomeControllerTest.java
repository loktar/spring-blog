package com.loktar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class WelcomeControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void welcome_shouldBeSuccessful() throws Exception {
        mvc.perform(get("/welcome").accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk());
    }
}