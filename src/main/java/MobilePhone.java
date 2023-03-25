public class MobilePhone extends Phone implements SendingSMS{
    public MobilePhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void sendSMS() {
        System.out.println("Отправляет смс");
    }
}
