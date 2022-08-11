public class FurnitureItemImple {
    public static void main(String[] args) {


        FurnitureItem obj = new FurnitureItem();

        obj.furnitureTypes = "Stools";
        obj.furnitureUsage = "outdoor";
        obj.colorOfFurnitures = "green";
        obj.gradeOfFurnitures = "Grade1";
        obj.furniturePrice = 1000;


        System.out.println("type : " + obj.furnitureTypes);
        System.out.println("Usage : " + obj.furnitureUsage);
        System.out.println("Color : " + obj.colorOfFurnitures);
        System.out.println("Grade : " + obj.gradeOfFurnitures);
        System.out.println("Price : " + obj.furniturePrice);

        System.out.println("Discounted Price : " + obj.calculateDiscount());

    }
}
