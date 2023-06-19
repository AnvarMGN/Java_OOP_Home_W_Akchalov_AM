//import java.io.File;

public class Program {
    /**
     * 
     * Доработать приложение (семинар, пакет srp2) в рамках понимания работы принципов SOLID.
     * Переработать приложение с учетом принципа SPR.
     */
    public static void main(String[] args) {
        
        Order order = new Order("", "", 0, 0);
        Save saver = new Save();
        Load loader = new Load();

        System.out.println("Введите заказ:");
        loader.inputFromConsole(order);
        saver.saveToJson(order);
        // saver.saveToXML(order);
        // saver.saveToTxt(order);
        
        // loader.loadFromJson(new File("HomeWork6_Lesson6/order.json"), order);
        // System.out.println(order);
    }
}
