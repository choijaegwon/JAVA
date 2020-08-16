package exception;

​

public class AutoCloseObjTest {

public static void main(String[] args) {

try (AutoCloseObj obj = new AutoCloseObj()){

throw new Exception(); //강제 예외 발생

}catch(Exception e) {

System.out.println("예외 부분 입니다");

}

}

}

​

출력

리소스가 close() 되었습니다

예외 부분 입니다