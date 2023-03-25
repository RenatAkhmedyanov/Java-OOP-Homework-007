public class Smartphone extends MobilePhone implements SendingEmail {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void sendEmail() {
        System.out.println("Отправляет email");
    }
}
