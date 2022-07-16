package main;

public class Main {
    public static void main(String[] args)
    {
        queEs(1);
        bucleWhile(1);
        bucleDW(2);
        bucleFor();
        switchCase(2);
    }

    public static void queEs(int numeroIf)
    {
        if (numeroIf > 0)
        {
            System.out.println("Es positivo");
        }
        else if (numeroIf < 0)
        {
            System.out.println("Es negativo");
        }
        else
        {
            System.out.println("Es cero");
        }
    }

    public static void bucleWhile(int numeroWhile)
    {
        if (numeroWhile < 3)
        {
            while (numeroWhile < 3)
            {
                numeroWhile++;
                System.out.println("While: " + numeroWhile);
            }
        }
    }

    public static void bucleDW(int numeroDW)
    {
        int cantidad = 0;

        if (numeroDW < 3)
        {
            do
            {
                numeroDW++;
                cantidad++;
                System.out.println("DW: " + numeroDW);
            } while(cantidad == 0);
        }
    }

    public static void bucleFor()
    {
        for(int numeroFor = 0; numeroFor < 3; numeroFor++)
        {
            System.out.println("For: " + numeroFor);
        }
    }

    public static void switchCase(int estacion)
    {
        switch (estacion) {
            case 1:
            {
                System.out.println("Verano");
                break;
            }
            case 2:
            {
                System.out.println("Otroño");
                break;
            }
            case 3:
            {
                System.out.println("Invierno");
                break;
            }
            case 4:
            {
                System.out.println("Primavera");
                break;
            }
            default:
            {
                System.out.println("No es una estacion");
                break;
            }
        }
    }
}
