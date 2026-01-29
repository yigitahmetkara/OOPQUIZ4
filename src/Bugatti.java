
import java.util.Random;

public class Bugatti extends Car {

	public Bugatti(String Brand) {
		super(Brand);
	}

	@Override
	public int moveForward() {
		Random rnd = new Random();
		int km = rnd.nextInt(CommonOperations.MaxSpeedBugatti);
		super.setPosition(super.getPosition() + km);
		return super.getPosition();
	}

	@Override
	public int moveBackward() {
		Random rnd = new Random();
		int km = rnd.nextInt(CommonOperations.MaxSpeedBugatti);
		super.setPosition(super.getPosition() - km);
		return super.getPosition();
	}

}
