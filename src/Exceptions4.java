import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
        try{
            run();
//        }catch (IOException | ParseException e){ // multi exception
//            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Any exception caught");
        } catch (ParseException){ // ParseException handled by Exception catching
            System.out.println("Will never be executed");
        }



    }

    public static void run() throws IOException, ParseException, IllegalArgumentException
}
