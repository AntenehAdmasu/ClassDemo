/* Name - Anteneh Admasu
    ID - ATR/2674/09
    Section - 1
 */

public class FactoryPatternDemo {

        public static void main(String[] args) {
            HouseFactory houseFactory = new HouseFactory();

            House house1 = houseFactory.getHouse("CAFE");
            house1.build();

            House house2 = houseFactory.getHouse("RESIDENCE");
            house2.build();

            House house3 = houseFactory.getHouse("WAREHOUSE");
            house3.build();
        }

}
