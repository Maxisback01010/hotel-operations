public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    public Reservation(String roomType, int numberOfNights, boolean isWeekend){
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        public String getroomType(){
            return roomType;
        }
        public String getRoomType(){
            return roomType;
        }
        public void setRoomType(String roomType){
            this.roomType=roomType;
        }


    }
}
