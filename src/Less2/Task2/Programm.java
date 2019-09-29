package Less2.Task2;

class Programm{
	public static void main(String[] args){

		ReportOutput outputPrinter = new PrintReportOutput();
		outputPrinter.output((new ReportToPrintPrepare()).calculate());

		System.out.println("****************************************");

		ReportOutput outputScreen = new ScreenReportOutput();
		outputScreen.output((new ReportToScreenPrepare()).calculate());

		System.out.println("****************************************");

		ReportOutput outputFile = new FileReportOutput();
		outputFile.output((new ReportToFilePrepare()).calculate());
	}
}