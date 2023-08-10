package util;
import static util.InputUtil.*;

public class MenuUtil {
    public static int entryMenu() {
        System.out.println("""
                           [0]. Finish Program!
                           [1]. Eat!
                           [2]. Drink!
                           [3]. Show Health level
                           """);
        return requiredIntInput("Choose an option to play: ");
    }
}
