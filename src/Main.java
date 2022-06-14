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
        int i=1;
        String massage1="";

        while(i<=10) {
            massage1=massage1+i+" ";
            i++;
        }
        System.out.println(massage1);
        String massage2="";
        for(int a=10;a>0;a--){
            massage2=massage2+a+" ";
        }
        System.out.println(massage2);
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
        int iterationYear=0;
        while(iterationYear<=plus100Year){
            if(iterationYear>=minus200Year&&iterationYear<=plus100Year){
                System.out.println(iterationYear);
            }
            iterationYear=iterationYear+cometPeriod;
        }
        System.out.println("----------------------------------------------------------------");
    }


}