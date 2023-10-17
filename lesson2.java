import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите наименование товара: ");
        String name = scanner.nextLine();
        System.out.print("Введите колчество товаров: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ваш адресс: ");
        String adress = scanner.nextLine();
        System.out.print("Ваш номер телеофна: ");
        double phone = scanner.nextDouble();
        System.out.printf("Ваш заказ принят. \nТовар %s в количестве %d прибудет к вам в ближайшее время. " +
                "Товар доставим по адресу: %s. Ваш контактный номер: %.0f. \n", name, num, adress, phone);
        scanner.close();
    }
}