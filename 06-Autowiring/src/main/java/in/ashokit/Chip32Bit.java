package in.ashokit;

import org.springframework.stereotype.Component;

@Component("chip32")
public class Chip32Bit implements IChip{	
	public void  Chip32Bit() {
		System.out.println("Chip32bit::Constructor");
	}
	@Override
	public  boolean process() {
		System.out.println("Chip32bit processing started..");
		return false;
		
	}
	

	}


