package workshop.sb.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
/*
    TODO 8 Dodaj niezbędne adnotacje
 */
public class GreetControllerTest {

    // TODO 9 wstrzykni MockMvc
    @Autowired
    private MockMvc mockMvc;

    // TODO 10 uzupełnij test
    @Test
    public void shouldReturnHelloWorld() throws Exception {
        this.mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello world")));
    }

    // TODO 11 poeksperymentuj z różnymi sposobami wstrzykiwania (prop., set., konstruktor) - uruchamiaj test po każdej zmianie

    // TODO 12 uruchom aplikację i przetestuj jej działanie w przeglądarce
}