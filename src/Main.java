public class Main {
    public static void main(String[] args) {

        int selectedDay = 1;
        String selectedLang = "eng";

        System.out.println("--- Print Selected Day ---");
        DayOfWeek.getDayOfWeek(selectedDay, selectedLang);

        System.out.println("\n--- Print All ---");
        printAllDays(selectedLang);
    }

    public static void printAllDays(String selectedLang) {
        int count = 1;
        for (int i = 0; i < DayOfWeek.values().length; i++) {
            DayOfWeek.getDayOfWeek(count++, selectedLang);
        }
    }
}