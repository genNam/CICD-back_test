package web.mvc.cicd02_boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Cicd02BootApplicationTests {

    @Test
    void contextLoads() {
        //무조건 실패 처리
        throw new RuntimeException("Fail");
    }

}
