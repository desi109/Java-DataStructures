public class Main {

    public static void main(String[] args) {
        String input, output;
        
        while (true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString(); // read a string from kbd
            if (input.equals("")) // quit if [Enter]
                break;
            
// make a Reverser
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev(); // use it
            
            System.out.println("Reversed: " + output);
        } // end while
    } // end main()

    //--------------------------------------------------------------
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String s = br.readLine();
        return s;
    }
//--------------------------------------------------------------
}
////////////////////////////////////////////////////////////////
