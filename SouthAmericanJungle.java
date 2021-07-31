package christ.core_java.common.ecosystem;

import java.util.List;

import christ.core_java.common.animal.Animal;
import christ.core_java.common.animal.RandomAnimalBuilder;
import christ.core_java.common.animal.reptiles.*;

public class SouthAmericanJungle extends Ecosystem {
	// Anaconda, capybara, cayman, python, ocelot, jaguar, macaw, cougar, agouti, parrot

	List<Anaconda> lions = (List<Anaconda>) new RandomAnimalBuilder(Anaconda.class).build(20); 

	public SouthAmericanJungle () {
		setEcosystem(EcosystemType.SA_JUNGLE);
		System.out.println("South American jungle created");
//		findNearbyAnimals();
	}
//
//
//	@Override
//	public void beginSimulation() {
//		System.out.println("Simulation running");
//	}
//
	@Override
	public void listPopulation() {
		for (Animal a : nearbyAnimals) {
			System.out.println("Found a " + a);
		}
	}
	@Override
	public void findNearbyAnimals() {
		// TODO Auto-generated method stub
		
	}

}
