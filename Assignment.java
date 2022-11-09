public class Assignment {
    private String types;
    private int price;

    //오버 로딩
    public Assignment(String types) {
        this.types = types;
    }

    public Assignment(String types, int price) {
        this.types = types;
        this.price = price;
    }

    public void info(String types, int price) {
        System.out.println("이" + types + "는 " + price + "원 입니다.");
    }

    public void info() {
        System.out.println("상의 코너입니다.");
    }
}

class Pants extends Assignment {
    private String types;
    private int price;

    public Pants(String types) {
        super(types);
    }

    public Pants(String types, int price) {
        super(types, price);
    }
    //오버라이딩
    @Override
    public void info() {
        System.out.println("바지 코너입니다.");
    }
}
