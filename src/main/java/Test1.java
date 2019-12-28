import sun.awt.geom.AreaOp;

public class Test1 {
    public static void replace1(){
        for(int  i = 1; i <= 100; i++){

            int flag = 0;
            if(i % 3 == 0){
                flag = 1;
            }
            if( i % 5 == 0){
                flag += 2;
            }
            switch (flag){
                case 0:
                    System.out.print(i+" ");
                    break;
                case 1:
                    System.out.print("Fizz ");
                    break;
                case 2:
                    System.out.print("Buzz ");
                    break;
                default:
                    System.out.print("FizzBuzz ");
            }
        }
    }
    public static void replace2(){
        for(int i = 1;i <= 100 ;i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("FizzBuzz ");
                continue;
            }else if(i % 3 == 0){
                System.out.print("Fizz ");
                continue;
            }else if(i % 5 == 0){
                System.out.print("Buzz ");
                continue;
            }else{
                System.out.print(i+" ");
            }
        }

    }


    public static void main(String args[]) {
       // replace1();
       // System.out.println();
       // replace2();


        for (int i = 1; i <= 100 ; i++) {
            String result = of(i);
            System.out.print(result+" ");
        }
    }

    static String of(int i) {
        if((i % 3 == 0) && (i % 5 == 0)){
            return "FizzBuzz ";
        }else if(i % 3 == 0){
            return "Fizz ";
        }else if(i % 5 == 0){
            return "Buzz ";
        }else{
            return String.format("%d ", i);
        }
    }



}
