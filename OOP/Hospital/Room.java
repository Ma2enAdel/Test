package Hospital;

public class Room {
        // Room attributes
        private int roomNumber;
        private String roomType;
        private boolean occupied;
    
        // Constructor
        public Room(int roomNumber, String roomType) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.occupied = false; // By default, room is not occupied
        }
        public  Room (int roomNumber){
        this.roomNumber=roomNumber;
    }
    
        // Getter methods
        public int getRoomNumber() {
            return roomNumber;
        }
    
        public String getRoomType() {
            return roomType;
        }
    
        public boolean isOccupied() {
            return occupied;
        }
    
        // Setter methods
        public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        }
    
        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }
        public void setOccupied(boolean occupied) {
            this.occupied = occupied;
            
        }
        public void  canceloccu (){
            this.occupied=false;
            System.out.println("Room reservation cancelled");
    }
    }
    

