package christ.core_java.common.ecosystem;

import java.util.List;

import christ.core_java.common.animal.*;
import christ.core_java.common.animal.fish.*;

public class OpenOcean extends Ecosystem {
	// Shark, Mackerel, sea bass, manta ray, swordfish, tuna, sheephead, bluefish, yellow bream, squid, octopus,
	// man-of-war, jellyfish
	List<Shark> greatWhiteSharks = (List<Shark>) new RandomAnimalBuilder(GreatWhite.class).build(5); 
	List<Tuna> tuna = (List<Tuna>) new RandomAnimalBuilder(Tuna.class).build(20); 

	public OpenOcean () {
		setEcosystem(EcosystemType.PELAGIC_OCEAN);
		System.out.println("OpenOcean created");
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
		System.out.println(greatWhiteSharks);
		System.out.println(tuna);
		for (Animal a : nearbyAnimals) {
			System.out.println("Found a " + a);
		}
	}
	@Override
	public void findNearbyAnimals() {
		// TODO Auto-generated method stub
		
	}

}
