public class Main {
    public static void main(String[] args) {

        // Задание 1

        int i = 0;
        while(i<10){
            i++;
            System.out.print(i + " ");
        }
        System.out.print('\n');
        for(i=10; i>0; i--){
            System.out.print(i + " ");
        }

        System.out.println('\n');

        // Задание 2

        int f = 3; // первая пятница месяца
        i = 1;
        while(i<=31){
            if(i==f || (i-f)%7 == 0){
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчёт.");
            }
        i++;
        }

        System.out.println('\n');

        // Задание 3

        int nowYear = 2022;
        for(i=nowYear-200;i<=(nowYear+79);i++){
            if(i%79 == 0){
                System.out.println(i);
            }
        }

        System.out.println('\n');

        // Задание 4

        for(i=1;i<=30;i++){
            if(i%3==0 && i%5==0) {
                System.out.println(i + ": ping pong");
            }
            else if(i%3 ==0){
                System.out.println(i + ": ping");
            }
            else if(i%5 ==0){
                System.out.println(i + ": pong");
            }
            else{
                System.out.println(i + ": ");
            }
        }
        System.out.println('\n');

        // Задание 5
        int k = 0;
        int j = 1;
        int fibonacci = k + j;
        System.out.print(k + " " + j + " " + fibonacci);
        for(i=4; i <=10; i++){
            k = j;
            j = fibonacci;
            fibonacci = k + j;
            System.out.print(" " + fibonacci);
        }


    }
}