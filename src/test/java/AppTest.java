import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("1 + 2 = 3")
    void t1(){
        App app = new App();
        int rst = app.plus(1, 2);

        // 테스트 코드 값이 3이여야 한다. 맞으면 Pass, 틀리면 Fail(다시 작성해야함)
        Assertions.assertThat(rst).isEqualTo(3);
    }

    @Test
    @DisplayName("10 + 20 = 30")
    void t2(){
        App app = new App();
        int rst = app.plus(10, 20);

        Assertions.assertThat(rst).isEqualTo(30);
    }
}

