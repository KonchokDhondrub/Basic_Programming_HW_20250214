import java.util.ArrayList;
import java.util.List;

public class Hotel{
    private static final String title = "Hotel Meriolt ★★★★";
    private final int roomNum; // номер комнаты
    private final RoomTypes roomType; // тип номеров
    private final int guestCapacity;  // количество мест

    public static final List<Hotel> LISTOFROOMS = new ArrayList<>(List.of(
            new Hotel(RoomTypes.STANDARD, 101, 1),
            new Hotel(RoomTypes.STANDARD, 102, 2),
            new Hotel(RoomTypes.STUDIO, 103, 1),
            new Hotel(RoomTypes.STUDIO, 104, 2),
            new Hotel(RoomTypes.SUITE, 201, 2),
            new Hotel(RoomTypes.SUITE2ROOMS, 202, 3),
            new Hotel(RoomTypes.DELUXE, 301, 2),
            new Hotel(RoomTypes.DELUXE, 302, 4),
            new Hotel(RoomTypes.PRESIDENT, 401, 4)
    ));

    private Hotel(RoomTypes roomType, int roomNum, int guestCapacity) {
        this.roomType = roomType;
        this.roomNum = roomNum;
        this.guestCapacity = guestCapacity;
    }

    public String getTitle(){
        return title;
    }
    public int getRoomNum() {
        return roomNum;
    }
    public RoomTypes getRoomType() {
        return roomType;
    }
    public int getGuestCapacity() {
        return guestCapacity;
    }

    private int priceCorrection(){
        if (roomType == RoomTypes.STANDARD && guestCapacity > 1){
            return (int) Math.ceil(roomType.getPrice()*1.15);
        }
        else if (roomType == RoomTypes.STUDIO && guestCapacity > 1) {
            return (int) Math.ceil(roomType.getPrice()*1.15);
        }
        else if (roomType == RoomTypes.DELUXE && guestCapacity > 2) {
            return (int) Math.ceil(roomType.getPrice()*1.2);
        }
        else {
            return roomType.getPrice();
        }
    }

    public String toString(){
        return String.format("%-14s '%d' Мест: %d, Цена: %d,00, Описание: %s",
                roomType.getName(), roomNum, guestCapacity, priceCorrection(), roomType.getDescription());
    }
}
