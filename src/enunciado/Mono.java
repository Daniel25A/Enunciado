
package enunciado;

/**
 *
 * @author Oscar
 */
public class Mono {
       int RequeriLength=12;
       int MinDate=1930, MaxDate=2020;
       String Female="M", Male="H";
       String ZoneUser="";
       int[] Sum=new int[4];
       int Suma=0;
       int Bandera;
       public void DescifrarDatos(String Texto,String Name){
           String MsgError="Error, El Codigo No Cumple los Requisitos";
           if(Texto.isEmpty() || (Texto.length()<RequeriLength || Texto.length()>RequeriLength)){
               System.err.println(MsgError + " Longitud");
               return;
           }
           String Data=Texto.substring(0,4);
           if(!VerificarNumero(Data)){
                System.err.println(MsgError + " Fecha" );
               return;
           }
           int Date=Integer.parseInt(Data)>=MinDate && 
                   Integer.parseInt(Data)<=MaxDate?Integer.parseInt(Data):-1;
           if(Date==-1){
                System.err.println(MsgError+" Fecha");
                return;
           }
           String SexoSigno=Texto.substring(4,5 );
           System.out.println(SexoSigno);
           if(!SexoSigno.equalsIgnoreCase(Male) && !SexoSigno.equalsIgnoreCase(Female)){
                System.err.println(MsgError+ " Sexo");
               return;
           }
           String genero=SexoSigno.equalsIgnoreCase(Male)?"Hombre":"Mujer";
           ZoneUser= Texto.substring(5,5+3);
           String Flags=Texto.substring(8,Texto.length());
           for (int i = 0; i < Flags.length(); i++) {
               Sum[i]=Integer.parseInt(String.valueOf(Flags.charAt(i)));
               if(i==1)Bandera=Sum[i];
           }
           for(int x:Sum){
               Suma+=x;
           }
           int Temp=Bandera;
           for (int i = 0; i < Sum.length; i++) {
               if(i==0){
                  Sum[i]=Suma;
                  continue;
               }
               Sum[i]=Suma+Bandera;
               Bandera+=Temp;
           }
           String FinalValue="";
           for(int x:Sum){
               FinalValue+=String.valueOf(x);
           }
           System.out.println(FinalValue);
       }
       public boolean  VerificarNumero(String Data){
          Boolean IsNumber=true;
           try{
               Integer.parseInt(Data);
           }catch(NumberFormatException ex){
               IsNumber=false;
           }
           return IsNumber;
       }
}
