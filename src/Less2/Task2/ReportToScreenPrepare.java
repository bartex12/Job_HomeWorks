package Less2.Task2;

import java.util.ArrayList;
import java.util.List;

public class ReportToScreenPrepare implements CalcItem {
    @Override
    public List<ReportItem> calculate() {
        List<ReportItem> items =  new ArrayList<>(); // Отчетные данные
        items.add(new ReportItem("FirstToScreen", (float)51));
        items.add(new ReportItem("SecondToScreen", (float)61));
        return items;
    }
}
