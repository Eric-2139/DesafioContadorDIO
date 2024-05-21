import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } 
        catch (ParametrosInvalidosException e) {
            System.out.println("O parametro um deve ser maior que o parametro dois");
        }

        terminal.close();
    }

    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        if (parametroDois > parametroUm) {
            for (int contagem = parametroUm; contagem <= parametroDois; contagem++) {
                System.out.println(contagem);
            }
        }
    }
}
