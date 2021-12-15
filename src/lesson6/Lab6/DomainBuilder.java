package lesson6.Lab6;

import lesson6.DomainType;
import lesson6.SSL_Type;

//Single Responsibility
public class DomainBuilder {
    public static String buildURL(String domainName, SSL_Type ssl_type, DomainType domainType){
        String urlPrefix;
        String finalDomainType;
        urlPrefix = getUrlPrefix(ssl_type);
        finalDomainType = getFinalDomainType(domainType);

        return urlPrefix.concat("://").concat(domainName).concat(finalDomainType);
    }

    private static String getUrlPrefix(SSL_Type ssl_type) {
        String urlPrefix = "";
        switch (ssl_type){
            case TRUE:
                urlPrefix = "https";
                break;
            case FALSE:
                urlPrefix = "http";
        }
        return urlPrefix;
    }

    private static String getFinalDomainType(DomainType domainType) {
        String finalDomainType = "";
        if (domainType == null){
            throw new IllegalArgumentException("Domain type can not be null");
        }
        else
            finalDomainType= domainType.getValue();
//        switch (domainType){
//            case COM:
//                finalDomainType = ".com";
//                break;
//            case NET:
//                finalDomainType = ".net";
//                break;
//            case AI:
//                finalDomainType = ".ai";
//                break;
//            case IO:
//                finalDomainType = ".io";
//                break;
//            default:
//                System.out.println("Domain type is incorrect");
//        }
        return finalDomainType;
    }

    public static void main(String[] args) {
        System.out.println(DomainBuilder.buildURL("sdetpro", SSL_Type.TRUE, DomainType.COM));
    }
}
