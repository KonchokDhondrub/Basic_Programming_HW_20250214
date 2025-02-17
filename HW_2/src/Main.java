import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Hotel> rooms = Hotel.LISTOFROOMS;
        List<Person> personList = new ArrayList<>();
        List<MyDate> myDates = new ArrayList<>();

        personList.add(new Person("Jack", "Murray", "US1235512", 102, new MyDate(18,2,2025), new MyDate(28,2,2025)));
        personList.add(new Person("John", "McFly", "DE61235631", 401,new MyDate(30,1,2025), new MyDate(10,3,2025)));

        System.out.println("--- All Rooms ---");
        printAllRoomsWithReservation(personList);

        System.out.println("\n--- New Guest Menu ---");
//        splitData(newGuestMenu(), personList);

        for (Person person : personList){
            System.out.println(personList.toString());
        }

    }
    private static String newGuestMenu(){  // Сырой ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя, фамилию, номер паспорта, номер комнаты, дату начала и окончания резервации (через ','): ");
        String value = scanner.nextLine();
        return value;
    }

    public static void splitData(String input, List<Person> personList) {
        String[] segments = input.split(",");

        String firstName = segments[0].trim();
        String lastName = segments[1].trim();
        String id = segments[2].trim();
        int room = Integer.parseInt(segments[3].trim());
        MyDate startDate = MyDate.parseDate(segments[4].trim());
        MyDate endDate = MyDate.parseDate(segments[5].trim());

        personList.add(new Person(firstName, lastName, id, room, startDate, endDate));
    }

    public static void printAllRoomsWithReservation(List<Person> personList){
        System.out.println(Hotel.LISTOFROOMS.get(0).getTitle());
        for (Hotel room : Hotel.LISTOFROOMS) {
            String reservationInfo = "Свободен";
            for (Person person : personList) {

                if (person.getRoom() == room.getRoomNum()) {
                    reservationInfo = String.format("Зарезервирован: \n\t%s %s, с %s по %s",
                            person.getFirstName(), person.getLastName(),
                            person.getReservationStart(), person.getReservationEnd());
                    break;
                }
            }
            System.out.println(room.toString() + ", Статус: " + reservationInfo);
        }
    }

    public static void printAllRooms(){
        System.out.println(Hotel.LISTOFROOMS.get(0).getTitle());
        for (int i = 0; i < Hotel.LISTOFROOMS.size(); i++) {
            System.out.println(Hotel.LISTOFROOMS.get(i).toString());
        }
    }

    public static void printAllRoomTypes(){
        RoomTypes[] roomTypes = RoomTypes.values();
        for (RoomTypes roomType : roomTypes) {
            System.out.println(roomType);
        }
    }
}