package sklep;

import Rabat.Discount;
import Rabat.FixedDiscount;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class Cart {

    private double transportCosts = 0;

    private Discount discount = new FixedDiscount(0);
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public double getDiscountedValueTotal(){
            return discount.calculateDiscountedPrice(getTotal());
    }

    public double getDiscountValue(){
        return getTotal() - getDiscountedValueTotal();
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getReceipt() {
        StringBuilder receiptBuilder = new StringBuilder();
        for (Product product : products) {
            receiptBuilder.append(product.getName())
                    .append(" - ")
                    .append(formatPrice(product.getPrice()))
                    .append("\n");
        }
        appendDiscountSize(receiptBuilder);
        receiptBuilder.append("Suma po rabacie: ")
                .append(formatPrice(getDiscountedValueTotal()));
        return receiptBuilder.toString();
    }

    public void appendDiscountSize(StringBuilder builder){

        builder.append("Wysokość Rabatu: ")
                .append(formatPrice(getDiscountValue()))
                .append("\n");

    }

    public double getTransportCosts(){

        return transportCosts;
    }

    public void setTransportCosts(double transportCosts) {
        this.transportCosts = transportCosts;
    }

    public String getTransport(){
        StringBuilder transportBuilder = new StringBuilder();
            transportBuilder.append("Koszt Transportu wynosi: ")
                    .append(formatPrice(getTransportCosts()));
        return transportBuilder.toString();
    }

    public double getAll(){
        return getTransportCosts() + getDiscountedValueTotal();
        }

    public String getAllCosts(){
        StringBuilder allCostsBuilder = new  StringBuilder();
            allCostsBuilder.append("Łączna Wartość zamówienia wraz z dostawą: ")
                    .append(formatPrice(getAll()));
        return allCostsBuilder.toString();
    }


    public void clear() {
        products.clear();
    }

    public void removeProduct(Product p) {
        products.remove(p);
    }

    public void removeByName(String name) {

        List<Product> listaDoUsuniecia = new ArrayList<>() ;

        for (Product product : products) {

          if (name.equals(product.getName())){
              listaDoUsuniecia.add(product);
            }
        }
        products.removeAll(listaDoUsuniecia);
    }
    private String formatPrice(double price) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00zł");
        return decimalFormat.format(price);
    }
}


