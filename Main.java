public class Main {
    public static void main(String[] args) {

        String productName = "  iPhone 15 Pro  ";
        double price = 2500.0;
        int count = 2;

        String formattedName = productName.strip().toUpperCase();

        double totalAmount = price * count;
        double discount = 0.0;
        double finalPrice;

        if (totalAmount > 3000) {
            discount = totalAmount * 0.10; 
            finalPrice = totalAmount - discount;
        } else {
            finalPrice = totalAmount;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Sifarisiniz hazirlanir...");
        }

        System.out.println("Mehsul: " + formattedName);
        System.out.println("Umumi mebleg: " + totalAmount + " AZN");
        
        if (discount > 0) {
            System.out.println("Endirim tetbiq edildi: " + discount + " AZN");
        } else {
            System.out.println("Endirim tetbiq edilmədi.");
        }
        
        System.out.println("Yekun odenis: " + finalPrice + " AZN");
    }
}