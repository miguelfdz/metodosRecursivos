/*
Autor: Miguel A. Fernandez Marquez
Fecha de inicio: 5/12/18

Objetivo del programa:
Metodo recursivo que identifica si todos los digitos de un numero
son pares, impares o tiene ambos.
*/

class PrincipalC{  
   public static void main (String args[]){   
         /*
           Esta linea imprime un llamado a el metodo par que recibe dos parametros
           el numero y una variable booleana que empieza en false.
         */
   		System.out.println(par(4268,false));
   }
   
      public static String par(int n, boolean pares_e_impares){
		if (n<10 && n%2 == 0) {
			if (pares_e_impares == true) {
				return "El numero tiene digitos pares e impares";
			}
			else{ 
				return "todos los numeros son pares";
			}
		}
		 else if((n%10)%2==0){
			return par(n/10, false);
		}
			else{ 
				return impar(n/10, true);
			}
		}
   
   	public static String impar(int n, boolean pares_e_impares){
		if (n<10 && n%2 == 1) {
			if (pares_e_impares == true) {
				return "El numero tiene digitos pares e impares";
			}
			else {
				return "todos los numeros son impares";
			}
		}
		else if((n%10)%2==1){
			return impar(n/10, false);
		}
			else{
				return par(n/10, true);
			}
		}
}

