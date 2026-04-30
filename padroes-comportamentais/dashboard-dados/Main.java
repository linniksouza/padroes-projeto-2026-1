public class Main {

    public static void main(String[] args) {
        // DataImporter dataImporter = new JsonDataImporter("base_secreta.json");
        DataImporter dataImporter = new CsvDataImporter("base_secreta.csv");

        boolean sucesso = dataImporter.manipularDados();
        if(sucesso){
            System.out.println("Base de dados atualizada com sucesso.");
        }else{
            System.out.println("Houve um erro ao tentar atualizar a base de dados.");
        }
    }
}
