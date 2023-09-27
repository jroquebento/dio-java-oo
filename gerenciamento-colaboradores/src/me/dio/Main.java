package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereço para essa rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco(
             "Rua funcionário", 
     "Complemento endereço funcionário", 
          "Bairro funcionário");

        System.out.println("-------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Roberto Vendedor");
        vendedor.setDocumento("987.654.321-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calcularBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-------");
        
        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa(
            "Maria Op Caixa",
       "123.456.789-00",
    2000d,
                 endereco);
        System.out.println(operadorDeCaixa);
        System.out.println("-------");

        Gerente gerente = new Gerente();
        gerente.setNome("Gerson Gerente");
        gerente.setDocumento("789.456.235-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calcularBonificacao(3d);

        System.out.println(gerente);
    }
}
