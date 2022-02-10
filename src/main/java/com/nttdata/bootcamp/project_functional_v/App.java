package com.nttdata.bootcamp.project_functional_v;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
   // creando lista
   List<String> lista = new ArrayList<String>();
   
   // agregando articulos a la lista
   lista.add("pc");lista.add("xbox");lista.add("ps5");

   
   List<String> lis = lista.stream().filter(p->p.endsWith("x")).collect(Collectors.toList());
  
   System.out.println(lis);
   
   DoubleStream st = DoubleStream.of(9.9, 2.3, 1.4).map(p->p + 3.6);
   st.forEach(System.out::println);
   
   
    }
}
