import ru.netology.sqr.SQRService;

public class main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        int numbersOfSQR = service.calculate(200,300);
        System.out.println("Колличество квадратов: " + numbersOfSQR);
    }
}
