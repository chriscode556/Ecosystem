package christ.core_java.common.ecosystem;

import java.util.List;

import christ.core_java.common.animal.Animal;
import christ.core_java.common.animal.RandomAnimalBuilder;
import christ.core_java.common.animal.mammals.MountainLion;

public class RedwoodForest extends Ecosystem {
	// Mountain lion, bobcat, oppossum, mouse, vole, bat, deer rabbit, barn owl, hermit thrush, woodpecker 

	List<MountainLion> lions = (List<MountainLion>) new RandomAnimalBuilder(MountainLion.class).build(20); 

	public RedwoodForest () {
		setEcosystem(EcosystemType.WOODLANDS);
		System.out.println("Redwood Forest created");
//		findNearbyAnimals();
	}


//	@Override
//	public void beginSimulation() {
//		System.out.println("Simulation running");
//	}

	@Override
	public void listPopulation() {
		System.out.println(lions);
		for (Animal a : nearbyAnimals) {
			System.out.println("Found a " + a);
		}
	}


	@Override
	public void findNearbyAnimals() {
     // TODO Auto-generated method stub
		
	}
}
