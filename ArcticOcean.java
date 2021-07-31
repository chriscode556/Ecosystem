package christ.core_java.common.ecosystem;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import christ.core_java.common.animal.Animal;
import christ.core_java.common.animal.Cuttlefish;
import christ.core_java.common.animal.RandomAnimalBuilder;
import christ.core_java.common.animal.birds.HerringGull;
import christ.core_java.common.animal.fish.ArcticCod;
import christ.core_java.common.animal.fish.BeringFlounder;
import christ.core_java.common.animal.fish.GreatWhite;
import christ.core_java.common.animal.fish.SalmonShark;
import christ.core_java.common.animal.mammals.BowheadWhale;
import christ.core_java.common.animal.mammals.Mammal;

/**
 * @author christ animals, Salmon Shark,
 * 
 *
 */
public class ArcticOcean extends Ecosystem {
//************** VARIABLES
	List<Animal> sharks = (List<Animal>) new RandomAnimalBuilder(SalmonShark.class).build(4);
	List<Animal> whales = (List<Animal>) new RandomAnimalBuilder(BowheadWhale.class).build(4);
	List<Animal> cods = (List<Animal>) new RandomAnimalBuilder(ArcticCod.class).build(4);
	List<Animal> gulls = (List<Animal>) new RandomAnimalBuilder(HerringGull.class).build(4);
	List<Animal> flounder = (List<Animal>) new RandomAnimalBuilder(BeringFlounder.class).build(4);
	List<Animal> cuttle = (List<Animal>) new RandomAnimalBuilder(Cuttlefish.class).build(20);
	// ************* CONTRUCTOR SECTION
	public ArcticOcean() {
		setEcosystem(EcosystemType.ARCTIC_OCEAN);
		System.out.println("Welcome to the Arctic Ocean !");
		useFileDAO();
		findNearbyAnimals();

	}
public void sharkFood() {
	for (Animal c: nearbyAnimals ) {
		System.out.println(c);
		
	}
	
}



	private void useFileDAO() {
		// TODO Auto-generated method stub

	}

//************ METHOD SECTION
	@Override
	public void listPopulation() {
		System.out.println(flounder);
		System.out.println(gulls);
		System.out.println(sharks);
		System.out.println(whales);
		System.out.println(cods);

	}

	@Override
	public void findNearbyAnimals() {
		int[] alreadyAdded = new int[3];
		for (int i = 0; i < 3; i++) {
			Arrays.sort(alreadyAdded);
			int probability = ThreadLocalRandom.current().nextInt(1, 7);
			if (Arrays.binarySearch(alreadyAdded, 0, 2, probability) >= 0) {
				i--;
				continue;
			}
			switch (probability) {
			case 1:
				nearbyAnimals.addAll(cods);
				break;
			case 2:
				nearbyAnimals.addAll(flounder);
				break;
			case 3:
				nearbyAnimals.addAll(gulls);
				break;
			default:
				nearbyAnimals.addAll(cuttle);
			}
		}

//
//		}

	}

	public void animalsInTheArcticMovingAround() {
		for (Animal c : cods) {
			c.move();
			c.sleep();
			c.getType();
			System.out.println(c);

		}
		for (Animal b : flounder) {
			b.move();
			b.sleep();
			b.getType();
			System.out.println(b);

		}
		for (Animal d : whales) {
			d.move();
			d.sleep();
			d.getType();
			d.getWeight();
			System.out.println(d);

		}
		for (Animal f: cuttle) {
			f.move();
			f.eat();
			f.sleep();
			
		}
		SalmonShark b = new SalmonShark();
		b.move();
		b.catchPrey(b);
		b.reproduce();
		b.hunt(cods);
		GreatWhite g = new GreatWhite();
		g.eat();
		g.hunt();
		HerringGull v = new HerringGull();
		v.canFly();
		v.setAge(0);
		v.Float();

	}
}
