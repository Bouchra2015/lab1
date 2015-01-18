package org.lab1.test;
 
import org.junit.Test;
import org.lab1.code.Room;
 
public class RoomTest {
 
	@Test
	public void aNewRoomIsNotAvaiable() {
		Room room = new Room();
 
		assertFalse(room.isAvailable());
	}

	private void assertFalse(boolean available) {
		// TODO Auto-generated method stub
		
	}
}