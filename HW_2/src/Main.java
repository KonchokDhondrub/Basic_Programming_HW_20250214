public class Main {
    public static void main(String[] args) {

        // All Room Types
//        printAllRoomTypes();

        printAllRooms();
    }

    public static void printAllRooms(){
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