import com.epam.utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void isPositiveNumberTest_1() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("0.000001"));
    }
}