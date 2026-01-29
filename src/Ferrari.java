
import java.util.Random;

public class Ferrari extends Car {

	public Ferrari(String Brand) {
		super(Brand);
	}

	@Override
	public int moveForward() {
		Random rnd = new Random();
		int km = rnd.nextInt(CommonOperations.MaxSpeedFerrari);
		super.setPosition(super.getPosition() + km);
		return super.getPosition();
	}

	@Override
	public int moveBackward() {
		Random rnd = new Random();
		int km = rnd.nextInt(CommonOperations.MaxSpeedFerrari);
		super.setPosition(super.getPosition() - km);
		return super.getPosition();
	}

}
