package in.ashokit;

import org.springframework.stereotype.Component;

@Component("chip62")
public class Chip62Bit implements IChip {
	
	public  void Chip64Bit() {
		System.out.println("Chip64bit::Constructor");
	}
	@Override
public boolean  process() {
		System.out.println("Chip64 processing started..");
		return true;
		
	}

}
