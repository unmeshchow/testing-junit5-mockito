package guru.springframework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

/**
 * Created by uc on 9/11/2019
 */
@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {

    @Mock
    private Map<String, Object> map;

    @Test
    void testMock() {
        map.put("key", "value");
    }
}
