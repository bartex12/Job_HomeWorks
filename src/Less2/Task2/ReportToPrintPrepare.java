package Less2.Task2;

import java.util.ArrayList;
import java.util.List;

public class ReportToPrintPrepare implements CalcItem {
    @Override
    public List<ReportItem> calculate() {
        List<ReportItem> items =  new ArrayList<>(); // Отчетные данные
        items.add(new ReportItem("FirstToPrint", (float)5));
        items.add(new ReportItem("SecondToPrint", (float)6));
        return items;
    }
}
