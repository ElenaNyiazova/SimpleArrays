//Создание двумерного массива и вывод на экран чисел от 1 до 12

public class TwoD {
    int t,i;
    int table [][] = new int[3][4];
    void met(){
        for (t=0;t<table.length;++t){
            for (i=0;i<4;++i){
                table[t][i]=(t*4)+i+1;
                System.out.print(table[t][i]+" ");
            }
            System.out.println();
        }
    }
}