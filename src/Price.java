import java.util.Scanner;

public class Price {
    int kilkist;
    double bonuses;
    double price = 0.0;

    public Price() {
    }

    void pricesheet (int kilkist) {
//        Обчислення чеку без бонусів
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < kilkist; i++) {
            System.out.print("Введіть ціну " + (i + 1) + " товару: ");
            double prcone = scan.nextDouble();
            price += prcone;
        }
        System.out.println("Кінцева вартість товарів: "+price+" гривень (без бонусів)");
    }

    void pricesheet (int kilkist, double bonuses) {
//        Обчислення чеку з бонусами
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<kilkist;i++){
            System.out.print("Введіть ціну "+(i+1)+" товару: ");
            double prcone=scan.nextDouble();
            price+=prcone;
        }
        price-=bonuses;
        System.out.println("Кінцева вартість товарів: "+price+" гривень");
    }





}

