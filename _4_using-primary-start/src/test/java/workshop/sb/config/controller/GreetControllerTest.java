package workshop.sb.config.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static workshop.sb.config.controller.service.GreetService.MSG;
import static workshop.sb.config.controller.service.impl.GreetServiceFirstImplementation.first;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnGreetMsg() throws Exception {
        this.mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string(MSG+first));
    }
}

// TODO 1 przed refaktoringiem uruchom test
// TODO 6 zaktualizuj test