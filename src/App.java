public class App {
    public static void main(String[] args) throws Exception {
        try {
            int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de los calcetines: "));
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i <= altura - 2 && j < 3) {
                        System.out.print("*");
                    } else if (i >= altura - 2 && j < 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = 0; j < 8; j++) {
                    if (i <= altura - 2 && j < 3) {
                        System.out.print("*");
                    } else if (i >= altura - 2 && j < 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Número mal introducido.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}