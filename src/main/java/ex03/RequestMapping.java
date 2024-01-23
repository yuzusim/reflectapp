package ex03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 발동시점 -> 컴파일 시점에서 툴이 본다.

@Retention(RetentionPolicy.RUNTIME) // 어노테이션 발동시점 -> 실행시 발동
@Target(ElementType.METHOD) // 어노테이션 위치붙이는 곳

public @interface RequestMapping {
    String uri(); //아이덴티티 파이? 끝에 붙어 있는 슬래쉬?
}
