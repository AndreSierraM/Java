import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println(" MENU DEL SISTEMA DEL COLEGIO");
        System.out.println(" ");
        System.out.println(" 1. Inscribir Alumno");
        System.out.println(" 2. Mostrar Datos de los alumnos de un Grado");
        System.out.println(" 3. Pagar Matrícula");
        System.out.println(" 0. Salir");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la opcion que desea realizar");
        int opcion = sc.nextInt();

        do {
            switch (opcion) {
                case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese el nombre del estudiante");
                String nombre = sc.next();
                System.out.println("Ingrese el apellido del estudiante");
                String apellido = sc.next();
                System.out.println("Ingrese la edad del estudiante");
                int edad = sc.nextInt();
                System.out.println("Ingrese la identificacion del estudiante");
                String identificacion = sc.next();
                System.out.println("Ingrese el barrio del estudiante");
                String barrio = sc.next();
                System.out.println("Ingrese el grado del estudiante");
                String grado = sc.next();
                if (grado.equals("1") || grado.equals("2") || grado.equals("3") || grado.equals("4") || grado.equals("5")) {
                    Alumno alumno = new Alumno(nombre, apellido, edad, identificacion, barrio, grado);
                    Main.alumnos.add(alumno);
                } else {
                    System.out.println("Ingrese la especialidad del estudiante");
                    System.out.println("I. Idiomás");
                    System.out.println("E. Electricidad");
                    System.out.println("S. Sistemas");
                    System.out.println("P. Pedagogía");
                    String especialidad = sc.next();
                    especialidad = especialidad.toUpperCase();
                    Alumno alumno = new Alumno(nombre, apellido, edad, identificacion, barrio, grado, especialidad);
                    Main.alumnos.add(alumno);
                    
                }
            }
                    Alumno.Imprimir_Grado();
                    break;

                case 2:
                    /*
                     * Mostrar Datos de los alumnos de un Grado: Para este caso debe definirse un
                     * método llamado
                     * Imprimir_Grado el cual debe imprimir por pantalla los datos de los alumnos
                     * de un grado
                     * seleccionado por el usuario, para el grado 6 a 11 debe imprimir por pantalla los
                     * datos de la especialidad 
                     */
                    Alumno.Imprimir_Grado();
                    

                    break;
                case 3:
                    /*
                     * Pagar Matrícula: Para el cálculo del valor de la matrícula debe definirse un
                     * método llamado
                     * Calcular_Pago el cual debe imprimir por pantalla la matrícula de la siguiente
                     * manera: Para los
                     * Grados de 1 a 5 imprimir el valor de la matrícula de la tabla, mientras que
                     * para los grados de 6
                     * a 10 debe imprimir por separado valor de matrícula y valor que pagará por la
                     * especialidad
                     * seleccionada según la segunda tabla, para el grado 11 debe imprimir por
                     * pantalla el valor a
                     * pagar por matricula, el valor a pagar por la especialidad y el valor a pagar
                     * por los Derechos de
                     * Grado.
                     */
                default:
                    System.out.println("Opcion no valida");
                    break;

            }

        }while(opcion!=0);

}}
