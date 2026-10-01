package com.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Average {

    @WebMethod
    double calculateAverage(int m1, int m2, int m3, int m4);
}