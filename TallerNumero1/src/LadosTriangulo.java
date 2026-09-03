public class LadosTriangulo {
    public static void main(String[] args) {
      // declaracion de variable 
      a = 3;
      b = 4;
      c = 5;

      // validacion de triangulo
      double esValido = (a + b > c) && (a + c > b) && (b + c > a);

    }
  }











/*
INICIO
  Leer a, b, c (tres lados)

  esValido = (a + b > c) Y (a + c > b) Y (b + c > a)

  SI NO esValido ENTONCES
    Imprimir "No es un triángulo válido"
  SI NO
    SI a == b Y b == c ENTONCES
      Imprimir "Equilátero"
    SI NO SI a == b O b == c O a == c ENTONCES
      Imprimir "Isósceles"
    SI NO
      Imprimir "Escaleno"
    FIN SI
  FIN SI
FIN
*/
