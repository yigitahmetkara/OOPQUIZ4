
import java.util.ArrayList;
import java.util.Random;

public class RaceManager {
	private ArrayList<Car> cars;
	private int second;
	private int endingPosition;

	public RaceManager(int second, int endingPosition) {
		this.cars = new ArrayList<Car>();
		this.second = second;
		this.endingPosition = endingPosition;
	}

	public int CarGenerate(String brand) {
		switch (brand) {
		case "Bugatti":
			Car newcar = new Bugatti(brand);
			this.cars.add(newcar);
			break;
		case "Ferrari":
			Car newcar2 = new Ferrari(brand);
			this.cars.add(newcar2);
			break;
		case "Porsche":
			Car newcar3 = new Porsche(brand);
			this.cars.add(newcar3);
			break;
		}
		return this.cars.size();
	}

	public boolean Run() {
		Random rnd = new Random();
		for (int s = 0; s < this.second; s++) {
			System.out.println("Second : " + (s + 1));
			for (int i = 0; i < cars.size(); i++) {
				int direction = rnd.nextInt(2);
				if (direction == 0) {
					this.cars.get(i).moveForward();
				} else {
					this.cars.get(i).moveBackward();
				}
				this.cars.get(i).setDirection(direction);
				System.out.println(this.cars.get(i));

				if (this.cars.get(i).getPosition() >= this.endingPosition) {
					System.out.println("***************Winner : ******************");
					System.out.println(this.cars.get(i));
					return true;
				}
			}
		}
		return false;
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

}
