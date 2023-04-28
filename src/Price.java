import java.util.Scanner;

public class Price {
    int kil;
    double bonuses;
    char isb;
    double price=0.0;

    public Price(int kil, char isb) {
        this.kil = kil;
        this.isb = isb;
    }

    void pricesheet (int k){
        Scanner scan = new Scanner(System.in);
        for (int i=0;k<i;i++){
            System.out.print("Введіть ціну товару: ");
            double prcone=scan.nextInt();
            price+=prcone;
        }
        System.out.println(price);
    }
}

