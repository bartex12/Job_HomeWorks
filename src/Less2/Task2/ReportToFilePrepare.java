package Less2.Task2;

import java.util.ArrayList;
import java.util.List;

public class ReportToFilePrepare implements CalcItem {
    @Override
    public List<ReportItem> calculate() {
        List<ReportItem> items =  new ArrayList<>(); // Отчетные данные
        items.add(new ReportItem("FirstToFile", (float)501));
        items.add(new ReportItem("SecondToFile", (float)601));
        return items;
    }
}
