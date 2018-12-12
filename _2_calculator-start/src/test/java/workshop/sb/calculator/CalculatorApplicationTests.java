package workshop.sb.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static junit.framework.TestCase.fail;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
// TODO 1 dodaj adnotację @WebMvcTest (kontroler nie ma wstrzykiwanych żadnych zależności)
@WebMvcTest
public class CalculatorApplicationTests {

    // TODO 2 wstrzyknij MockMvc
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldSum() throws Exception {
        this.mockMvc.perform(get("/add/2/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("4.0")));
    }

    @Test
    public void shouldSubstract() throws Exception {
        this.mockMvc.perform(get("/sub/3/1"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("2.0")));
    }

    @Test
    public void shouldMultiply() throws Exception {
        this.mockMvc.perform(get("/mul?n1=1&n2=3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("3.0")));
    }

    @Test
    public void shouldDivide() throws Exception {
        this.mockMvc.perform(get("/div?n1=9&n2=3"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("3.0")));
    }
}
