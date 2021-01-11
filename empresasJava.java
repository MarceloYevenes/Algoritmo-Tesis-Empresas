/**
 * @author: Marcelo Yévenes Moreno
 * @version: 1.0 04 de diciembre del 2020
 */

public class empresasJava {

    public static void main(String[] args) {

        /*
         * Parametros aceptados Satisfacción del cliente Alta: 1 Media: 2 Baja: 3
         * Calidad Alta: 1 Media: 2 Baja: 3 Responde necesidades del cliente Alta: 1
         * Baja: 2 Comunicación permanente Alta: 1 Baja: 2 Precio Alta: 1 Media: 2 Baja:
         * 3 Accion ranking Sube: 1 Se mantiene: 2 Baja: 3
         */

        /*
         * Esta matriz representa la tabla que se debe extraer de la base de datos que
         * por motivos practivos se utiliza una matriz para evitar utilizar una bd, se
         * usara una matriz de int para poder llenar cada valor según corresponda
         */

        // [Satisfaccion][Calidad][Res. necesidades del cliente][Comunicacion]
        // [Precio][Accíon en el ranking]
        int[][] matrizValores = { { 1, 1, 1, 1, 1, 1, 2 }, { 2, 2, 2, 2, 2, 2, 2 }, { 3, 2, 2, 2, 2, 3, 2 },
                { 4, 3, 3, 2, 2, 3, 2 }, { 1, 1, 1, 1, 1, 1, 2 }, { 2, 2, 2, 1, 2, 2, 2 }, { 3, 2, 3, 2, 2, 3, 3 },
                { 4, 3, 1, 2, 2, 2, 1 }, { 1, 1, 1, 1, 1, 1, 2 }, { 2, 3, 2, 2, 2, 2, 3 }, { 3, 2, 3, 1, 2, 2, 1 },
                { 4, 3, 3, 2, 2, 3, 2 }, };

        // Parámetros que debe indicar el usuario que serán los que quiere averiguar
        int paramSatisfaccion = 1; // Alta
        int paramCalidad = 1; // Alta
        int paramResponde = 2; // Baja
        int paramComunicacion = 1; // Alta
        int paramPrecio = 2; // Media
        int paramAccion = 1; // Sube

        // Probabilidad de Empresas
        int cantidadEmpresa1;
        int cantidadEmpresa2;
        int cantidadEmpresa3;
        int cantidadEmpresa4;

        int i, j;

        double probabilidadEmpresa1;
        double probabilidadEmpresa2;
        double probabilidadEmpresa3;
        double probabilidadEmpresa4;

        cantidadEmpresa1 = calcularCantidadEmpresa(matrizValores, 1);
        cantidadEmpresa2 = calcularCantidadEmpresa(matrizValores, 2);
        cantidadEmpresa3 = calcularCantidadEmpresa(matrizValores, 3);
        cantidadEmpresa4 = calcularCantidadEmpresa(matrizValores, 4);

        probabilidadEmpresa1 = Double.valueOf(cantidadEmpresa1) / Double.valueOf(matrizValores.length);
        probabilidadEmpresa2 = Double.valueOf(cantidadEmpresa2) / Double.valueOf(matrizValores.length);
        probabilidadEmpresa3 = Double.valueOf(cantidadEmpresa3) / Double.valueOf(matrizValores.length);
        probabilidadEmpresa4 = Double.valueOf(cantidadEmpresa4) / Double.valueOf(matrizValores.length);

        System.out.printf("La probabilidad actual que sea de la empresa1 es: %f \n", probabilidadEmpresa1);
        System.out.printf("La probabilidad actual que sea de la empresa2 es: %f \n", probabilidadEmpresa2);
        System.out.printf("La probabilidad actual que sea de la empresa3 es: %f \n", probabilidadEmpresa3);
        System.out.printf("La probabilidad actual que sea de la empresa4 es: %f \n", probabilidadEmpresa4);

        // matrices de frecuencia para empresas
        double[][] matrizFrecuenciaEmpresa1 = new double[3][6];
        double[][] matrizFrecuenciaEmpresa2 = new double[3][6];
        double[][] matrizFrecuenciaEmpresa3 = new double[3][6];
        double[][] matrizFrecuenciaEmpresa4 = new double[3][6];

        // Se llenan ambas matrices con 0 para evitar espacion con valores no definidos
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                matrizFrecuenciaEmpresa1[i][j] = 0.0;
                matrizFrecuenciaEmpresa2[i][j] = 0.0;
                matrizFrecuenciaEmpresa3[i][j] = 0.0;
                matrizFrecuenciaEmpresa4[i][j] = 0.0;
            }
        }

        // matrices de probabilidad
        double[][] matrizProbabilidadEmpresa1 = new double[3][6];
        double[][] matrizProbabilidadEmpresa2 = new double[3][6];
        double[][] matrizProbabilidadEmpresa3 = new double[3][6];
        double[][] matrizProbabilidadEmpresa4 = new double[3][6];

        // Satisfaccion Cliente - Empresa 1
        double contadorSatisfaccionAltaEmpresa1 = 0.0;
        double contadorSatisfaccionMediaEmpresa1 = 0.0;
        double contadorSatisfaccionBajaEmpresa1 = 0.0;

        // Satisfaccion Cliente - Empresa 2
        double contadorSatisfaccionAltaEmpresa2 = 0.0;
        double contadorSatisfaccionMediaEmpresa2 = 0.0;
        double contadorSatisfaccionBajaEmpresa2 = 0.0;

        // Satisfaccion Cliente - Empresa 3
        double contadorSatisfaccionAltaEmpresa3 = 0.0;
        double contadorSatisfaccionMediaEmpresa3 = 0.0;
        double contadorSatisfaccionBajaEmpresa3 = 0.0;

        // Satisfaccion Cliente - Empresa 4
        double contadorSatisfaccionAltaEmpresa4 = 0.0;
        double contadorSatisfaccionMediaEmpresa4 = 0.0;
        double contadorSatisfaccionBajaEmpresa4 = 0.0;

        // Calidad - Empresa 1
        double contadorCalidadAltaEmpresa1 = 0.0;
        double contadorCalidadMediaEmpresa1 = 0.0;
        double contadorCalidadBajaEmpresa1 = 0.0;

        // Calidad - Empresa 2
        double contadorCalidadAltaEmpresa2 = 0.0;
        double contadorCalidadMediaEmpresa2 = 0.0;
        double contadorCalidadBajaEmpresa2 = 0.0;

        // Calidad - Empresa 3
        double contadorCalidadAltaEmpresa3 = 0.0;
        double contadorCalidadMediaEmpresa3 = 0.0;
        double contadorCalidadBajaEmpresa3 = 0.0;

        // Calidad - Empresa 4
        double contadorCalidadAltaEmpresa4 = 0.0;
        double contadorCalidadMediaEmpresa4 = 0.0;
        double contadorCalidadBajaEmpresa4 = 0.0;

        // Responde - Empresa 1
        double contadorRespondeAltaEmpresa1 = 0.0;
        double contadorRespondeBajaEmpresa1 = 0.0;

        // Responde - Empresa 2
        double contadorRespondeAltaEmpresa2 = 0.0;
        double contadorRespondeBajaEmpresa2 = 0.0;

        // Responde - Empresa 3
        double contadorRespondeAltaEmpresa3 = 0.0;
        double contadorRespondeBajaEmpresa3 = 0.0;

        // Responde - Empresa 4
        double contadorRespondeAltaEmpresa4 = 0.0;
        double contadorRespondeBajaEmpresa4 = 0.0;

        // Comunicacion - Empresa 1
        double contadorComunicacionAltaEmpresa1 = 0.0;
        double contadorComunicacionBajaEmpresa1 = 0.0;

        // Comunicacion - Empresa 2
        double contadorComunicacionAltaEmpresa2 = 0.0;
        double contadorComunicacionBajaEmpresa2 = 0.0;

        // Comunicacion - Empresa 3
        double contadorComunicacionAltaEmpresa3 = 0.0;
        double contadorComunicacionBajaEmpresa3 = 0.0;

        // Comunicacion - Empresa 4
        double contadorComunicacionAltaEmpresa4 = 0.0;
        double contadorComunicacionBajaEmpresa4 = 0.0;

        // Precio Cliente - Empresa 1
        double contadorPrecioAltaEmpresa1 = 0.0;
        double contadorPrecioMediaEmpresa1 = 0.0;
        double contadorPrecioBajaEmpresa1 = 0.0;

        // Precio Cliente - Empresa 2
        double contadorPrecioAltaEmpresa2 = 0.0;
        double contadorPrecioMediaEmpresa2 = 0.0;
        double contadorPrecioBajaEmpresa2 = 0.0;

        // Precio Cliente - Empresa 3
        double contadorPrecioAltaEmpresa3 = 0.0;
        double contadorPrecioMediaEmpresa3 = 0.0;
        double contadorPrecioBajaEmpresa3 = 0.0;

        // Precio Cliente - Empresa 4
        double contadorPrecioAltaEmpresa4 = 0.0;
        double contadorPrecioMediaEmpresa4 = 0.0;
        double contadorPrecioBajaEmpresa4 = 0.0;

        // Accion Ranking Cliente - Empresa 1
        double contadorAccionRankinSubeEmpresa1 = 0.0;
        double contadorAccionRankingSeMantieneEmpresa1 = 0.0;
        double contadorAccionRankingBajaEmpresa1 = 0.0;

        // Accion Ranking Cliente - Empresa 2
        double contadorAccionRankinSubeEmpresa2 = 0.0;
        double contadorAccionRankingSeMantieneEmpresa2 = 0.0;
        double contadorAccionRankingBajaEmpresa2 = 0.0;

        // Accion Ranking Cliente - Empresa 3
        double contadorAccionRankinSubeEmpresa3 = 0.0;
        double contadorAccionRankingSeMantieneEmpresa3 = 0.0;
        double contadorAccionRankingBajaEmpresa3 = 0.0;

        // Accion Ranking Cliente - Empresa 4
        double contadorAccionRankinSubeEmpresa4 = 0.0;
        double contadorAccionRankingSeMantieneEmpresa4 = 0.0;
        double contadorAccionRankingBajaEmpresa4 = 0.0;

        for (i = 0; i < matrizValores.length; i++) {

            // -----Empresa 1(matrizValores[i][0]==1)-----

            // Satisfaccion - Alta
            if (matrizValores[i][1] == (1) && matrizValores[i][0] == (1)) {
                contadorSatisfaccionAltaEmpresa1++;
            }

            // Satisfaccion - Media
            if (matrizValores[i][1] == (2) && matrizValores[i][0] == (1)) {
                contadorSatisfaccionMediaEmpresa1++;
            }

            // Satisfaccion - Baja
            if (matrizValores[i][1] == (3) && matrizValores[i][0] == (1)) {
                contadorSatisfaccionBajaEmpresa1++;
            }

            // Calidad - Alta
            if (matrizValores[i][2] == (1) && matrizValores[i][0] == (1)) {
                contadorCalidadAltaEmpresa1++;
            }

            // Calidad - Media
            if (matrizValores[i][2] == (2) && matrizValores[i][0] == (1)) {
                contadorCalidadMediaEmpresa1++;
            }

            // Calidad - Baja
            if (matrizValores[i][2] == (3) && matrizValores[i][0] == (1)) {
                contadorCalidadBajaEmpresa1++;
            }

            // Responde - Alta
            if (matrizValores[i][3] == (1) && matrizValores[i][0] == (1)) {
                contadorRespondeAltaEmpresa1++;
            }

            // Responde - Baja
            if (matrizValores[i][3] == (2) && matrizValores[i][0] == (1)) {
                contadorRespondeBajaEmpresa1++;
            }

            // Comunicacion - Alta
            if (matrizValores[i][4] == (1) && matrizValores[i][0] == (1)) {
                contadorComunicacionAltaEmpresa1++;
            }

            // Comunicacion - Baja
            if (matrizValores[i][4] == (2) && matrizValores[i][0] == (1)) {
                contadorComunicacionBajaEmpresa1++;
            }

            // Precio - Alta
            if (matrizValores[i][5] == (1) && matrizValores[i][0] == (1)) {
                contadorPrecioAltaEmpresa1++;
            }

            // Precio - Media
            if (matrizValores[i][5] == (2) && matrizValores[i][0] == (1)) {
                contadorPrecioMediaEmpresa1++;
            }

            // Precio - Baja
            if (matrizValores[i][5] == (3) && matrizValores[i][0] == (1)) {
                contadorPrecioBajaEmpresa1++;
            }

            // Accion - Alta
            if (matrizValores[i][6] == (1) && matrizValores[i][0] == (1)) {
                contadorAccionRankinSubeEmpresa1++;
            }

            // Accion - Media
            if (matrizValores[i][6] == (2) && matrizValores[i][0] == (1)) {
                contadorAccionRankingSeMantieneEmpresa1++;
            }

            // Accion - Baja
            if (matrizValores[i][6] == (3) && matrizValores[i][0] == (1)) {
                contadorAccionRankingBajaEmpresa1++;
            }

            // -----Empresa 2(matrizValores[i][0]==2)-----

            // Satisfaccion - Alta
            if (matrizValores[i][1] == (1) && matrizValores[i][0] == (2)) {
                contadorSatisfaccionAltaEmpresa2++;
            }

            // Satisfaccion - Media
            if (matrizValores[i][1] == (2) && matrizValores[i][0] == (2)) {
                contadorSatisfaccionMediaEmpresa2++;
            }

            // Satisfaccion - Baja
            if (matrizValores[i][1] == (3) && matrizValores[i][0] == (2)) {
                contadorSatisfaccionBajaEmpresa2++;
            }

            // Calidad - Alta
            if (matrizValores[i][2] == (1) && matrizValores[i][0] == (2)) {
                contadorCalidadAltaEmpresa2++;
            }

            // Calidad - Media
            if (matrizValores[i][2] == (2) && matrizValores[i][0] == (2)) {
                contadorCalidadMediaEmpresa2++;
            }

            // Calidad - Baja
            if (matrizValores[i][2] == (3) && matrizValores[i][0] == (2)) {
                contadorCalidadBajaEmpresa2++;
            }

            // Responde - Alta
            if (matrizValores[i][3] == (1) && matrizValores[i][0] == (2)) {
                contadorRespondeAltaEmpresa2++;
            }

            // Responde - Baja
            if (matrizValores[i][3] == (2) && matrizValores[i][0] == (2)) {
                contadorRespondeBajaEmpresa2++;
            }

            // Comunicacion - Alta
            if (matrizValores[i][4] == (1) && matrizValores[i][0] == (2)) {
                contadorComunicacionAltaEmpresa2++;
            }

            // Comunicacion - Baja
            if (matrizValores[i][4] == (2) && matrizValores[i][0] == (2)) {
                contadorComunicacionBajaEmpresa2++;
            }

            // Precio - Alta
            if (matrizValores[i][5] == (1) && matrizValores[i][0] == (2)) {
                contadorPrecioAltaEmpresa2++;
            }

            // Precio - Media
            if (matrizValores[i][5] == (2) && matrizValores[i][0] == (2)) {
                contadorPrecioMediaEmpresa2++;
            }

            // Precio - Baja
            if (matrizValores[i][5] == (3) && matrizValores[i][0] == (2)) {
                contadorPrecioBajaEmpresa2++;
            }

            // Accion - Alta
            if (matrizValores[i][6] == (1) && matrizValores[i][0] == (2)) {
                contadorAccionRankinSubeEmpresa2++;
            }

            // Accion - Media
            if (matrizValores[i][6] == (2) && matrizValores[i][0] == (2)) {
                contadorAccionRankingSeMantieneEmpresa2++;
            }

            // Accion - Baja
            if (matrizValores[i][6] == (3) && matrizValores[i][0] == (2)) {
                contadorAccionRankingBajaEmpresa2++;
            }

            // -----Empresa 3(matrizValores[i][0]==3)-----

            // Satisfaccion - Alta
            if (matrizValores[i][1] == (1) && matrizValores[i][0] == (3)) {
                contadorSatisfaccionAltaEmpresa3++;
            }

            // Satisfaccion - Media
            if (matrizValores[i][1] == (2) && matrizValores[i][0] == (3)) {
                contadorSatisfaccionMediaEmpresa3++;
            }

            // Satisfaccion - Baja
            if (matrizValores[i][1] == (3) && matrizValores[i][0] == (3)) {
                contadorSatisfaccionBajaEmpresa3++;
            }

            // Calidad - Alta
            if (matrizValores[i][2] == (1) && matrizValores[i][0] == (3)) {
                contadorCalidadAltaEmpresa3++;
            }

            // Calidad - Media
            if (matrizValores[i][2] == (2) && matrizValores[i][0] == (3)) {
                contadorCalidadMediaEmpresa3++;
            }

            // Calidad - Baja
            if (matrizValores[i][2] == (3) && matrizValores[i][0] == (3)) {
                contadorCalidadBajaEmpresa3++;
            }

            // Responde - Alta
            if (matrizValores[i][3] == (1) && matrizValores[i][0] == (3)) {
                contadorRespondeAltaEmpresa3++;
            }

            // Responde - Baja
            if (matrizValores[i][3] == (2) && matrizValores[i][0] == (3)) {
                contadorRespondeBajaEmpresa3++;
            }

            // Comunicacion - Alta
            if (matrizValores[i][4] == (1) && matrizValores[i][0] == (3)) {
                contadorComunicacionAltaEmpresa3++;
            }

            // Comunicacion - Baja
            if (matrizValores[i][4] == (2) && matrizValores[i][0] == (3)) {
                contadorComunicacionBajaEmpresa3++;
            }

            // Precio - Alta
            if (matrizValores[i][5] == (1) && matrizValores[i][0] == (3)) {
                contadorPrecioAltaEmpresa3++;
            }

            // Precio - Media
            if (matrizValores[i][5] == (2) && matrizValores[i][0] == (3)) {
                contadorPrecioMediaEmpresa3++;
            }

            // Precio - Baja
            if (matrizValores[i][5] == (3) && matrizValores[i][0] == (3)) {
                contadorPrecioBajaEmpresa3++;
            }

            // Accion - Alta
            if (matrizValores[i][6] == (1) && matrizValores[i][0] == (3)) {
                contadorAccionRankinSubeEmpresa3++;
            }

            // Accion - Media
            if (matrizValores[i][6] == (2) && matrizValores[i][0] == (3)) {
                contadorAccionRankingSeMantieneEmpresa3++;
            }

            // Accion - Baja
            if (matrizValores[i][6] == (3) && matrizValores[i][0] == (3)) {
                contadorAccionRankingBajaEmpresa3++;
            }

            // -----Empresa 4(matrizValores[i][0]==4)-----
            // Satisfaccion - Alta
            if (matrizValores[i][1] == (1) && matrizValores[i][0] == (4)) {
                contadorSatisfaccionAltaEmpresa4++;
            }

            // Satisfaccion - Media
            if (matrizValores[i][1] == (2) && matrizValores[i][0] == (4)) {
                contadorSatisfaccionMediaEmpresa4++;
            }

            // Satisfaccion - Baja
            if (matrizValores[i][1] == (3) && matrizValores[i][0] == (4)) {
                contadorSatisfaccionBajaEmpresa4++;
            }

            // Calidad - Alta
            if (matrizValores[i][2] == (1) && matrizValores[i][0] == (4)) {
                contadorCalidadAltaEmpresa4++;
            }

            // Calidad - Media
            if (matrizValores[i][2] == (2) && matrizValores[i][0] == (4)) {
                contadorCalidadMediaEmpresa4++;
            }

            // Calidad - Baja
            if (matrizValores[i][2] == (3) && matrizValores[i][0] == (4)) {
                contadorCalidadBajaEmpresa4++;
            }

            // Responde - Alta
            if (matrizValores[i][3] == (1) && matrizValores[i][0] == (4)) {
                contadorRespondeAltaEmpresa4++;
            }

            // Responde - Baja
            if (matrizValores[i][3] == (2) && matrizValores[i][0] == (4)) {
                contadorRespondeBajaEmpresa4++;
            }

            // Comunicacion - Alta
            if (matrizValores[i][4] == (1) && matrizValores[i][0] == (4)) {
                contadorComunicacionAltaEmpresa4++;
            }

            // Comunicacion - Baja
            if (matrizValores[i][4] == (2) && matrizValores[i][0] == (4)) {
                contadorComunicacionBajaEmpresa4++;
            }

            // Precio - Media
            if (matrizValores[i][5] == (1) && matrizValores[i][0] == (4)) {
                contadorPrecioAltaEmpresa4++;
            }

            // Precio - Media
            if (matrizValores[i][5] == (2) && matrizValores[i][0] == (4)) {
                contadorPrecioMediaEmpresa4++;
            }

            // Precio - Baja
            if (matrizValores[i][5] == (3) && matrizValores[i][0] == (4)) {
                contadorPrecioBajaEmpresa4++;
            }

            // Accion - Alta
            if (matrizValores[i][6] == (1) && matrizValores[i][0] == (4)) {
                contadorAccionRankinSubeEmpresa4++;
            }

            // Accion - Media
            if (matrizValores[i][6] == (2) && matrizValores[i][0] == (4)) {
                contadorAccionRankingSeMantieneEmpresa4++;
            }

            // Accion - Baja
            if (matrizValores[i][6] == (3) && matrizValores[i][0] == (4)) {
                contadorAccionRankingBajaEmpresa4++;
            }

        }

        // Se llenan y muestran los datos de las tablas de frecuencia

        // Para empresa 1
        matrizFrecuenciaEmpresa1[0][0] = contadorSatisfaccionAltaEmpresa1;
        matrizFrecuenciaEmpresa1[1][0] = contadorSatisfaccionMediaEmpresa1;
        matrizFrecuenciaEmpresa1[2][0] = contadorSatisfaccionBajaEmpresa1;

        matrizFrecuenciaEmpresa1[0][1] = contadorCalidadAltaEmpresa1;
        matrizFrecuenciaEmpresa1[1][1] = contadorCalidadMediaEmpresa1;
        matrizFrecuenciaEmpresa1[2][1] = contadorCalidadBajaEmpresa1;

        matrizFrecuenciaEmpresa1[0][2] = contadorRespondeAltaEmpresa1;
        matrizFrecuenciaEmpresa1[1][2] = contadorRespondeBajaEmpresa1;

        matrizFrecuenciaEmpresa1[0][3] = contadorComunicacionAltaEmpresa1;
        matrizFrecuenciaEmpresa1[1][3] = contadorComunicacionBajaEmpresa1;

        matrizFrecuenciaEmpresa1[0][4] = contadorPrecioAltaEmpresa1;
        matrizFrecuenciaEmpresa1[1][4] = contadorPrecioMediaEmpresa1;
        matrizFrecuenciaEmpresa1[2][4] = contadorPrecioBajaEmpresa1;

        matrizFrecuenciaEmpresa1[0][5] = contadorAccionRankinSubeEmpresa1;
        matrizFrecuenciaEmpresa1[1][5] = contadorAccionRankingSeMantieneEmpresa1;
        matrizFrecuenciaEmpresa1[2][5] = contadorAccionRankingBajaEmpresa1;

        // Empresa 1
        System.out.println("------------------------------------------");
        System.out.println("Tabla de frecuencia de empresa 1:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                System.out.printf("%f ", matrizFrecuenciaEmpresa1[i][j]);
            }
            System.out.print("\n");
        }

        // Para empresa 2
        matrizFrecuenciaEmpresa2[0][0] = contadorSatisfaccionAltaEmpresa2;
        matrizFrecuenciaEmpresa2[1][0] = contadorSatisfaccionMediaEmpresa2;
        matrizFrecuenciaEmpresa2[2][0] = contadorSatisfaccionBajaEmpresa2;

        matrizFrecuenciaEmpresa2[0][1] = contadorCalidadAltaEmpresa2;
        matrizFrecuenciaEmpresa2[1][1] = contadorCalidadMediaEmpresa2;
        matrizFrecuenciaEmpresa2[2][1] = contadorCalidadBajaEmpresa2;

        matrizFrecuenciaEmpresa2[0][2] = contadorRespondeAltaEmpresa2;
        matrizFrecuenciaEmpresa2[1][2] = contadorRespondeBajaEmpresa2;

        matrizFrecuenciaEmpresa2[0][3] = contadorComunicacionAltaEmpresa2;
        matrizFrecuenciaEmpresa2[1][3] = contadorComunicacionBajaEmpresa2;

        matrizFrecuenciaEmpresa2[0][4] = contadorPrecioAltaEmpresa2;
        matrizFrecuenciaEmpresa2[1][4] = contadorPrecioMediaEmpresa2;
        matrizFrecuenciaEmpresa2[2][4] = contadorPrecioBajaEmpresa2;

        matrizFrecuenciaEmpresa2[0][5] = contadorAccionRankinSubeEmpresa2;
        matrizFrecuenciaEmpresa2[1][5] = contadorAccionRankingSeMantieneEmpresa2;
        matrizFrecuenciaEmpresa2[2][5] = contadorAccionRankingBajaEmpresa2;

        // Empresa 2
        System.out.println("------------------------------------------");
        System.out.println("Tabla de frecuencia de empresa 2:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                System.out.printf("%f ", matrizFrecuenciaEmpresa2[i][j]);
            }
            System.out.print("\n");
        }

        // Para empresa 3
        matrizFrecuenciaEmpresa3[0][0] = contadorSatisfaccionAltaEmpresa3;
        matrizFrecuenciaEmpresa3[1][0] = contadorSatisfaccionMediaEmpresa3;
        matrizFrecuenciaEmpresa3[2][0] = contadorSatisfaccionBajaEmpresa3;

        matrizFrecuenciaEmpresa3[0][1] = contadorCalidadAltaEmpresa3;
        matrizFrecuenciaEmpresa3[1][1] = contadorCalidadMediaEmpresa3;
        matrizFrecuenciaEmpresa3[2][1] = contadorCalidadBajaEmpresa3;

        matrizFrecuenciaEmpresa3[0][2] = contadorRespondeAltaEmpresa3;
        matrizFrecuenciaEmpresa3[1][2] = contadorRespondeBajaEmpresa3;

        matrizFrecuenciaEmpresa3[0][3] = contadorComunicacionAltaEmpresa3;
        matrizFrecuenciaEmpresa3[1][3] = contadorComunicacionBajaEmpresa3;

        matrizFrecuenciaEmpresa3[0][4] = contadorPrecioAltaEmpresa3;
        matrizFrecuenciaEmpresa3[1][4] = contadorPrecioMediaEmpresa3;
        matrizFrecuenciaEmpresa3[2][4] = contadorPrecioBajaEmpresa3;

        matrizFrecuenciaEmpresa3[0][5] = contadorAccionRankinSubeEmpresa3;
        matrizFrecuenciaEmpresa3[1][5] = contadorAccionRankingSeMantieneEmpresa3;
        matrizFrecuenciaEmpresa3[2][5] = contadorAccionRankingBajaEmpresa3;

        // Empresa 3
        System.out.println("------------------------------------------");
        System.out.println("Tabla de frecuencia de empresa 3:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                System.out.printf("%f ", matrizFrecuenciaEmpresa3[i][j]);
            }
            System.out.print("\n");
        }

        // Para empresa 4
        matrizFrecuenciaEmpresa4[0][0] = contadorSatisfaccionAltaEmpresa4;
        matrizFrecuenciaEmpresa4[1][0] = contadorSatisfaccionMediaEmpresa4;
        matrizFrecuenciaEmpresa4[2][0] = contadorSatisfaccionBajaEmpresa4;

        matrizFrecuenciaEmpresa4[0][1] = contadorCalidadAltaEmpresa4;
        matrizFrecuenciaEmpresa4[1][1] = contadorCalidadMediaEmpresa4;
        matrizFrecuenciaEmpresa4[2][1] = contadorCalidadBajaEmpresa4;

        matrizFrecuenciaEmpresa4[0][2] = contadorRespondeAltaEmpresa4;
        matrizFrecuenciaEmpresa4[1][2] = contadorRespondeBajaEmpresa4;

        matrizFrecuenciaEmpresa4[0][3] = contadorComunicacionAltaEmpresa4;
        matrizFrecuenciaEmpresa4[1][3] = contadorComunicacionBajaEmpresa4;

        matrizFrecuenciaEmpresa4[0][4] = contadorPrecioAltaEmpresa4;
        matrizFrecuenciaEmpresa4[1][4] = contadorPrecioMediaEmpresa4;
        matrizFrecuenciaEmpresa4[2][4] = contadorPrecioBajaEmpresa4;

        matrizFrecuenciaEmpresa4[0][5] = contadorAccionRankinSubeEmpresa4;
        matrizFrecuenciaEmpresa4[1][5] = contadorAccionRankingSeMantieneEmpresa4;
        matrizFrecuenciaEmpresa4[2][5] = contadorAccionRankingBajaEmpresa4;

        // Empresa 4
        System.out.println("------------------------------------------");
        System.out.println("Tabla de frecuencia de empresa 4:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                System.out.printf("%f ", matrizFrecuenciaEmpresa4[i][j]);
            }
            System.out.print("\n");
        }

        // Comprobar si las matrices tienen algun valor 0 en caso que alguna tenga un
        // valor 0 se debe normalizar la matriz

        Boolean valorCeroEmpresa1 = encontrarValorCero(matrizFrecuenciaEmpresa1);
        Boolean valorCeroEmpresa2 = encontrarValorCero(matrizFrecuenciaEmpresa2);
        Boolean valorCeroEmpresa3 = encontrarValorCero(matrizFrecuenciaEmpresa3);
        Boolean valorCeroEmpresa4 = encontrarValorCero(matrizFrecuenciaEmpresa4);

        // Se deben normalizar las matrices de frecuencia si se encuentra un 0;
        if (valorCeroEmpresa1) {
            System.out.println("------------------------------------------");
            System.out.println("Matriz normalizada empresa 1");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 6; j++) {
                    matrizFrecuenciaEmpresa1[i][j] += 1;
                    System.out.printf("%f ", matrizFrecuenciaEmpresa1[i][j]);
                }
                System.out.print("\n");
            }
        }

        if (valorCeroEmpresa2) {
            System.out.println("------------------------------------------");
            System.out.println("Matriz normalizada empresa 2");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 6; j++) {
                    matrizFrecuenciaEmpresa2[i][j] += 1;
                    System.out.printf("%f ", matrizFrecuenciaEmpresa2[i][j]);
                }
                System.out.print("\n");
            }
        }

        if (valorCeroEmpresa3) {
            System.out.println("------------------------------------------");
            System.out.println("Matriz normalizada empresa 3");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 6; j++) {
                    matrizFrecuenciaEmpresa3[i][j] += 1;
                    System.out.printf("%f ", matrizFrecuenciaEmpresa3[i][j]);
                }
                System.out.print("\n");
            }
        }

        if (valorCeroEmpresa4) {
            System.out.println("------------------------------------------");
            System.out.println("Matriz normalizada empresa 4");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 6; j++) {
                    matrizFrecuenciaEmpresa4[i][j] += 1;
                    System.out.printf("%f ", matrizFrecuenciaEmpresa4[i][j]);
                }
                System.out.print("\n");
            }
        }

        /*
         * Se debe obtener la suma de una columna de ambas matrices para obtener la
         * probabilidades respectivas para cada evento
         */
        double sumColMatrizEmpresa1 = sumColumnas(matrizFrecuenciaEmpresa1);
        double sumColMatrizEmpresa2 = sumColumnas(matrizFrecuenciaEmpresa2);
        double sumColMatrizEmpresa3 = sumColumnas(matrizFrecuenciaEmpresa3);
        double sumColMatrizEmpresa4 = sumColumnas(matrizFrecuenciaEmpresa4);

        System.out.println("------------------------------------------");

        // Matriz de probabilida para Empresa 1
        System.out.println("Matriz de probabilidad para empresa 1");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                matrizProbabilidadEmpresa1[i][j] = (matrizFrecuenciaEmpresa1[i][j]) / (sumColMatrizEmpresa1);
                System.out.printf("%f ", matrizProbabilidadEmpresa1[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("------------------------------------------");

        // Matriz de probabilida para Empresa 2
        System.out.println("Matriz de probabilidad para empresa 2");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                matrizProbabilidadEmpresa2[i][j] = (matrizFrecuenciaEmpresa2[i][j]) / (sumColMatrizEmpresa2);
                System.out.printf("%f ", matrizProbabilidadEmpresa2[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("------------------------------------------");

        // Matriz de probabilida para Empresa 3
        System.out.println("Matriz de probabilidad para empresa 3");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                matrizProbabilidadEmpresa3[i][j] = (matrizFrecuenciaEmpresa3[i][j]) / (sumColMatrizEmpresa3);
                System.out.printf("%f ", matrizProbabilidadEmpresa3[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("------------------------------------------");

        // Matriz de probabilida para Empresa 4
        System.out.println("Matriz de probabilidad para empresa 4");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                matrizProbabilidadEmpresa4[i][j] = (matrizFrecuenciaEmpresa4[i][j]) / (sumColMatrizEmpresa4);
                System.out.printf("%f ", matrizProbabilidadEmpresa4[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("------------------------------------------");

        // Determinar factor para Empresa 1
        double factorEmpresa1 = determinarFactorProbabilidad(paramSatisfaccion, paramCalidad, paramResponde,
                paramComunicacion, paramPrecio, paramAccion, matrizProbabilidadEmpresa1, probabilidadEmpresa1);

        double factorEmpresa2 = determinarFactorProbabilidad(paramSatisfaccion, paramCalidad, paramResponde,
                paramComunicacion, paramPrecio, paramAccion, matrizProbabilidadEmpresa2, probabilidadEmpresa2);

        double factorEmpresa3 = determinarFactorProbabilidad(paramSatisfaccion, paramCalidad, paramResponde,
                paramComunicacion, paramPrecio, paramAccion, matrizProbabilidadEmpresa3, probabilidadEmpresa3);

        double factorEmpresa4 = determinarFactorProbabilidad(paramSatisfaccion, paramCalidad, paramResponde,
                paramComunicacion, paramPrecio, paramAccion, matrizProbabilidadEmpresa4, probabilidadEmpresa4);

     

        double sumaTotalFactores = factorEmpresa1 + factorEmpresa2 + factorEmpresa3 + factorEmpresa4;      

        double probabilidadFinalEmpresa1 = (factorEmpresa1/sumaTotalFactores)*100;
        double probabilidadFinalEmpresa2 = (factorEmpresa2/sumaTotalFactores)*100;
        double probabilidadFinalEmpresa3 = (factorEmpresa3/sumaTotalFactores)*100;
        double probabilidadFinalEmpresa4 = (factorEmpresa4/sumaTotalFactores)*100;


        System.out.printf("Probabilidad de que pertenezcan a empresa 1: %f porciento \n", probabilidadFinalEmpresa1);
        System.out.printf("Probabilidad de que pertenezcan a empresa 2: %f porciento \n", probabilidadFinalEmpresa2);
        System.out.printf("Probabilidad de que pertenezcan a empresa 3: %f porciento \n", probabilidadFinalEmpresa3);
        System.out.printf("Probabilidad de que pertenezcan a empresa 4: %f porciento \n", probabilidadFinalEmpresa4);
        
        

    }

    // Funcion que calcula la cantidad de partidos jugados
    public static int calcularCantidadEmpresa(int[][] matrizDatos, int empresaBuscar) {
        int cantidadEmpresa = 0;
        for (int i = 0; i < matrizDatos.length; i++) {
            if (matrizDatos[i][0] == empresaBuscar) {
                cantidadEmpresa++;
            }
        }
        return cantidadEmpresa;
    }

    public static boolean encontrarValorCero(double[][] matrizObjetivo) {
        int row, colum;
        for (row = 0; row < matrizObjetivo.length; row++) {
            for (colum = 0; colum < matrizObjetivo[row].length; colum++) {
                if (matrizObjetivo[row][colum] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double sumColumnas(double[][] matrizObjetivo) {
        int row;
        double total = 0.0;
        for (row = 0; row < matrizObjetivo.length; row++) {
            total += matrizObjetivo[row][0];
        }
        return total;
    }

    public static double determinarFactorProbabilidad(int paramSatisfaccion, int paramCalidad, int paramResponde,
            int paramComunicacion, int paramPrecio, int paramAccion, double[][] matrizObjetivo, double probTotal) {

        double totalFactor;

        double proSatisfaccion = matrizObjetivo[paramSatisfaccion - 1][0];
        double probCalidad = matrizObjetivo[paramCalidad - 1][1];
        double probResponde = matrizObjetivo[paramResponde - 1][2];
        double probComunicacion = matrizObjetivo[paramComunicacion - 1][3];
        double probPrecio = matrizObjetivo[paramPrecio - 1][4];
        double probAccion = matrizObjetivo[paramAccion - 1][5];

        totalFactor = proSatisfaccion * probCalidad * probResponde * probComunicacion * probPrecio * probAccion
                * probTotal;
        return totalFactor;
    }

}