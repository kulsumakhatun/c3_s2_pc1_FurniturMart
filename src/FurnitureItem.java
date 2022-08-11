public class FurnitureItem {
    int furnitureCode;
    String furnitureTypes;
    String gradeOfFurnitures;
    String colorOfFurnitures;
    String furnitureUsage;
    double furniturePrice;

    FurnitureItem() {
        furnitureCode = 0;
        furnitureTypes = " ";
        gradeOfFurnitures = " ";
        colorOfFurnitures = " ";
        furnitureUsage = " ";
        furniturePrice = 0.0;
    }

    double calculateDiscount() {
        double discountedPrice = furniturePrice;

        if (furnitureUsage.equals("outdoor")) {
            discountedPrice = furniturePrice * 0.95;
        }
        return discountedPrice;
//

    }


}
