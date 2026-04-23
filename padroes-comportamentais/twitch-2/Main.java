import java.time.ZonedDateTime;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perfil perfil = new PerfilConcreto();

        perfil.adicionar(new SeguidorConcreto("seguidor-1"));
        perfil.adicionar(new SeguidorConcreto("seguidor-2"));
        perfil.adicionar(new SeguidorConcreto("seguidor-3"));

        while(true){
            System.out.print("Digite o titulo e o conteudo de um post para publicar, separado por barra: ");
            String entrada = sc.nextLine();
            String[] entradaQuebrada = entrada.split("\\|");
            Post post = new Post(entradaQuebrada[0], entradaQuebrada[1], ZonedDateTime.now());

            System.out.println("\n");
            perfil.notificar(post);

            System.out.println("\n\n");
        }
    }
}
