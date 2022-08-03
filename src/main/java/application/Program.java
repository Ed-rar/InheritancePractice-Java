package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import util.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Program {

    static List<Product> listOfProducts = new ArrayList<Product>();

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int n = Utils.inputInt();

        for(int i = 0; i<n; i++){
            System.out.print("Product #"+(i+1)+" data:\n");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = Utils.inputChar();

            switch (option){

                case 'c':
                case 'C':
                    System.out.print("Name: ");
                    String name = Utils.inputString();
                    System.out.print("Price: ");
                    double price = Utils.inputDouble();

                    Product product = new Product(name, price);
                    listOfProducts.add(product);
                    break;

                case 'u':
                case 'U':
                    System.out.print("Name: ");
                    String nameUsed = Utils.inputString();
                    System.out.print("Price: ");
                    double priceUsed = Utils.inputDouble();
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date manufactureDate = sdf.parse(Utils.inputString());

                    Product productUsed = new UsedProduct(nameUsed, priceUsed, manufactureDate);
                    listOfProducts.add(productUsed);
                    break;

                case 'i':
                case 'I':
                    System.out.print("Name: ");
                    String nameImported = Utils.inputString();
                    System.out.print("Price: ");
                    double priceImported = Utils.inputDouble();
                    System.out.print("Customs Fee: ");
                    double customsFee = Utils.inputDouble();

                    Product productImported = new ImportedProduct(nameImported, priceImported, customsFee);
                    listOfProducts.add(productImported);
                    break;

                default:
                    System.out.println("Choose a valid option!");
                    i--;
            }
        } Utils.closeScanner();

        System.out.println("PRICE TAGS: ");
        for(Product pdt : listOfProducts){
            System.out.print(pdt.priceTag());
        }
    }

}
