
public class HouseFactory {
    public House getHouse(String houseType){
        if(houseType == null){
            return null;
        }
        if(houseType.equalsIgnoreCase("Residence")){
            return new Residence();

        } else if(houseType.equalsIgnoreCase("Cafe")){
            return new Cafe();

        } else if(houseType.equalsIgnoreCase("Warehouse")){
            return new WareHouse();
        }

        return null;
    }
}
