public class Main {
    
    public static void main(String[] args) {
        Controller req = new Controller(new AutenticadorResolver());

        try{
            String res = req.action("Request 1", Api.API_D);
            System.out.println(res);
        }catch(IllegalArgumentException e){
            System.out.println("Bad Request");
            System.err.println(e);
        }
    }
}
