
public class CarRace {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		RaceManager manager = new RaceManager(20, 500);
		manager.CarGenerate("Bugatti");
		Driver diver1 = new Driver("Alonso", 25);
		manager.getCars().get(0).setDriver(diver1);

		manager.CarGenerate("Porsche");
		Driver diver2 = new Driver("Hamilton", 34);
		manager.getCars().get(1).setDriver(diver2);

		manager.CarGenerate("Ferrari");
		Driver diver3 = new Driver("Max", 42);
		manager.getCars().get(2).setDriver(diver3);

		manager.Run();

	}

}
