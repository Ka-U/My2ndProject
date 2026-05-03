class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println(sum);
    }
}

class Task2 {
    public static void main(String[] args) {
        int count = 10;
        count += 2;
        System.out.println(count);
    }
}

class Task3 {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";
        System.out.println(first + " " + second);
    }
}

class Task4_1 {
    public static void main(String[] args) {
        String name = "Anna";
        int age = 20;
        String yearsOld = String.format("%s is %d", name, age);
        System.out.println(yearsOld);
    }
}

class Task4_2 {
    public static void main(String[] args) {
        String name = "Anna";
        int age = 20;
        System.out.println(name + " is " + age);
    }
}

class Task5 {
    public static void main(String[] args) {
        int x = 7;
        x += 5;
        x++;
        System.out.println(x);
    }
}