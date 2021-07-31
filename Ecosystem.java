

package christ.core_java.common.ecosystem;

import java.util.ArrayList;
import java.util.List;

import christ.core_java.common.animal.Animal;
import christ.core_java.common.animal.RandomAnimalBuilder;

public abstract class Ecosystem {
/* ************************ VARIABLES, GETTERS AND SETTERS SECTION ********************************
 * Variables with getters and setters
 * Static variables first, others organized by state
 */
	private EcosystemType ecosystemType = EcosystemType.UNKNOWN;
	public void setEcosystem(EcosystemType est) { ecosystemType = est; }
	public EcosystemType getEcosystem() { return ecosystemType; }

	protected List<Animal> nearbyAnimals = new ArrayList<>();
	
	public List<Animal> getNearbyAnimals() { return new ArrayList<Animal>(nearbyAnimals); }

/* ********************* CONSTRUCTORS AND INITIALZATION BLOCKS SECTION ****************************
 * Constructors and initialization blocks
 * static initialization blocks first, regular initialization blocks second
 * No argument constructor third, other constructors next
 */

	
/* ******************************* METHODS SECTION ************************************************
 * Methods other than getters and setters section
 * These should be organized by parent classes, overrides first
 */
	public abstract void listPopulation();
	
	public abstract void findNearbyAnimals();
}
