package com.epam.testtalk;
import lombok.extern.slf4j.Slf4j;
/**
 * Aguascalientes Talk
 * 
 */
@Slf4j
public class AguasTalk {
    public static void main(String[] args) {
        AguasTalk ags = new AguasTalk();
        ags.SayHello();
        ags.SayGoodbye();
    }
    public void SayHello(){
        System.out.println("Hola Aguascalientes!");
    }
    public void SayGoodbye(){
        System.out.println("Adios Aguascalientes!");
    }
}