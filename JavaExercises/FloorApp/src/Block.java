public class Block {
	
	Flat[] flats = new Flat[0];
	
	class Flat {	
		
		Room[] rooms = new Room[0];
		
		Flat() {
			super();			
			Flat[] oldFlats = flats;
			
			if (oldFlats.length == 0) {
				flats = new Flat[1];
				flats[0] = this;
			} else {
				flats = new Flat[flats.length + 1];
				for(int i = 0; i < oldFlats.length; i++) {
					flats[i] = oldFlats[i];
				}
				flats[oldFlats.length] = this;
			}
			
		}
		
		class Room {
			private int width;
			private int height;
			private int numWindow;
			
			Room(int width, int height, int numWindow) {
				super();
				this.width = width;
				this.height = height;
				this.numWindow = numWindow;
				
				Room[] oldRoom = rooms;
				
				if (oldRoom.length == 0) {
					rooms = new Room[1];
					rooms[0] = this;
				} else {
					rooms = new Room[rooms.length + 1];
					for(int i = 0; i < oldRoom.length; i++){
						
						rooms[i] = oldRoom[i];
						
					}
					rooms[oldRoom.length] = this;
					
				}	
			}

			@Override
			public String toString() {
				return width + "/" + height + "/" + numWindow;
			}			
		}

	}
	
	static class Process {
		
		static int getNumFlat(Block b) {
			return b.flats.length;
		}
		
		static int getNumRoom(Flat f) {
			return f.rooms.length;			
		}		
		
		static int getHeightRoom(Flat.Room r) {
			return r.height;			
		}		
		
		static int getWidthRoom(Flat.Room r) {
			return r.width;			
		}
		
		static int getNumWindowRoom(Flat.Room r) {
			return r.numWindow;
		}
		
		static int getTotalNumRoom(Block b) {
			int totalRoomNum = 0;
			for(Flat f : b.flats) {
				totalRoomNum += f.rooms.length;
			}
			return totalRoomNum;
		}
		
		static boolean isSquare(Flat.Room r) {
			if (r.height == r.width) return true;
			return false;
		}
		
		static Flat.Room findMaxRoomArea(Block b) {
			Flat.Room maxRoom = null;			
			for(int i = 0; i < b.flats.length; i++) {
				for (int j = 0; j < b.flats[i].rooms.length - 1 ; j++) {
					if((b.flats[i].rooms[j].height * b.flats[i].rooms[j].width) < (b.flats[i].rooms[j+1].height * b.flats[i].rooms[j+1].width)){
						maxRoom = b.flats[i].rooms[j+1];
					}
				}
			}		
			
			return maxRoom;
		}
	}
	
	
	
}
