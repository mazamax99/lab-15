class TwoGenHandle<T,V> {
    T ob1;
    V ob2;
    TwoGenHandle(T o1,V o2){
        ob1=o1;
        ob2=o2;
    }
    void showTypes(){
        System.out.println("Тип T:  "+ ob1.getClass().getName());
        System.out.println("Тип V:  "+ ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}


class TwoGen {
    public static void main(String[] args) {
        TwoGenHandle<Integer,String>tgObj=new TwoGenHandle<Integer,String>(88,"Обобщения");
        tgObj.showTypes();
        int v=tgObj.getOb1();
        System.out.println("Значение: "+v);
        String str=tgObj.getOb2();
        System.out.println("Значение: "+str);
    }
    }
