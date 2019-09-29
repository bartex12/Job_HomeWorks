package Less2.Task2;

import java.util.List;

public class ScreenReportOutput implements ReportOutput {
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to screen");
        for (ReportItem item : items) {
            System.out.format("screen %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
