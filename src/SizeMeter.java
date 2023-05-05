public class SizeMeter {
    double height;
    char bs;
    int age;

    public SizeMeter() {
    }

    void whatsize(double height) {
        char bs;
        if (height <= 170) {
            bs = 'S';
            System.out.println("Ur size is: " + bs);
        } else if (height > 170 && height <= 176) {
            bs = 'M';
            System.out.println("Ur size is: " + bs);
        } else if (height > 176 && height <= 182) {
            bs = 'L';
            System.out.println("Ur size is: " + bs);
        } else if (height > 182) {
            bs = 'L';
            System.out.println("Ur size is: X" + bs);
        }
    }
    void whatsection(int age) {
        if (age<10) System.out.println("Розділ для дітей");
        else if (age<18) System.out.println("Розділ для підлітків");
        else if (age<65) System.out.println("Розділ для дорослих");
        else System.out.println("Розділ для пенсіонерів");
    }

}
