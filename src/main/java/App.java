public class App {

    public static void main(String[] arg){
        GradConverter converter = new GradConverter();
        for (int i = 0;i<105;i++){
            System.out.println(i+";"+converter.convert(i));
        }
    }
}
