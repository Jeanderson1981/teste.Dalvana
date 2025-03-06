import java.util.ArrayList;
import java.util.List;

public class pedidos {

    private List<hamburguer> hamburguers = new ArrayList<>();

    private double descontoCupon;

    public void adicionarHamburguerc(hamburguer hamburguer) {

        hamburguers.add(hamburguer);
    }

    public void aplicarDescontoCupon(String codigoCupon) {

        if (codigoCupon.equals("Cupom5")) {
            descontoCupon = 5;
        } else if (codigoCupon.equals("Cupom10")) {
            descontoCupon = 10;
        }
    }

    public double calcularTotal(){//calcula total pedido
    double total  = 0 ;
        //soma os preços dos hamburguers
        for (hamburguer hamburguer:hamburguers){
         total+= hamburguer.getPreco();//add preço de cada hamburguer
        }

        total-= descontoCupon; //subtrai valor dos descontos

        //pedindo varios hamburgueres
        if (hamburguers.size()>=3){
            total-=5;

        }
        return  total; // retorna total metodo ja com os descontos
    }

    public List <hamburguer> getHamburguers() {
        return hamburguers;
    }

        public double getdescontoCupon (){
            return  descontoCupon;
        }
    }
}


