class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }


    // Internet хотелось красиво, но слишком долго писать и мало времени, только для меню ввода пользователем
    public static MyDate parseDate(String date) {
        if (date.length() < 7 || date.length() > 8) {
            throw new IllegalArgumentException("Invalid date format: " + date);
        }
        int day = Integer.parseInt(date.substring(0, date.length() - 6));
        int month = Integer.parseInt(date.substring(date.length() - 6, date.length() - 4));
        int year = Integer.parseInt(date.substring(date.length() - 4));
        return new MyDate(day, month, year);
    }
}