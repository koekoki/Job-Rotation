import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class Questao4 {
    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.0");
        double  SP = 67836.43,
                RJ = 36678.66,
                MG = 29229.88,
                ES = 27165.48,
                Outros = 19849.53;

        double somaTotal = SP + RJ + MG + ES + Outros;

        double  pSP = (SP * 100)/somaTotal,
                pRJ = (RJ * 100)/somaTotal,
                pMG = (MG * 100)/somaTotal,
                pES = (ES * 100)/somaTotal,
                pOutros = (Outros * 100)/somaTotal;

        System.out.println("São Paulo: R$"+SP+"  -  "+deci.format(pSP)+"%");
        System.out.println("Rio de Janeiro: R$"+RJ+"  -  "+deci.format(pRJ)+"%");
        System.out.println("Minas Gerais: R$"+MG+"  -  "+deci.format(pMG)+"%");
        System.out.println("Espírito Santos: R$"+ES+"  -  "+deci.format(pES)+"%");
        System.out.println("Outros: R$"+Outros+"  -  "+deci.format(pOutros)+"%");
    }
}
