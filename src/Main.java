public class Main {
    public static void main(String[] args) {

        int selectedDay = 1;
        int selectedLang = 1; // ENG = 1; RUS = 2; // Have to Enum class create

        System.out.println("--- Print Selected Day ---");
        System.out.println(DayOfWeek.getDayOfWeek2(selectedDay, selectedLang));

        System.out.println("\n--- Print All ---");
        printAllDays(selectedLang);
    }

    public static void printAllDays(int selectedLang) {
        int count = 1;
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            System.out.println(DayOfWeek.getDayOfWeek(count++, selectedLang));
        }
    }
}