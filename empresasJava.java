/**
 * @author: Marcelo Yévenes Moreno
 * @version: 1.0 04 de diciembre del 2020
 */

public class empresasJava {

    public static void main(String[] args) {

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
        int paramSatisfaccion = 3;
        int paramCalidad = 3;
        int paramResponde = 1;
        int paramComunicacion = 1;
        int paramPrecio = 1;
        int paramAccion = 1;

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
         
            //-----Empresa 1(matrizValores[i][0]==1)-----
            
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
          
        }

        System.out.println(contadorComunicacionAltaEmpresa1);
        System.out.println(contadorComunicacionBajaEmpresa1);
        System.out.println(contadorCalidadBajaEmpresa1);

         /* 
       
         * //Cielo matrizFrecuenciaSi[0][0] = contadorSoleadoSi;
         * matrizFrecuenciaSi[1][0] = contadorNubladoSi; matrizFrecuenciaSi[2][0] =
         * contadorLluviosSi;
         * 
         * //Temperatura matrizFrecuenciaSi[0][1] = contadorCalorSi;
         * matrizFrecuenciaSi[1][1] = contadorTempladoSi; matrizFrecuenciaSi[2][1] =
         * contadorFrioSi;
         * 
         * //Humedad matrizFrecuenciaSi[0][2] = contadorAltaSi; matrizFrecuenciaSi[1][2]
         * = contadorNormalSi;
         * 
         * //Viento matrizFrecuenciaSi[0][3] = contadorHayVientoSi;
         * matrizFrecuenciaSi[1][3] = contadorNoHayVientoSi;
         * 
         * System.out.println("------------------------------------------");
         * System.out.println("Tabla de frecuencia de si se juega:"); for (i = 0; i < 3;
         * i++) { for (j = 0; j < 4; j++) { System.out.printf("%f ",
         * matrizFrecuenciaSi[i][j]); } System.out.print("\n"); }
         * 
         * // -----No se juega-----
         * 
         * //Cielo matrizFrecuenciaNo[0][0] = contadorSoleadoNo;
         * matrizFrecuenciaNo[1][0] = contadorNubladoNo; matrizFrecuenciaNo[2][0] =
         * contadorLluviosNo;
         * 
         * //Temperatura matrizFrecuenciaNo[0][1] = contadorCalorNo;
         * matrizFrecuenciaNo[1][1] = contadorTempladoNo; matrizFrecuenciaNo[2][1] =
         * contadorFrioNo;
         * 
         * //Humedad matrizFrecuenciaNo[0][2] = contadorAltaNo; matrizFrecuenciaNo[1][2]
         * = contadorNormalNo;
         * 
         * //Viento matrizFrecuenciaNo[0][3] = contadorHayVientoNo;
         * matrizFrecuenciaNo[1][3] = contadorNoHayVientoNo;
         * 
         * System.out.println("------------------------------------------");
         * System.out.println("Tabla de frecuencia de no se juega:"); for (i = 0; i < 3;
         * i++) { for (j = 0; j < 4; j++) { System.out.printf("%f ",
         * matrizFrecuenciaNo[i][j]); } System.out.print("\n"); }
         * 
         * /*Comprobar si las matrices tienen algun valor 0 en caso que alguna tenga un
         * valor 0 se debe normalizar la matriz
         */
        /*
         * Boolean valorCeroSiJuega = encontrarValorCero(matrizFrecuenciaSi); Boolean
         * valorCeroNoJuega = encontrarValorCero(matrizFrecuenciaNo);
         * 
         * //Se deben normalizar las matrices de frecuencia si se encuentra un 0;
         * if(valorCeroSiJuega){
         * System.out.println("------------------------------------------");
         * System.out.println("Matriz normalizada para si se juega"); for (i = 0; i < 3;
         * i++) { for (j = 0; j < 4; j++) { matrizFrecuenciaSi[i][j]+=1;
         * System.out.printf("%f ", matrizFrecuenciaSi[i][j]); } System.out.print("\n");
         * } }
         * 
         * if(valorCeroNoJuega){
         * System.out.println("------------------------------------------");
         * System.out.println("Matriz normalizada para no se juega"); for (i = 0; i < 3;
         * i++) { for (j = 0; j < 4; j++) { matrizFrecuenciaNo[i][j]+=1;
         * System.out.printf("%f ", matrizFrecuenciaNo[i][j]); } System.out.print("\n");
         * } }
         * 
         * /*Se debe obtener la suma de una columna de ambas matrices para obtener la
         * probabilidades respectivas para cada evento
         */

        /*
         * double sumColMatrizSi = sumColumnas(matrizFrecuenciaSi); double
         * sumColMatrizNo = sumColumnas(matrizFrecuenciaNo);
         * 
         * System.out.println("------------------------------------------"); //Matriz de
         * probabilida para si
         * System.out.println("Matriz de probabilidad para si se juega"); for (i = 0; i
         * < 3; i++) { for (j = 0; j < 4; j++) { matrizProbabilidadSi[i][j] =
         * (matrizFrecuenciaSi[i][j])/(sumColMatrizSi); System.out.printf("%f ",
         * matrizProbabilidadSi[i][j]); } System.out.print("\n"); }
         * 
         * System.out.println("------------------------------------------"); //Matriz de
         * probabilida para no
         * System.out.println("Matriz de probabilidad para no se juega"); for (i = 0; i
         * < 3; i++) { for (j = 0; j < 4; j++) { matrizProbabilidadNo[i][j] =
         * (matrizFrecuenciaNo[i][j])/(sumColMatrizNo); System.out.printf("%f ",
         * matrizProbabilidadNo[i][j]); } System.out.print("\n"); }
         * 
         * //Determinar factor para si se juega double factorSiJuega =
         * determinarFactorProbabilidad(paramCielo, paramTemp, paramHumedad,
         * paramViento, matrizProbabilidadSi, probabilidadJugar);
         * 
         * //Determinar facctor para no se juega double factorNoJuega =
         * determinarFactorProbabilidad(paramCielo, paramTemp, paramHumedad,
         * paramViento, matrizProbabilidadNo, probabilidadJugar);
         * 
         * //Obtener la probabilidades respectivas double probabilidadFinalSiJuega =
         * ((factorSiJuega)/(factorSiJuega + factorNoJuega))*100; double
         * probabilidadFinalNoJuega = ((factorNoJuega)/(factorSiJuega +
         * factorNoJuega))*100;
         * 
         * System.out.println("------------------------------------------");
         * System.out.printf("Probabilida que si se juegue el partido %f porciento \n"
         * ,probabilidadFinalSiJuega);
         * System.out.printf("Probabilida que no se juegue el partido %f porciento \n"
         * ,probabilidadFinalNoJuega);
         * 
         * //Comparar y entregar el resultado final if(probabilidadFinalSiJuega >
         * probabilidadFinalNoJuega){
         * System.out.println("Finalmente, el partido se juega"); }else{
         * System.out.println("Finalmente, el partido no se juega"); }
         * 
         */

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

    public static double determinarFactorProbabilidad(int paramCielo, int paramTemp, int paramHumedad, int paramViento,
            double[][] matrizObjetivo, double probTotal) {

        double totalFactor;

        double probCielo = matrizObjetivo[paramCielo - 1][0];
        double probTemp = matrizObjetivo[paramTemp - 1][1];
        double probHumedad = matrizObjetivo[paramHumedad - 1][2];
        double probViento = matrizObjetivo[paramViento - 1][3];

        totalFactor = probCielo * probTemp * probHumedad * probViento * probTotal;
        return totalFactor;
    }

}