import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Questao2 {

    static long fibonacci(int n) {
        return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int value = sc.nextInt();
        for (int i = 0; i < 30; i++) {
                if (value == fibonacci(i)) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(Questao2.fibonacci(j) + "\t");
                    }
                    System.exit(0);
                }
            }
        System.out.println("Não existe na sequência fibonacci.");
        }
    }

