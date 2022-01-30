import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {

        System.out.print("\n");

        Product coconutMilk = new Product("Aroy-D ",190.0," 1L ", Category.MILK);
        Product soyaMilk = new Product("Alpro ", 80.0, " 1L ", Category.MILK);
        Product sparklingWine = new Product("Veuve Clicquot ", 1090.0, " 0.375 ", Category.WINE);
        Product whiteWine = new Product("Marlborough Sun ", 380.0, " 0.75 ", Category.WINE);
        Product groundCoffee = new Product("Illy ", 222.0, " 0.25KG ", Category.COFFEE);
        Product instantCoffee = new Product("Jacobs ", 125.0, " 0.19KG ", Category.COFFEE);

        ArrayList<Product> allProducts = new ArrayList<>();
        allProducts.add(coconutMilk);
        allProducts.add(soyaMilk);
        allProducts.add(sparklingWine);
        allProducts.add(whiteWine);
        allProducts.add(groundCoffee);
        allProducts.add(instantCoffee);

        ArrayList<Product> milk = new ArrayList<>();
        ArrayList<Product> wine = new ArrayList<>();
        ArrayList<Product> coffee = new ArrayList<>();

        for (Product product: allProducts){
            switch (product.category){
                case  MILK: milk.add(product);
                    break;
                case WINE: wine.add(product);
                    break;
                case COFFEE: coffee.add(product);
                    break;
            }
        }

        int priceLessThan500 = 0;
        int nameWithParticleRo = 0;

        for (int i = 0; i < allProducts.size(); i++) {

            if (allProducts.get(i).getPrice() < 500) {
                priceLessThan500 = priceLessThan500 + 1;
            }
            if (allProducts.get(i).getName().matches("(.*)ro(.*)")) {
                nameWithParticleRo = nameWithParticleRo + 1;
            }
        }

        System.out.println("Products list: " +allProducts);
        System.out.print("\n");
        System.out.println("milk: " + milk);
        System.out.print("\n");
        System.out.println("wine: " + wine);
        System.out.print("\n");
        System.out.println("coffee: " + coffee);
        System.out.print("\n");
        System.out.println("price less than 500: " + priceLessThan500);
        System.out.print("\n");
        System.out.println("name with particle 'ro': " + nameWithParticleRo);

        System.out.print("\n");

        NameComparator nameComparator = new NameComparator();
        Collections.sort(allProducts, nameComparator);
        System.out.println("Alphabetic order: " + allProducts);

        System.out.print("\n");

        PriceComparator priceComparator = new PriceComparator();
        Collections.sort(allProducts, priceComparator);
        System.out.println("Price increases: " + allProducts);
        }
    }
