
import java.util.Random;

public class Porsche extends Car {

	public Porsche(String Brand) {
		super(Brand);
	}

	@Override
	public int moveForward() {
		Random rnd = new Random();
		int km = rnd.nextInt(CommonOperations.MaxSpeedPorsche);
		super.setPosition(super.getPosition() + km);
		return super.getPosition();
	}

	@Override
	public int moveBackward() {
		Random rnd = new Random();
		int km = rnd.nextInt(CommonOperations.MaxSpeedPorsche);
		super.setPosition(super.getPosition() - km);
		return super.getPosition();
	}

}
