package lesson6;

public class MethodReturnType {
    /*
    1.domainNmme
    2. SSL
    3. domain(.dot, .com)
     */
    public static void main(String[] args) {
        buildPageUrl(true, "sdetpro", "com");
        prinSth(null);
    }
    public static String buildPageUrl(boolean isSSL, String domainName, String domain){
        String urlPrefix = "https";
        if(isSSL) urlPrefix = "https";
        String pageUrl = urlPrefix.concat("://").concat(domainName).concat(".").concat(domain);
        //System.out.println(pageUrl);
        return pageUrl;
    }
    public static void prinSth(String msg){
        if(null == msg){
            return;

        } else
            System.out.println(msg);
        System.out.println("Hello World");
    }
}
