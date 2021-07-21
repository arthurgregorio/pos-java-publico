package br.eti.arthurgregorio.fazerpolenta;

import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {
        final Aplicacao aplicacao = new Aplicacao();
        aplicacao.executar();
    }

    private void executar() {

        // criamos um tacho
        final var tacho = new Tacho();

        // criamos 3 polenteiras que vão se revezar na hora de mexer a polenta, repare que todas usam o mesmo tacho
        final var polenteiras = List.of(
                new Polenteira("Tia Maria", tacho),
                new Polenteira("Tia Vanda", tacho),
                new Polenteira("Vó Silvana", tacho));

        polenteiras.forEach(Polenteira::iniciar); // manda elas mexerem a polenta

        // monitora, quando houver um numero X de mexidas, para o processo
        final Thread monitora = new Thread(() -> this.verificaSeTaBom(tacho, polenteiras, 50));
        monitora.start();
    }

    private void verificaSeTaBom(Tacho tacho, List<Polenteira> polenteiras, int mexidasPraFicarBom) {

        while (tacho.getTotalMexidas() < mexidasPraFicarBom) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                System.err.println("Impossivel monitorar, a thread foi interrompida...");
                System.exit(1);
            }
        }
        polenteiras.forEach(Polenteira::parar);
        System.out.printf("A polenta levou %s mexidas para ficar pronta", tacho.getTotalMexidas()).println();
    }
}
