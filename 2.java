import java.util.Scanner;

class ElectricityBill {
    private String consumerNumber, consumerName, connectionType;
    private double previousReading, currentReading;

    public ElectricityBill(String consumerNumber, String consumerName, double previousReading, double currentReading, String connectionType) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType;
    }

    public double computeBill(double tariff) {
        double unitsConsumed = currentReading - previousReading;
        return unitsConsumed < 0 ? 0 : unitsConsumed * tariff; // Avoid negative units
    }

    public void displayBill(double tariff) {
        System.out.printf("\n--- Electricity Bill ---\nConsumer Number: %s\nConsumer Name: %s\nPrevious Reading: %.2f\nCurrent Reading: %.2f\nConnection Type: %s\nTotal Units Consumed: %.2f\nBill Amount: $%.2f%n",
                          consumerNumber, consumerName, previousReading, currentReading, connectionType,
                          currentReading - previousReading, computeBill(tariff));
    }
}

public class ElectricityBillApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Consumer Number: ");
        String consumerNumber = scanner.nextLine();
        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();
        System.out.print("Enter Previous Month Reading: ");
        double previousReading = scanner.nextDouble();
        System.out.print("Enter Current Month Reading: ");
        double currentReading = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Connection Type (Domestic/Commercial): ");
        String connectionType = scanner.nextLine();
        System.out.print("Enter Tariff Rate ($ per unit): ");
        double tariff = scanner.nextDouble();

        ElectricityBill bill = new ElectricityBill(consumerNumber, consumerName, previousReading, currentReading, connectionType);
        bill.displayBill(tariff);
        scanner.close();
    }
}
