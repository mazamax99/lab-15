class Gen<T>{
    T ob;//  объявить  объект  типа  Т
    Gen(T o){
        ob=o;
    }
    T getob(){
        return ob;
    }
    void showType(){
        System.out.println("Типом T является "+ ob.getClass().getName());
    }
}

class GenDemo {

    public static void main(String[] args){
        //  Создать  ссылку  типа  Gen  для  целых  чисел
        Gen< Integer>  iOb ;
        iOb  =  new  Gen< Integer> ( 88);
        iOb . showType();
        int v = iOb.getob();
        System.out.println("Значение: "+v);
        System.out.println();
        Gen<String> strOb=new Gen<String>("Текст обобщений");
        strOb.showType();
        String  str = strOb.getob();
        System.out.println("Знaчeниe: "+ str) ;
    }
}
