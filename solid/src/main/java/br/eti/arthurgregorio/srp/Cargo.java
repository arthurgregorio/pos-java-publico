package br.eti.arthurgregorio.srp;

public enum Cargo {
    ANALISTA {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.06;
        }
    },
    DESENVOLVEDOR {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.01;
        }
    },
    GERENTE {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.08;
        }
    },
    CEO {
        @Override
        public double calculaBonificacao(double salarioBase) {
            return salarioBase * 0.1;
        }
    },
    ESTAGIARIO,
    APRENDIZ;

    public double calculaBonificacao(double salarioBase) {
        return 0;
    }
}
