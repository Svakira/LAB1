public class Lab1 {
    //sumar array de forma recursiva
    public int sum(int[] arr, int index, int acumulador){

            //caso base
            if(index == arr.length){
                return acumulador;
            }
        System.out.println(arr[index]);
            //llamado recursivo
        return sum(arr,index+1,acumulador+arr[index]);

    }
    //revertir un string
    public String revertir (String entrada, int index, String acum){
        if(index==-1){
            return acum;
        }
        return revertir(entrada,index-1, acum+entrada.charAt(index));
    }
    //promedio del array
    public Double prom (int[] arr, int index, double acumul){
        //caso base
        if(index == arr.length){
            return acumul/ arr.length;
        }
        //llamado recursivo

        return prom(arr,index+1,acumul+arr[index]);
    }
    //posicion de un elemento en el arreglo
    public int pos (int []posArr,int numb, int acumula){
        //caso base
        if(posArr[acumula]==numb){
            return acumula;
        }
        //recursividad
        return pos(posArr,numb,acumula+1);
    }
    //capacidad de la maleta
    public int capacity(int []capacidad, int lim,int cont, int indi){
        //caso base

        //cont!=lim
        if(){
            return capacity(capacidad,lim,cont+capacidad[indi],indi+1);
        }
        else{
            return cont;
        }

    }
}
