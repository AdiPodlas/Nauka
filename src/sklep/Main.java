package sklep;

public class Main {
        public static void main(String[] args) {

            Cart cart = new Cart();

            cart.setDiscount(0.1);
            cart.setTransportCosts(45);

            Product product1 = new Product("Margaryna", 9.901);
            Product product2 = new Product("Gra", 79.79);
            Product product3 = new Product("Krzesełko", 219.15);
            Product product4 = new Product("Bułka", 1.99);
            Product product5 = new Product("Gra", 8.99);
            Product product6 = new Product("Krzesełko", 219.15);

            cart.addProduct(product1);
            cart.addProduct(product2);
            cart.addProduct(product3);
            cart.addProduct(product4);
            cart.addProduct(product5);





            String receipt = cart.getReceipt();
            System.out.println(receipt);

            String transport = cart.getTransport();
            System.out.println(transport);

            String all = cart.getAllCosts();
            System.out.println(all);






            cart.removeByName("Gra");
            cart.removeProduct(product6);

            System.out.println("Po usunięciu pierwszego produktu: ");

            receipt = cart.getReceipt();
            System.out.println(receipt);

            transport = cart.getTransport();
            System.out.println(transport);

            all = cart.getAllCosts();
            System.out.println(all);

            cart.clear();
            System.out.println("Koszyk po usunięciu produktów:");
            receipt = cart.getReceipt();
            System.out.println(receipt);

            transport = cart.getTransport();
            System.out.println(transport);

            all = cart.getAllCosts();
            System.out.println(all);
        }
    }


