/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Weam
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        users(1);
    }

    private static String users(int id) {
        ruba.NewWebService_Service service = new ruba.NewWebService_Service();
        ruba.NewWebService port = service.getNewWebServicePort();
        return port.users(id);
    }
    
}
