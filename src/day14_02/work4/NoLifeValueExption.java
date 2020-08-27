package day14_02.work4;

public class NoLifeValueExption extends RuntimeException{
    public NoLifeValueExption() {
    }

    public NoLifeValueExption(String message) {
       super(message);
    }

}
