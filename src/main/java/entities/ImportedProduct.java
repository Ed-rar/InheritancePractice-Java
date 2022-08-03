package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.price + customsFee;
    }

    @Override
    public String priceTag(){
        StringBuilder stb = new StringBuilder();
        stb.append("\n");
        stb.append(name);
        stb.append(" $ ");
        stb.append(String.format("%.2f",totalPrice()));
        stb.append(" (Customs Fee: $ ");
        stb.append(customsFee);
        stb.append(")");

        return stb.toString();
    }
}
