public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println( " Задача 1 ");
        int age = 19;
        if ( age >= 18 ) {
            System.out.println(" Если возраст человека равен " + age + " , то он совершеннолетний. ");
        }
        age = 17;
        if ( age < 18 ) {
            System.out.println(" Если возраст человека равен " + age +
                    " , то он не достиг совершеннолетия, нужно немного подождать. ");
        }
        // Задача 2
        System.out.println( " Задача 2 ");
        int temperature = 3;
        if ( temperature < 5 ) {
            System.out.println(" На улице " + temperature + " градуса нужно надеть шапку. "); }
        temperature = 7;
        if ( temperature > 5 ) {
            System.out.println(" На улице " + temperature + " градусов можно идти без шапки. "); }
        // Задача 3
        System.out.println( " Задача 3 ");
        int speed = 70;
        if ( speed > 60 ) {
            System.out.println(" Если скорость " + speed + " , то придется заплатить штраф. "); }
        speed = 50;
        if ( speed < 60 ) {
            System.out.println(" Если скорость " + speed + " можно ездить спокойно. "); }
        // Задача 4
        System.out.println( " Задача 4 ");
        age = 3;
        if ( age > 2 && age < 6 ) {
            System.out.println(" Если возраст человека равен " + age +
                    " , то ему нужно ходить в детский сад. "); }
        age = 10;
        if ( age > 7 && age < 17 ) {
            System.out.println(" Если возраст человека равен " + age + " , то ему нужно ходить в школу. "); }
        age = 19;
        if ( age >= 18 && age <= 24 ) {
            System.out.println(" Если возраст человека равен " + age +
                    " , то ему нужно ходить в университет. "); }
        age =26;
        if ( age < 24 ) {
            System.out.println(" Если возраст человека равен " + age +
                    " , то ему можно не ходить на работу. "); }
        else {
            System.out.println(" Если возраст человека равен " + age +
                    " , то ему нужно ходить на работу. "); }
        // Задача 5
        System.out.println( " Задача 5 ");
         age = 3;
        if ( age < 5 ) {
            System.out.println(" Если возраст ребенка равен " + age +
                    " , то ему нельзя кататься на аттракционе. "); }
        age = 8;
        if ( age > 5 && age < 14 ) {
            System.out.println(" Если возраст ребенка равен " + age +
                    " , то ему можно кататься на аттракционе в сопровождении взрослого. "); }
        age = 16;
        if ( age < 14 ) {
            System.out.println(" Если возраст ребенка равен " + age +
                    " , то ему можно кататься на аттракционе в сопровождении взрослого. "); }
        else {
            System.out.println(" Если возраст ребенка равен " + age +
                    " , то ему можно кататься на аттракционе без сопровождения взрослого. "); }
        // Задача 6
        System.out.println( " Задача 6 ");
        var passengers = 56;
        var freeSeats = 60 - passengers;
        var freeStands = 102 - passengers;
        if ( freeSeats > 0 ) {
            System.out.println(" Свободных сидячих мест " + freeSeats ); }
        else if ( freeStands > 0 ) {
            System.out.println(" Свободных стоячих мест " + freeStands ); }
        else {
            System.out.println(" Вагон переполнен. " ); }
        // Задача 7
        System.out.println( " Задача 7 ");
        int one = 15;
        int two = 9;
        int three = 12;
        if ( one > two && one > three ) {
            System.out.println(" Наибольшее значение равно " + one ); }
        else if ( two > three ) {
            System.out.println(" Наибольшее значение равно " + two ); }
        else System.out.println( " Наибольшее значение равно " + three );
    }}