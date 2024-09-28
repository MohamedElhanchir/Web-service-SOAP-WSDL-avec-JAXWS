package elhanchir.mohamed;

import elhanchir.mohamed.ws.BanqueService;
import jakarta.xml.ws.Endpoint;

public class SserverJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:9098/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service started at: " + url);

    }
}