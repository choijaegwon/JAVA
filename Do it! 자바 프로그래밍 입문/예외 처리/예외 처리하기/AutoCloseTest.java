package exception;

​

public class AutoCloseTest {

public static void main(String[] args) { 

try (AutoCloseObj obj = new AutoCloseObj()){

}catch(Exception e) {

System.out.println("예외 부분 입니다"); 

}

}

}

​

출력

리소스가 close() 되었습니다