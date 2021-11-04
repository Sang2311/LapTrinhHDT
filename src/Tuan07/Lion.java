package Tuan07;
public class Lion extends Animal {
    protected void  makeNoise(){
        if(hunger == 1){
        System.out.println ("Sư tử đang kêu");}
       
    }
    protected void eat (){
        System.out.println ("Sư tử đang ăn");
    }
    @Override
    protected void roam (){
        System.out.println("đi một mình");

    }
}
