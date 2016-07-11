package helloworld.algorithms;

public class Fibonacci {
    public int calculate(int index) {
            if(index < 0){
                throw new IllegalArgumentException();
            }
            else if(index == 1 || index == 2){
                return 1;
            }
            else {
                int x = 0;
                int y = 1;
                int temp = 0;
                for(int i = 0; i < index; i++){
                    temp = x + y;
                    x = y;
                    y = temp;
                }
                return y;
            }

    }
}