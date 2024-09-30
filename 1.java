 import java.util.*;

 class Invoice {
    
    private String partnum;
    private String partdes;
    private int qua;
    private double ppitem;

    public Invoice(String partnum, String partdes, int qua, double ppitem) {
        this.partnum = partnum;
        this.partdes = partdes;
        this.qua = qua;
        this.ppitem = ppitem;
    }

    public double totalamount() {
        if (qua < 0) qua = 0; 
        if (ppitem < 0) ppitem = 0; 
        return qua * ppitem;    }

    
    public void displaytotalamount() {
        System.out.println("\n");
        System.out.println("Part Number: " + partnum);
        System.out.println("Part Description: " + partdes);
        System.out.println("Quantity: " + qua);
        System.out.println("Price per Item: " + ppitem);
        System.out.printf("Total Invoice Amount:", totalamount());
    }
}
public class InvoiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Part Number: ");
        String partnum = sc.nextLine();

        System.out.print("Enter Part Description: ");
        String partdes = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qua = sc.nextInt();

        System.out.print("Enter Price per Item: ");
        double ppitem = sc.nextDouble();

        
        Invoice invoice = new Invoice(partnum, partdes, qua, ppitem);


    
    }
}
