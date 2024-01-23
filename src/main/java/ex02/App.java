package ex02;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) {
        String path = "/update-password";

        UserController con = new UserController();

        Method[] methods = con.getClass().getDeclaredMethods(); // 그 안에 메서드 다담아
        System.out.println(methods.length);

        for(Method method : methods){
            //System.out.println(method.getName());s
            //Annotation anno = method.getDeclaredAnnotation(RequestMapping.class);
            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class); // 다운 캐스팅 안해도 들어감

            if (rm == null) continue;
            if (rm.uri().equals(path)) {
                try {
                    method.invoke(con); // con.login();때린거랑 같음, 메서드를 리플렉션으로 호출할 수 있다.
                    // 여러개 중 어떤 것을 호출할지 모르고 힙이 여러개 있을 수 있기 때문에 con 필요
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
