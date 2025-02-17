public enum DayOfWeek{
    MONDAY(1, "Понедельник", "Monday"){
        @Override public String printRus() { return MONDAY.nameRus; }
        @Override public String printEng() { return MONDAY.nameEng; }
    },
    TUESDAY(2, "Вторник", "Tuesday") {
        @Override public String printRus() { return TUESDAY.nameRus; }
        @Override public String printEng() { return TUESDAY.nameEng; }
    },
    WEDNESDAY(3, "Среда", "Wednesday") {
        @Override public String printRus() { return WEDNESDAY.nameRus; }
        @Override public String printEng() { return WEDNESDAY.nameEng; }
    },
    THURSDAY(4, "Четверг", "Thursday") {
        @Override public String printRus() { return THURSDAY.nameRus; }
        @Override public String printEng() { return THURSDAY.nameEng; }
    },
    FRIDAY(5, "Пятница", "Friday") {
        @Override public String printRus() { return FRIDAY.nameRus; }
        @Override public String printEng() { return FRIDAY.nameEng; }
    },
    SATURDAY(6, "Суббота", "Saturday") {
        @Override public String printRus() { return SATURDAY.nameRus; }
        @Override public String printEng() { return SATURDAY.nameEng; }
    },
    SUNDAY(7, "Воскресенье", "Sunday") {
        @Override public String printRus() { return SUNDAY.nameRus; }
        @Override public String printEng() { return SUNDAY.nameEng; }
    };

    private int dayNum;
    private String nameRus;
    private String nameEng;

    DayOfWeek (int dayNum, String nameRus, String nameEng){
        this.dayNum = dayNum;
        this.nameRus = nameRus;
        this.nameEng = nameEng;
    }
    public abstract String printRus();
    public abstract String printEng();

    public int getDayNum() {
        return dayNum;
    }
    public String getNameRus() {
        return nameRus;
    }
    public String getNameEng() {
        return nameEng;
    }

    String print(int selectedLang) {
        String message;
        switch (selectedLang){
            case 1 -> message = getNameEng();
            case 2 -> message = printRus();
            default -> message = "Error selected language not found";
        }
        return message;
    }
    static String printError(int selectedLang){
        String message;
        switch (selectedLang){
            case 1 -> message = "Error! Incorrect data input";
            case 2 -> message = "Ошибка! Неверный ввод данных";
            default -> message = "Error selected language not found";
        }
        return message;
    }

    static void getDayOfWeek(int selectedDay, int selectedLang) {
        String result;
            switch (selectedDay) {
                case 1 -> result = MONDAY.print(selectedLang);
                case 2 -> result = TUESDAY.print(selectedLang);
                case 3 -> result = WEDNESDAY.print(selectedLang);
                case 4 -> result = THURSDAY.print(selectedLang);
                case 5 -> result = FRIDAY.print(selectedLang);
                case 6 -> result = SATURDAY.print(selectedLang);
                case 7 -> result = SUNDAY.print(selectedLang);
                default -> result = DayOfWeek.printError(selectedLang);
            }
        System.out.println(result);
    }

    @Override
    public String toString() {
        return String.format("DayOfWeek [dayNum=%d, nameRus=%s, nameEng=%s]", dayNum, nameRus, nameEng);
    }
}
