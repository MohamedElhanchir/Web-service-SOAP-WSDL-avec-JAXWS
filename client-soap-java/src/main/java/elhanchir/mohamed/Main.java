package elhanchir.mohamed;

import proxy.BanqueService;
import proxy.BanqueWS;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting client...");
        BanqueService banqueService = new BanqueWS().getBanqueServicePort();
        System.out.println(banqueService.conversionEuroToDh(100));
        System.out.println("_________________________________________");
        System.out.println(banqueService.getCompte(1).getSolde());
        System.out.println("_________________________________________");
        banqueService.getComptes().forEach(c -> {
            System.out.println("_________________________________________");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());
        });
        System.out.println("End client...");
    }
}