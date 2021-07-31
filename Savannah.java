package christ.core_java.common.ecosystem;

import java.util.ArrayList;
import java.util.List;

import christ.core_java.common.animal.*;
import christ.core_java.common.animal.mammals.*;
import christ.core_java.lesson09.dao.AnimalDAO;
import christ.core_java.lesson09.dao.AnimalDaoFactory;
import christ.core_java.lesson09.dao.DaoFactory;
import christ.core_java.lesson09.dao.DataStoreNotFoundException;


 */
public class Savannah extends Ecosystem {
//**************************** VARIABLES SECTION ******************************
//	List<Lion> lionPride = new ArrayList<>();
	List<Lion> lionPride = (List<Lion>) new RandomAnimalBuilder(Lion.class).build(6);
	List<Cheetah> cheetahs = (List<Cheetah>) new RandomAnimalBuilder(Cheetah.class).build(2);
	List<Elephant> elephants = (List<Elephant>) new RandomAnimalBuilder(Elephant.class).build(7); 
	List<Gazelle> gazelleHerd = (List<Gazelle>) new RandomAnimalBuilder(Gazelle.class).build(50);
	List<Giraffe> giraffes = (List<Giraffe>) new RandomAnimalBuilder(Giraffe.class).build(12); 
	List<Impala> impalaHerd = (List<Impala>) new RandomAnimalBuilder(Impala.class).build(12); 
	List<Zebra> zebraHerd = (List<Zebra>) new RandomAnimalBuilder(Zebra.class).build(20);
	List<Wildebeest> wildebeastHerd = (List<Wildebeest>) new RandomAnimalBuilder(Wildebeest.class).build(20);
	
//*************************** CONSTRUCTOR SECTION *****************************
	public Savannah() {
		setEcosystem(EcosystemType.SAVANNAH);
		System.out.println("Savannah created");
		useFileDAO();
		findNearbyAnimals();
	}

	//****************************** METHOD SECTION *******************************
	//Ecosystem overrides
	@Override
	public void listPopulation() {
		System.out.println(lionPride);
		System.out.println(cheetahs);
		System.out.println(gazelleHerd);
		System.out.println(giraffes);
		System.out.println(elephants);
		System.out.println(impalaHerd);
		System.out.println(zebraHerd);
		System.out.println(wildebeastHerd);
	}

	public void findNearbyAnimals() {
		nearbyAnimals = (List<Animal>) new RandomAnimalBuilder().setEcosystem(EcosystemType.SAVANNAH).build(20);
		for (Animal a : nearbyAnimals) {
			String result = "Found a " + a + ": health = " + a.getHealth();
			if (a instanceof Mammal ) result += ", running speed = " + ((Mammal)a).getRunningSpeed();
			System.out.println(result);
		}
	}


	private void useFileDAO() {
		DaoFactory factory = new AnimalDaoFactory();
		AnimalDAO dao = null;
		try {
			dao = factory.getDao("files");
		} catch (DataStoreNotFoundException e) {
			System.out.println(e);
			return;
		}
		dao.setDebug(false);
		
		// Retrieve the lions from the dao:
		for (Animal lion : dao.findAll()) {
			lionPride.add((Lion)lion);
		}
		
	}

}
