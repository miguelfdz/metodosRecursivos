/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 5/12/18

Objetivo del programa:
Metodo recursivo que obtiene el cuadrado de un numero.
*/


class PrincipalP {
	public static void main(String[] args) {
      /*
        Esta linea imprime un llamado a el metodo cuadrado que recibe cuatro 
        parametros, el primero es el numero del que se quiere obtener el cuadrado, 
        el segundo es un contador, el tercero es cuenta los numeros impares ddel contador 
        y el cuarto es el resultado del cuadrado del numero.
      */
		System.out.println(cuadrado(6, 0, 0, 0));
	}
	
	public static int cuadrado(int n, int cont, int numImpares, int res){
		if (numImpares>=n) {
			return res;
		}
      if (cont%2 == 0) {        
         return cuadrado(n, cont+=1, numImpares+1, res+=cont);
      }
		else {
			return cuadrado(n, cont+=1, numImpares, res);
		}
	}
}

