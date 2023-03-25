public class Fax extends Phone implements SendingFax {
    public Fax(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void sendFax() {
        System.out.println("Отправляет факс");
    }
}
