package Quarter.ProductionQuarter;

import Quarter.Quarter;

public class VirtualQuantumComputer extends ProductionQuarter{

    //production[0MadScientist, 1MadScientist, 2HellishBoss, 3HellishBoss, 4dataCentre, 5dataCentre, 6VirtualQuantumComputer, 7VirtualQuantumComputer]


    public VirtualQuantumComputer() {

        super();
        name = "VirtualQuantumComputer";
    }

    @Override
    public void adjacentBonuses(Quarter adjQuarter) {
        switch (adjQuarter.getName()) {
            case "VirtualQuantumComputer" -> productionBonusRate += 0.1 + 0.1 * adjQuarter.getLevel() * adjQuarter.getCrew() / (adjQuarter.getLevel() + 1);
            case "MadScientist" -> {
                double rnd = Math.random();
                if (rnd < adjQuarter.getProduction()[7] * adjQuarter.getLevel()) {
                    productionBonusConstant += adjQuarter.getProduction()[3];
                } else if (rnd >= 100 - (adjQuarter.getProduction()[9])) {
                    productionBonusConstant -= adjQuarter.getProduction()[3];
                }
            }
        }
    }
}
