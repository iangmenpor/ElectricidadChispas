import java.util.*;

public class Main {

    public static void main(String[] args) {
        //-Variable globales
        String codigo, nombre, marca, modelo;
        double precio = 0.0;
        double iva = 0.0;
        //- Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Que tipo de beneficio recibe el cliente? (Servicio/Producto):");
        String answer = sc.nextLine().toLowerCase();

        //-Producto|Servicio
        Products producto;
        Services servicio;
        switch (answer) {
            case "producto":
                System.out.println("Rellene los datos del Producto por favor:");
                System.out.print("->Codigo: ");
                codigo = sc.nextLine();
                System.out.print("->Nombre: ");
                nombre = sc.nextLine();
                System.out.print("->Marca: ");
                marca = sc.nextLine();
                System.out.print("->Modelo: ");
                modelo = sc.nextLine();
                System.out.print("->Precio: ");
                precio = sc.nextDouble();
                System.out.print("->IVA: ");
                iva = sc.nextDouble();
                producto = new Products(codigo, nombre, marca, modelo, precio, iva);
                break;
            case "servicio":
                System.out.println("Rellene los datos del Servicio por favor:");
                System.out.print("->Codigo: ");
                codigo = sc.nextLine();
                System.out.print("->Nombre: ");
                nombre = sc.nextLine();
                System.out.print("->Precio: ");
                precio = sc.nextDouble();
                System.out.print("->IVA: ");
                iva = sc.nextDouble();
                servicio = new Services(codigo, nombre, precio, iva);
                break;
            default:
                System.out.print("Me temo que esa no es una opción. Por favor introduzca un servicio o producto.");
        }

        //-Cliente
        String codigoC, nombreC, direccionPostalC, poblacionC, provinciaC, emailC, telefonoC, cif, apellidoC, dni;

        System.out.print("¿Quién es el cliente?(Autonomo/Sociedad):");
        String answer2 = sc.nextLine().toLowerCase();
        answer2 = sc.nextLine().toLowerCase();


        Client autonomo = null;
        Client sociedad = null;
        switch (answer2) {
            case "autonomo":
                System.out.println("Rellene los datos del cliente Autónomo por favor:");
                System.out.print("->Código: ");
                codigoC = sc.nextLine();
                System.out.print("->Nombre: ");
                nombreC = sc.nextLine();
                System.out.print("->Apellido: ");
                apellidoC = sc.nextLine();
                System.out.print("->DNI: ");
                dni = sc.nextLine();
                System.out.print("->Dirección Postal: ");
                direccionPostalC = sc.nextLine();
                System.out.print("->Población: ");
                poblacionC = sc.nextLine();
                System.out.print("->Provincia: ");
                provinciaC = sc.nextLine();
                System.out.print("->Email: ");
                emailC = sc.nextLine();
                System.out.print("->Telefono: ");
                telefonoC = sc.nextLine();
                autonomo = new Self_Employed(codigoC, nombreC, apellidoC, dni, direccionPostalC, poblacionC, provinciaC, emailC, telefonoC);
                break;
            case "sociedad":
                System.out.println("Rellene los datos del cliente Autónomo por favor:");
                System.out.print("->Código: ");
                codigoC = sc.nextLine();
                System.out.print("->Nombre: ");
                nombreC = sc.nextLine();
                System.out.print("->CIF: ");
                cif = sc.nextLine();
                System.out.print("->Dirección Postal: ");
                direccionPostalC = sc.nextLine();
                System.out.print("->Población: ");
                poblacionC = sc.nextLine();
                System.out.print("->Provincia: ");
                provinciaC = sc.nextLine();
                System.out.print("->Email: ");
                emailC = sc.nextLine();
                System.out.print("->Telefono: ");
                telefonoC = sc.nextLine();
                sociedad = new Partnerships(codigoC, nombreC, cif, direccionPostalC, poblacionC, provinciaC, emailC, telefonoC);
            default:
                System.out.println("Me temo que esa no es una opción. Por favor especifique Autonomo o Sociedad.");
        }

        String codigoB, fecha;
        double tasa = 0;
        double total = precio + iva;
        System.out.println("Rellene los datos de la Factura por favor:");
        System.out.print("->Codigo: ");
        codigoB = sc.nextLine();
        System.out.print("->Fecha: ");
        fecha = sc.nextLine();
        System.out.print("->Tasa: ");
        tasa = sc.nextDouble();
        System.out.println("->Total: " + total);
        Bill factura = new Bill(codigoB, fecha, tasa, total);
        //Factura ticket

        System.out.println("------------------------------------------------------------------------");
        System.out.println(">Factura: " + factura.toString());
        if (answer.equals("producto") & answer2.equals("autonomo"))
            System.out.print(">Cliente: " + autonomo.toString() + " | total= " + total);
        else System.out.print(">Cliente: " + sociedad.toString() + " | total= " + total);
    }
}