package marafon;

import marafon.Obstacle.Cross;
import marafon.Obstacle.Obstacle;
import marafon.Obstacle.Wall;
import marafon.Obstacle.Water;
import marafon.competitors.Cat;
import marafon.competitors.Competitor;
import marafon.competitors.Dog;
import marafon.competitors.Human;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Bob"),
                new Cat("Bars"),
                new Dog("Tuzik"),
                new Human("John Connor",10000, 2000, 4)
        };

        Obstacle[] obstacles = {
                new Cross(500),
                new Water(100),
                new Wall(1)
        };

        for (Competitor c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors ) {
            c.info();
        }

    }
}

