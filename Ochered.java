//Создание очереди, без удаления вложеных чисел


public class Ochered {
    int mass[]=new int[10];
    int input=0;
    int output=0;
    void get(int x){// положить число
        if (input==mass.length){
            System.out.println("Массив заполнен");
        } else mass[input]=x; input++;
    }
    int set(){// взять число
        if(input==output&input==0){
            System.out.println("Массив пуст");
            return 0;
        } else if(input-1==output){
            System.out.println("Массив опусташен");
            return 0;
        } else {
            output++;
            System.out.println(mass[output-1]);
            return mass[output-1];

        }
    }
}
