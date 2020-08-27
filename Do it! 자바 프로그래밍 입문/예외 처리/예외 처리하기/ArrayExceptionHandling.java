package exception;

​

public class ArrayExceptionHandling {

public static void main(String[] args) {

int[] arr = new int[5];

​

try{

for(int i = 0; i<=5; i++) { //예외가 발생할 수 있으므로 try 블록에 작성

arr[i] = i;

System.out.println(arr[i]);

}

}catch(ArrayIndexOutOfBoundsException e){

System.out.println(e); //예외가 발생하면 catch블록 수행

System.out.println("예외 처리 부분");

}

System.out.println("프로그램 종료");

}

}

​

출력

0

1

2

3

4

java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

예외 처리 부분

프로그램 종료