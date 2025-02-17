public enum DayOfWeek{
    MONDAY(1, "Monday", "Понедельник"){
        @Override public String printEng() { return MONDAY.nameEng; }
        @Override public String printRus() { return MONDAY.nameRus; }
    },
    TUESDAY(2, "Tuesday", "Вторник") {
        @Override public String printEng() { return TUESDAY.nameEng; }
        @Override public String printRus() { return TUESDAY.nameRus; }
    },
    WEDNESDAY(3, "Wednesday", "Среда") {
        @Override public String printEng() { return WEDNESDAY.nameEng; }
        @Override public String printRus() { return WEDNESDAY.nameRus; }
    },
    THURSDAY(4, "Thursday", "Четверг") {
        @Override public String printEng() { return THURSDAY.nameEng; }
        @Override public String printRus() { return THURSDAY.nameRus; }
    },
    FRIDAY(5, "Friday", "Пятница") {
        @Override public String printEng() { return FRIDAY.nameEng; }
        @Override public String printRus() { return FRIDAY.nameRus; }
    },
    SATURDAY(6, "Saturday", "Суббота") {
        @Override public String printEng() { return SATURDAY.nameEng; }
        @Override public String printRus() { return SATURDAY.nameRus; }
    },
    SUNDAY(7, "Sunday", "Воскресенье") {
        @Override public String printEng() { return SUNDAY.nameEng; }
        @Override public String printRus() { return SUNDAY.nameRus; }
    };

    private int dayNum;
    private String nameRus;
    private String nameEng;

    DayOfWeek (int dayNum, String nameEng, String nameRus){
        this.dayNum = dayNum;
        this.nameRus = nameRus;
        this.nameEng = nameEng;
    }
    public abstract String printEng();
    public abstract String printRus();

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

    static String getDayOfWeek(int selectedDay, int selectedLang) {
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
        return result;
    }

//    public static DayOfWeek getDayOfWeek1(int selectedDay, int selectedLang) {
//        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
//        return (selectedDay>=1 && selectedDay<=7) ? values(selectedDay) : null;
//    }
    static String getDayOfWeek2(int selectedDay, int selectedLang) {
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        for (DayOfWeek day : dayOfWeeks)
            for (DayOfWeek dayOfWeek : dayOfWeeks) {
                return day.dayNum + " " + day.print(selectedLang);
            }
        return null;
    }

    @Override
    public String toString() {
        return String.format("DayOfWeek [dayNum=%d, nameRus=%s, nameEng=%s]", dayNum, nameRus, nameEng);
    }
}
