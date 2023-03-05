public class GalToLitTable {
    public static void main(String[] args) 
    {
    
        double liters, gallons;
        int counter;

        counter = 0;
        for(gallons =1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // Converte para litros
            System.out.println(gallons + " gallons is " 
                                + liters + "liters.");
        
        counter++;
        // A cada decima linha, exibe uma linha em branco
        if(counter == 10) {
            System.out.println();
            counter = 0; // Zera o contador de linha

            }
         }
    }
}
