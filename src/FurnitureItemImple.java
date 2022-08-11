import java.util.Scanner;
public class FurnitureItemImple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FurnitureItem obj = new FurnitureItem();
        System.out.println("Enter Furniture types");
        obj.furnitureTypes = sc.nextLine();
        System.out.println("Enter Furniture Usage");
        obj.furnitureUsage = sc.nextLine();
        System.out.println("Enter Furniture color");
        obj.colorOfFurnitures = sc.nextLine();
        System.out.println("Enter Furniture Grade");
        obj.gradeOfFurnitures = sc.nextLine();
        System.out.println("Enter Furniture Price");
        obj.furniturePrice = sc.nextDouble();


        System.out.println("type : " + obj.furnitureTypes);
        System.out.println("Usage : " + obj.furnitureUsage);
        System.out.println("Color : " + obj.colorOfFurnitures);
        System.out.println("Grade : " + obj.gradeOfFurnitures);
        System.out.println("Price : " + obj.furniturePrice);

        System.out.println("Discounted Price : " + obj.calculateDiscount());

    }
}
