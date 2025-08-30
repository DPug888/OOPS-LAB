// Abstract class
abstract class Furniture {
    abstract void purpose();
}

// Single Inheritance: Chair inherits Furniture
class Chair extends Furniture {
    @Override
    void purpose() {
        System.out.println("Chair is used for sitting.");
    }
}

// Multilevel Inheritance: OfficeChair → Chair → Furniture
class OfficeChair extends Chair {
    void rotate() {
        System.out.println("Office Chair can rotate.");
    }
}

// Hierarchical Inheritance: Table also inherits Furniture
class Table extends Furniture {
    @Override
    void purpose() {
        System.out.println("Table is used for placing items.");
    }
}

public class FurnitureDemo {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.purpose();

        OfficeChair officeChair = new OfficeChair();
        officeChair.purpose(); // from Chair
        officeChair.rotate();

        Table table = new Table();
        table.purpose();
    }
}
