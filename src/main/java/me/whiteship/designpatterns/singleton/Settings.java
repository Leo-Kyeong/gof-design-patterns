package me.whiteship.designpatterns.singleton;

/**
 * 시스템 런타임, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있다.
 * 인스턴스를 오직 한 개만 만들어 제공하는 클래스가 필요하다.
 */
public class Settings {

    private static Settings instance;

    /**
     * new 키워드를 통해서 인스턴스를 만들지 못하도록 기본 생성자의 접근 제어자를 private 으로 만들어준다.
     */
    private Settings() {
    }

    /**
     * 글로벌(static)하게 접근할 수 있으며, 동일한 인스턴스를 반환해준다.
     * 하지만 멀티 스레드 환경에서 안전하지 않다.
     */
    public static Settings getInstance(){
        if(instance == null){
            instance = new Settings();
        }
        return instance;
    }
}
