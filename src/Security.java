class NonGen{
    Object ob;
    NonGen(Object o){
    ob=0;
    }
    Object getob(){
        return ob;
    }
    void showType(){
        System.out.println("Объект относится к типу:  "+ ob.getClass().getName());
    }
}

class Security {
    public static void main(String[] args){
        //  Создать  ссылку  типа  Gen  для  целых  чисел
        NonGen  iOb ;
        iOb  =  new NonGen ( 88);
        iOb.showType();
        int v = (Integer)iOb.getob();
        System.out.println("Значение: "+v);
        System.out.println();
        NonGen strOb=new NonGen("Текст без обобщений");
        strOb.showType();
        String  str =(String) strOb.getob();
        System.out.println("Знaчeниe: "+ str) ;
        iOb=strOb;
        v=(Integer)iOb.getob();
    }
}
