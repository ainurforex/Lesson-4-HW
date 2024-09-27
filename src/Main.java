public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("-                         Home Works                           -");
        System.out.println("----------------------------------------------------------------");
        homeWork1();
        homeWork2();
        homeWork3();

    }
    public static  void homeWork1(){
        System.out.println("Home work 1");
        int i=0;

        while(i<10) {
            System.out.print(++i+" ");
        }
        System.out.println();

        for(;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
    }
    public static  void homeWork2(){

        System.out.println("Home work 2");
        int dayOfFriday=1;
        while (dayOfFriday<=31){
            System.out.println("Сегодня пятница, "+dayOfFriday+"-е число. Необходимо подготовить отчет.");
            dayOfFriday=dayOfFriday+7;
        }

        System.out.println("----------------------------------------------------------------");
    }
    public static  void homeWork3(){
        System.out.println("Home work 3");
        int currentYear=2022;
        int minus200Year=currentYear-200;
        int plus100Year=currentYear+100;
        int cometPeriod=79;

        for(int year=minus200Year;year<=plus100Year;year++){
            if(year%cometPeriod==0){
                System.out.println(year);
            }

        }
        System.out.println("----------------------------------------------------------------");
    }


}