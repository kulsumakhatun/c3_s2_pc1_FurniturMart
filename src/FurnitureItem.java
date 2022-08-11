public class FurnitureItem {
    int furnitureCode;
    String furnitureTypes;
    String gradeOfFurnitures;
    String colorOfFurnitures;
    String furnitureUsage;
    double furniturePrice;

    FurnitureItem() {
        furnitureCode = 0;
        furnitureTypes = "Table";
        gradeOfFurnitures = "Garde 1";
        colorOfFurnitures = "red";
        furnitureUsage = "Indoor";
        furniturePrice = 0.0;
    }

    double calculateDiscount() {
        double discountedPrice = furniturePrice;
        if (furnitureUsage == "outdoor") {
            discountedPrice = furniturePrice * 0.95;
        }
        return discountedPrice;


    }


}
