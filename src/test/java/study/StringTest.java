package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split을 써서 1과 2로 분리되는지 확인한다.")
    void test_contain() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    @DisplayName("1을 ,로 split했을 때, 1만 있다.")
    void test_contain_exactly() {
        String[] actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    @DisplayName("substring으로 괄호를 제거한다.")
    void test_substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("인덱스가 범위를 벗어나면 예외가 발생한다.")
    void test_index_exception() {
        String givenString = "abc";
        assertThatThrownBy(() -> {
            givenString.charAt(999);
        }).isInstanceOf(Exception.class);
    }
}
