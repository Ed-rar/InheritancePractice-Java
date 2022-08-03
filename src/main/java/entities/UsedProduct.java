package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private Date manufactureDate;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        StringBuilder stb = new StringBuilder();
        stb.append("\n");
        stb.append(name);
        stb.append(" (used) $ ");
        stb.append(String.format("%.2f",price));
        stb.append(" (Manufacture date: ");
        stb.append(sdf.format(manufactureDate));
        stb.append(")");

        return stb.toString();
    }
}
