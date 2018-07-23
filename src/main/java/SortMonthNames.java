import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

class SortMonthNames {

    static void sortMonthNames(List<String> strings) {
        Collections.sort(strings, new SortMonth());
    }
}

class SortMonth implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM", Locale.US);
        try {
            return simpleDateFormat.parse(o1).compareTo(simpleDateFormat.parse(o2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
