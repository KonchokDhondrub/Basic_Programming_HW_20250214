public class Main {
    public static void main(String[] args) {

        int selectedDay = 1;
        int selectedLang = 1; // ENG = 1; RUS = 2;

        System.out.println("--- Print Selected Day ---");
        DayOfWeek.getDayOfWeek(selectedDay, selectedLang);

        System.out.println("\n--- Print All ---");
        printAllDays(selectedLang);
    }

    public static void printAllDays(int selectedLang) {
        int count = 1;
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            DayOfWeek.getDayOfWeek(count++, selectedLang);
        }
    }
}