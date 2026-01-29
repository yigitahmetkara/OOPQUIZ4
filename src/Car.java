
public abstract class Car implements CommonOperations {
	private String Brand;
	private int position;
	private int direction;
	private Driver driver;

	@Override
	public String toString() {
		return "Car{" + "Brand=" + Brand + ", position=" + position + ", direction=" + direction + ", "
				+ driver.toString() + '}';
	}

	public Car(String Brand) {
		this.Brand = Brand;
		this.position = 0;
		this.direction = 0;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
