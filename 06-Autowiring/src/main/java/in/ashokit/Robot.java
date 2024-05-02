package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	private IChip chip;
	
	public Robot() {
		System.out.println("Robot::Constructor");
	}
	public Robot (IChip chip) {
		this.chip=chip;
	}
	
	public void doWork() {
		System.out.println("Injection::"+chip.getClass().getName());
		boolean status=chip.process();
		if(status) {
			System.out.println("Robust is working..");
		}else {
			System.out.println("Robot is having fund");
		}
		
	}

}
