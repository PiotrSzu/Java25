package singleton.exercise;

public class Main {
    public static void main(String[] args) {
//        LoggerLazy loggerLazy = LoggerLazy.getInstance();
//        LoggerLazy.log(LEVEL.INFO, "test lazy info");
        LoggerBillPugh loggerBillPugh = LoggerBillPugh.getInstance();
        LoggerBillPugh.log(LEVEL.INFO, "Test BillPugh");

    }
}
