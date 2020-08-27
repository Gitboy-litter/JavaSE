package day14_02.work3;

public class Son extends Father {
//    @Override
//    public void eat(String s) throws PainExecption{
//        throw new PainExecption("牙疼");
//    }
//    @Override
//    public void eat(String s) throws TonguePainException{
//        throw new TonguePainException("牙疼");
//    }
//    @Override
//    public void eat(String s) throws ToothPainException {
//        throw new ToothPainException("牙痛");
//    }
//    @Override
    public void eat(String s) throws FrontToothPainExcption,BigToothPainException{
        if (s=="石头"){
            throw new BigToothPainException("大牙疼");
        }else {
            throw new FrontToothPainExcption("门牙疼");
        }
    }

    @Override
    public void drink(){
        try {
            System.out.println("喝到了100度的水");
            throw new TonguePainException();
        } catch (TonguePainException e) {
            e.printStackTrace();
        }
    }
}
