class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = a+b;
        System.out.println(sum);
    }
}

//2 задание
class Main2 {
    public static void main(String[] args) {
        int count = 10;
        count = count + 2;
        System.out.println(count);
    }
}

//3 задание (1 вариант)
class Main3 {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";
        System.out.println("Hello " + "World");
    }
}

//3 задание (2 вариант)
class Main4 {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";
        System.out.println("Hello" + " " + "World");
    }
}

//4 задание (1 вариант - сделала на примере урока 5)
class Main5 {
    public static void main(String[] args) {
        String name = "Anna";
        int age = 20;
        String yearsOld = String.format("%s is %d", name, age);
        System.out.println(yearsOld);
    }
}

//4 задание (2 вариант - попроще, без еще одной дополнительной строки)
class Main6 {
    public static void main(String[] args) {
        String name = "Anna";
        int age = 20;
        System.out.println(name + " is " + age);
    }
}

//5 задание (1 вариант)
class Main7 {
    public static void main(String[] args) {
        int x = 7;
        int sum1 = x + 5;
        int sum2 = sum1 + 1;
        System.out.println(sum2);
    }
}

//5 задание (2 вариант)
class Main8 {
    public static void main(String[] args) {
        int x = 7;
        x += 5;
        x ++;
        System.out.println(x);
    }
}

//5 задание (3 вариант)
class Main9 {
    public static void main(String[] args) {
        int x = 7;
        x = x + 5;
        x = x +1;
        System.out.println(x);
    }
}

//Впросы и ответы на вопросы

//1. Что такое переменная в Java?
//Переменная — это область памяти с назначенным именем, где можно хранить и менять данные.

//2. Что такое зона видимости переменной?
//Зона видимости— это блок программы, где переменную можно использовать. За пределами блока переменная
// не существуети к ней нельзя обратиться.
//Фигурные скобки {} определяют зону видимости.

//3. Что будет, если создать две переменные с одинаковым именем в одном блоке?
//Будет ошибка компиляции.
//В Java нельзя создать две переменные с одинаковым именем в одном блоке (в одной зоне видимости).

//4. Назови 3 примитивных типа в Java.
//Byte, boolean, int

//5. Чем примитив отличается от ссылочного типа?
//Примитив хранит само значение, ссылочный тип хранит адрес (ссылку) на значение в памяти.

//6. Что произойдёт, если присвоить int b = a, а потом изменить a?
// b будет присвоено значение а, которое было задано изначально, у а будет значение на которое изменили.
//Изменение а не влияет на b, так как это независимые переменные.

//7. Почему String ведёт себя не как int, хотя тоже переменная?
//Это переменные разных типов. String — это ссылочный тип данных, int — это примитивный тип данных.

//8. Что хранит переменная-ссылка: сам объект или адрес на объект?
//Адрес на объект.

//9. Что такое String?
//String — это последовательность символов (текст). По сути, это строчка букв, цифр и знаков.
//String = текстовая строчка.

//10. Чем отличается trim() от toUpperCase()?
//trim() — удаляет пробелы с начала и конца строки.
//toUpperCase() — преобразует все буквы в ЗАГЛАВНЫЕ.

//11. Как получить длину строки?
//Использовать метод length()

//12. Как соединить две строки?
//Использовать оператор + или использовать метод String.format()

//13. Что вернёт "Hello".toUpperCase()?
//Вернёт "HELLO" так как метод toUpperCase() преобразует все буквы в заглавные.

//14. Что вернёт "  Hi  ".trim()?
//Вернёт "Hi" так как метод trim() удаляет пробелы в начале и конце строки.

//15. Можно ли менять строку после создания?
//Строки в Java — иммутабельны (неизменяемы). Это одно из самых важных свойств String.

//Узнала новое слово иммутабельны))))