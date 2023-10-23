public class cmToInches {
    public static void main(String[] args){
        int cm = 184;
        int feet = (int) (cm * 0.0328);
        double inches = (cm*0.3937);
        System.out.print(feet+" "+(inches-feet*12));
    }
}
