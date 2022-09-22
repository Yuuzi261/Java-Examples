import java.util.Scanner;

public class CarApplication {
    
    static Scanner input = new Scanner(System.in);

    static Car inputCar() {

        String model, year;
		double price;

        System.out.println("Enter info of Car:");
        System.out.print("Model: ");
        model = input.nextLine();
        System.out.print("Year: ");
        year = input.nextLine();
        System.out.print("Price: ");
        price = input.nextFloat();

        Car car = new Car(model, year, price);

        return car;
    }

    static void showCar(Car car) {
        System.out.printf("\nModel: %s\n", car.getModel());
        System.out.printf("Year: %s\n", car.getYear());
        System.out.printf("Price: $%.2f\n", car.getprice());
    }

	public static void main(String[] args) {

        Car car1 = inputCar();
        input.nextLine();
        Car car2 = inputCar();
        
        showCar(car1);
        showCar(car2);

        System.out.print("\nCar 1 after 5% discount: ");
        car1.setPrice(car1.getprice() * 0.95);
        System.out.printf("$%.2f\n", car1.getprice());
        System.out.print("Car 2 after 7% discount: ");
        car2.setPrice(car2.getprice() * 0.93);
        System.out.printf("$%.2f\n", car2.getprice());

        input.close();
	}
}