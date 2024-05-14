package com.ruiz.app.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")  //esto es lo equivalente al @WebServlet("/dhdh/hhh")
public class C1 {
	

	
	@PostMapping
	public static List<Integer> secuenciaCollatz(@RequestHeader(name ="numSecuenciaCollatz") Integer Numero){
		List<Integer> secuenciaCollatzdeNumero= new ArrayList<>();
		secuenciaCollatzdeNumero.add(Numero);
        do{
            if((Numero%2)==0){
                Numero=Numero/2;
                secuenciaCollatzdeNumero.add(Numero);
            }
            else{
                Numero=(Numero*3)+1;
                secuenciaCollatzdeNumero.add(Numero);
            }
        }while(Numero!=1);
        return secuenciaCollatzdeNumero;
	}
	
	@PostMapping("/fizzbuzz")
	public static List<String> FizzBuzz(@RequestHeader(name ="numFizzBuzz") Integer N){
		List<String> secuenciaFizzBuzz= new ArrayList<>();
		for (int i=1;i<=N;i++){
            if( ((i%3)==0) && ((i%5)==0)){
            	secuenciaFizzBuzz.add(i+" "+"FizzBuzz");
            }else if((i%3)==0){
            	secuenciaFizzBuzz.add(i+" "+"Fizz");
            }
            else if((i%5)==0){
            	secuenciaFizzBuzz.add(i+" "+"Buzz");
            }
            else{
            	secuenciaFizzBuzz.add(i+" ");
            }
        }
		return secuenciaFizzBuzz;
	}
	
}
