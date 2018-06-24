import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class SortMonthNamesTest {

    @Test
    void givenMonthNamesSortThemInCalendarOrder() {
        List<String> inputMonths = new ArrayList<>();
        List<String> expectedOutput = new ArrayList<>();

        inputMonths.add("MARCH");
        inputMonths.add("FEBRUARY");
        inputMonths.add("JANUARY");
        inputMonths.add("DECEMBER");
        inputMonths.add("AUGUST");
        inputMonths.add("JULY");
        expectedOutput.add("JANUARY");
        expectedOutput.add("FEBRUARY");
        expectedOutput.add("MARCH");
        expectedOutput.add("JULY");
        expectedOutput.add("AUGUST");
        expectedOutput.add("DECEMBER");

        SortMonthNames.sortMonthNames(inputMonths);

        assertLinesMatch(expectedOutput, inputMonths);
    }
}