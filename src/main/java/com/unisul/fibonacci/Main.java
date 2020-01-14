package com.unisul.fibonacci;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Marcia
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Integer> sequenciaFibonacci = obterSequenciaFibonacci(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da sequência a retornar:")));
       
        for(int i = 0; i < sequenciaFibonacci.size(); i++){
            System.out.println(sequenciaFibonacci.get(i));
        }
      
        
        System.out.println(obtemSomatorioDaElavacaoDosPares(sequenciaFibonacci));
        
    }
    
    
    //1,1,2,3,5,8,13
    /** metodo para calcular sequencia fibonacci
     * 
     * @param n
     * @return 
     */
    public static List<Integer> obterSequenciaFibonacci(Integer n){
        List<Integer> sequencia = new ArrayList();
        //Faz um looping na quantidade de números que o usuário informou  que quer na sequencia
        for(int i = 0; i < n; i++){
            
            //Se a posição que vamos iterar for menor do que 2, retorna 1 pra não sair fora da lista
            if(i < 2) {
                sequencia.add(1);
            } else {
                //Se for maior que dois, ele faz a logica de diminuir as posições
                //Pega o valor da posição duas atras
                int posicaoDuasAtras = sequencia.get(i - 2);
                //Pega o valor da posicao uma atras
                int posicaoUmaAtras = sequencia.get(i - 1);
                //Soma os dois valores e coloca na lista
                sequencia.add(posicaoDuasAtras + posicaoUmaAtras);
            }
        }
        
        return sequencia;
    }
    
    /**metodo para obter somatoria dos numeros pares da sequencia fibonacci 
     * 
     * @param lista
     * @return 
     */
    public static Integer obtemSomatorioDaElavacaoDosPares(List<Integer> lista){
        Integer somatorio = 0;
        
        for(int i = 0; i < lista.size(); i++){
           if(lista.get(i) % 2 == 0){
             somatorio +=  (lista.get(i) * lista.get(i));
           
           }
            
        }
        
        return somatorio;
    }
    
}
