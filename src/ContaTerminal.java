

import java.util.Locale;
import java.util.Scanner;


     public class ContaTerminal { 
        /**
         * @param args
         */
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Número da Conta:  ");
            int conta = scanner.nextInt();

            System.out.println("Número da agência:  ");
            String agencia = scanner.next();

            System.out.println("Nome do cliente:  ");
            String nomeCliente = scanner.next();

             System.out.println("Saldo:  ");
             double saldo = scanner.nextDouble();

              System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco" );
              System.out.println("Agência" + agencia);
              System.out.println("Número da conta:" + conta);
              System.out.println("Saldo" + saldo + "Disponível para saque");








        }
    }
