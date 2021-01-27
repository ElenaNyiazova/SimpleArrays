//Создание стека, без удаления вложеных чисел

public class Stak {
    int mass[]=new int[10];
    int input=0;
    int output=0;

    void put(int x){
        if(input<mass.length){
            mass[input]=x;
            input++;
            output++;
        } else System.out.println("Массив полон");
    }
    int get(){
        if(output==0){
            System.out.println("Массив пуст");
            return 0;
        }else {
            output--;
            return mass[output];
        }
    }
}
