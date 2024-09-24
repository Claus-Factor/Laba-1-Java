import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container<Person> container = new Container<>();

        boolean isContinue = true;
        while (isContinue) {
            System.out.println("\n*************************\nВыберите действие: ");
            System.out.println("1. Добавить человека в конец списка;");
            System.out.println("2. Добавить человека в начало списка;");
            System.out.println("3. Добавить человека на определенную позицию;");
            System.out.println("4. Удалить человека из списка по номеру;");
            System.out.println("5. Извлечь человека с конца;");
            System.out.println("6. Извлечь человека с начала;");
            System.out.println("7. Получить человека но номеру;");
            System.out.println("8. Узнать размер контейнера;");
            System.out.println("9. Выйти.");

            int key = scanner.nextInt();


            switch(key) {
                case 1: case 2: case 3: {
                    System.out.print("Имя: ");
                    String name = scanner.next();
                    System.out.print("Возраст: ");
                    int age = scanner.nextInt();
                    Person person = new Person(name, age);

                    if (key == 1) {
                        container.push(person);
                    } else if (key == 2) {
                        container.unshift(person);
                    } else {
                        System.out.print("Место вставки: ");
                        int number = scanner.nextInt();
                        container.add(person, number);
                    }

                    break;
                }
                case 8: {
                    System.out.println("Текущий размер хранилища: " + container.getSize());
                }
                case 9: {
                    isContinue = false;
                    System.out.println(container.getSize());
                    break;
                }

            }


        }





    }
}
