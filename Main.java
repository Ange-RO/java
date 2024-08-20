public class Main {
    public static void main (String[] args) {
//    byte aByte = 1;
//     short aShort = 10 ;
//     int anInt = 400 ;
//     long aLong = 2525 ;
//     float aFloat = 236259 ;
//     double aDouble = 20.50 ;
//     char aChar = 'p' ;
//     boolean aBoolean = true ;


// System.out.println("Taille de byte : " + Byte.BYTES + " octets");
// System.out.println("Taille de short : " + Short.BYTES + " octets");
// System.out.println("Taille de int : " + Integer.BYTES + " octets");
// System.out.println("Taille de long : " + Long.BYTES + " octets");
// System.out.println("Taille de float : " + Float.BYTES + " octets");
// System.out.println("Taille de double : " + Double.BYTES + " octets");
// System.out.println("Taille de char : " + Character.BYTES + " octets");
// System.out.println("Taille de boolean : " + Integer.BYTES + " octets");

// String str1 = "how";
// String str2 = " far";
// String str3 = str1 + str2 ;
// System.out.println(str3);

// boolean compare = str1 == str2;
// System.out.println(compare);

// int a = 2;
// int b = a + 4;
// int c = b * 6;

// boolean comp = a > b && b < c ;
// System.out.println(comp);

// int  intVar = 15;
// double doubleVar =  intVar;
// System.out.println(doubleVar);

// short shortVar = (short)doubleVar;
// System.out.println(shortVar);

// int x = 10;
// float y = (float)x;
// // boolean verif = x == y;
// String verif = (x == y)? "expressionVrai" : "expressionFausse";
// System.out.println(verif);


int age = 13;
if (age >=0 && <= 12) {
  System.out.println("Enfant");
} else if (age > 12 && <= 19) {
  System.out.println("Adolescent");
}  else if (age >19 && <= 64) {
  System.out.println("Adulte");
} else if (age >64) {
  System.out.println("Sénior");
}else{
    System.out.println("categories inexistante");

}




cond(2);
compare(5,10,8);

int montant = 500 ;
int remise = 0 ;
if (montant > 500) {
remise = (montant *20)/100 ;
montant = montant - remise ;
System.out.println(montant);
}else if(montant >=100){
  remise = (montant *10)/100 ;
montant = montant - remise ;
System.out.println(montant);
}else{
  System.out.println(montant);
}

double note = 10;
String verif = (note > 50)? "Reussi" : "Echoué";
System.out.println(verif);
 }

public static void cond (int nbr) {
int reste = nbr %2;
String result = (reste == 0) ? nbr + " est pair" : nbr + " est impair"  ;
System.out.println(result);

}
public static void compare (double a, double b, double c){
double max;
if( a > b){
  if (a > c) {
    max = a;
    }else{
        max = c;
    } 
}else{
    if(b > c){
        max = b;
    }else{
        max = c;
    }
}
System.out.println("Le plus grand nombre est : " + max);
}

}


