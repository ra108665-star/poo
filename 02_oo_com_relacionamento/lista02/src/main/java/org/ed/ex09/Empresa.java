package org.ed.ex09;

public class Empresa {
    private String razaoSocial;
    private String nomeFantasia;
    private CNPJ cnpj;

    public Empresa(String razaoSocial, String nomeFantasia, CNPJ cnpj) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public void exibirEmpresa() {
        System.out.println("Razão social: " + razaoSocial);
        System.out.println("Nome fantasia: " + nomeFantasia);
        cnpj.dados();
    }
}
