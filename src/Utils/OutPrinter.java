package Utils;

import java.util.Locale;

public class OutPrinter {
    static void toDecFormat(String msg, double num){
        System.out.println(msg + " " + String.format(Locale.GERMANY,"%,.2f",num));
    }
}
