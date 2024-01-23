package ex04;

public class DogApp {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className ="ex04.Dog";

        Class cls = Class.forName(className);
        Object ob = cls.newInstance();
        Dog d = (Dog) ob;
        System.out.println(d.name);

    }
}

// 리플렉션으로 클래스 이름을 잡아서 set에 넣음
