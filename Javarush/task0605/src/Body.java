public class Body {
    public static void getIMB(double kg, double l){
        double imb = kg / (l * l);
        if(imb < 18.5){System.out.print("Недовес: меньше чем 18.5");}
        else if(imb >= 30){System.out.print("Ожирение: 30 или больше");}
        else if(25 <= imb && imb <= 29.9){System.out.print("Избыточный вес: между 25 и 29.9");}
        else{System.out.print("Нормальный: между 18.5 и 24.9");}
    }
}
