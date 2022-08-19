import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner lect= new Scanner(System.in);

        //sumar array de forma recursiva
        Lab1 lab1obj = new Lab1();
        int res=lab1obj.sum(new int[]{12,-1,15,2,4,14},0,0);
        System.out.println(res);


        //revertir un string
        System.out.println("Entre un string");
        String entrada= lect.nextLine();
        String resp=lab1obj.revertir(entrada,entrada.length()-1,"");
        System.out.println(resp);


        //promedio del array
        double respu=lab1obj.prom(new int[]{1,2,3,4,5,6},0,0);
        System.out.println(respu);

        //posicion de un elemento en el arreglo
        int[] posArr= new int[8];
        for(int i=0; i<= posArr.length-1; i++){
            System.out.println("Entre numeros");
            posArr[i]=lect.nextInt();
        }
        System.out.println("digite un numero para saber en cual posicion esta en el arreglo");
        int numb= lect.nextInt();
        int respue= lab1obj.pos(posArr,numb,0);
        System.out.println(respue);

        //capacidad de la maleta
        int[] capacidad=new int[8];
        System.out.println("peso de lonchera");
        capacidad[0]= lect.nextInt();
        System.out.println("peso de computador");
        capacidad[1]= lect.nextInt();
        System.out.println("peso de cuaderno");
        capacidad[2]= lect.nextInt();
        System.out.println("peso de manzana");
        capacidad[3]= lect.nextInt();
        System.out.println("peso de lapiz");
        capacidad[4]= lect.nextInt();
        System.out.println("peso de lapicero");
        capacidad[5]= lect.nextInt();
        System.out.println("peso de sacapuntas");
        capacidad[6]= lect.nextInt();
        System.out.println("peso de borrador");
        capacidad[7]= lect.nextInt();

        int respues=lab1obj.capacity(capacidad,500,0,0);



    }
}
