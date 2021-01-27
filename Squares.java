//Создание простого двумерного массива, заполнение числами, вывод на экран

public class Squares {
    int i,j;
    int sqrs[][];



    void Squares(){
      this.met();
    }

    void met(){
        sqrs=new int[][]{
                {1,1},
                {2,4},
                {3,9},
                {4,8}
        };
        for (i=0;i<sqrs.length;i++){
            for (j=0;j<2;j++){
                System.out.print(sqrs[i][j]+" ");

            }System.out.println();
        }
    }
}
